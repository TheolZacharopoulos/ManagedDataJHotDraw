/*
 * @(#)LocatorConnector.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.standard;

import CH.ifa.draw.framework.Connector;
import CH.ifa.draw.framework.Figure;
import CH.ifa.draw.framework.Locator;
import CH.ifa.draw.util.StorableInput;
import CH.ifa.draw.util.StorableOutput;
import ccconcerns.managed_data.factories.MDGeometryFactory;
import ccconcerns.managed_data.schemas.geometry.MDRectangle;

import java.awt.*;
import java.io.IOException;

/**
 * A LocatorConnector locates connection points with
 * the help of a Locator. It supports the definition
 * of connection points to semantic locations.
 *
 * @see Locator
 * @see Connector
 *
 * @version <$CURRENT_VERSION$>
 */
public class LocatorConnector extends AbstractConnector {

	/**
	 * The standard size of the connector. The display box
	 * is centered around the located point.
	 */
	public static final int SIZE = 8;

	private Locator  myLocator;

	/*
	 * Serialization support.
	 */
	private static final long serialVersionUID = 5062833203337604181L;
	private int locatorConnectorSerializedDataVersion = 1;

	public LocatorConnector() { // only used for Storable
		setLocator(null);
	}

	public LocatorConnector(Figure owner, Locator l) {
		super(owner);
		setLocator(l);
	}

	/**
	 * Tests if a point is contained in the connector.
	 */
	public boolean containsPoint(int x, int y) {
		return displayBox().contains(x, y);
	}

	/**
	 * Gets the display box of the connector.
	 */
	public MDRectangle displayBox() {
		Point p = getLocator().locate(owner());
		return MDGeometryFactory.newRectangle(
				p.x - SIZE / 2,
				p.y - SIZE / 2,
				SIZE,
				SIZE);
	}

	/**
	 * Draws this connector.
	 */
	public void draw(Graphics g) {
		MDRectangle r = displayBox();

		g.setColor(Color.blue);
		g.fillOval(r.x(), r.y(), r.width(), r.height());
		g.setColor(Color.black);
		g.drawOval(r.x(), r.y(), r.width(), r.height());
	}

	/**
	 * Stores the arrow tip to a StorableOutput.
	 */
	public void write(StorableOutput dw) {
		super.write(dw);
		dw.writeStorable(getLocator());
	}

	/**
	 * Reads the arrow tip from a StorableInput.
	 */
	public void read(StorableInput dr) throws IOException {
		super.read(dr);
		setLocator((Locator)dr.readStorable());
	}

	protected void setLocator(Locator newLocator) {
		myLocator = newLocator;
	}

	public Locator getLocator() {
		return myLocator;
	}
}
