/*
 * @(#)DesktopEventService.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.contrib;

import java.util.*;

/**
 * @author  C.L.Gilbert <dnoyeb@sourceforge.net>
 * @version <$CURRENT_VERSION$>
 */
public interface DesktopListener extends EventListener {
	public void drawingViewAdded(DesktopEvent dpe);
	public void drawingViewRemoved(DesktopEvent dpe);
	public void drawingViewSelected(DesktopEvent dpe);
}