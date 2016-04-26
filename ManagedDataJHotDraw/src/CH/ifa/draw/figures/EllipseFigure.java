/*
 * @(#)EllipseFigure.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.figures;

import CH.ifa.draw.framework.Connector;
import CH.ifa.draw.framework.HandleEnumeration;
import CH.ifa.draw.standard.BoxHandleKit;
import CH.ifa.draw.standard.HandleEnumerator;
import CH.ifa.draw.util.CollectionsFactory;
import CH.ifa.draw.util.StorableInput;
import CH.ifa.draw.util.StorableOutput;
import ccconcerns.managed_data.factories.MDGeometryFactory;
import ccconcerns.managed_data.schemas.geometry.MDRectangle;

import java.awt.*;
import java.io.IOException;
import java.util.List;

/**
 * An ellipse figure.
 *
 * @version <$CURRENT_VERSION$>
 */
public class EllipseFigure extends AttributeFigure {

	private Rectangle   fDisplayBox;

	/*
	 * Serialization support.
	 */
	private static final long serialVersionUID = -6856203289355118951L;
	private int ellipseFigureSerializedDataVersion = 1;

	public EllipseFigure() {
		this(new Point(0,0), new Point(0,0));
	}

	public EllipseFigure(Point origin, Point corner) {
		basicDisplayBox(origin,corner);
	}

	public HandleEnumeration handles() {
		List handles = CollectionsFactory.current().createList();
		BoxHandleKit.addHandles(this, handles);
		return new HandleEnumerator(handles);
	}

	public void basicDisplayBox(Point origin, Point corner) {
		fDisplayBox = new Rectangle(origin);
		fDisplayBox.add(corner);
	}

	public MDRectangle displayBox() {
		return MDGeometryFactory.newRectangle(
			fDisplayBox.x,
			fDisplayBox.y,
			fDisplayBox.width,
			fDisplayBox.height);
	}

	protected void basicMoveBy(int x, int y) {
		fDisplayBox.translate(x,y);
	}

	public void drawBackground(Graphics g) {
		MDRectangle r = displayBox();
		g.fillOval(r.x(), r.y(), r.width()-1, r.height()-1);
	}

	public void drawFrame(Graphics g) {
		MDRectangle r = displayBox();
		g.drawOval(r.x(), r.y(), r.width()-1, r.height()-1);
	}

	public Insets connectionInsets() {
		Rectangle r = fDisplayBox;
		int cx = r.width/2;
		int cy = r.height/2;
		return new Insets(cy, cx, cy, cx);
	}

	public Connector connectorAt(int x, int y) {
		return new ChopEllipseConnector(this);
	}

	public void write(StorableOutput dw) {
		super.write(dw);
		dw.writeInt(fDisplayBox.x);
		dw.writeInt(fDisplayBox.y);
		dw.writeInt(fDisplayBox.width);
		dw.writeInt(fDisplayBox.height);
	}

	public void read(StorableInput dr) throws IOException {
		super.read(dr);
		fDisplayBox = new Rectangle(
			dr.readInt(),
			dr.readInt(),
			dr.readInt(),
			dr.readInt());
	}
}
