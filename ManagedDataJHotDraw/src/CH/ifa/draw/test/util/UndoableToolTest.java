package CH.ifa.draw.test.util;

// JUnitDoclet begin import

import CH.ifa.draw.contrib.DiamondFigure;
import CH.ifa.draw.standard.CreationTool;
import CH.ifa.draw.standard.PasteCommand;
import CH.ifa.draw.test.JHDTestCase;
import CH.ifa.draw.util.UndoableTool;
// JUnitDoclet end import

/*
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/


// JUnitDoclet begin javadoc_class

/**
* TestCase UndoableToolTest is generated by
* JUnitDoclet to hold the tests for UndoableTool.
* @see CH.ifa.draw.util.UndoableTool
*/
// JUnitDoclet end javadoc_class
public class UndoableToolTest
// JUnitDoclet begin extends_implements
extends JHDTestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.util.UndoableTool undoabletool = null;
  // JUnitDoclet end class

  /**
  * Constructor UndoableToolTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public UndoableToolTest(String name) {
    // JUnitDoclet begin method UndoableToolTest
    super(name);
    // JUnitDoclet end method UndoableToolTest
  }

  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.util.UndoableTool createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.util.UndoableTool(new UndoableTool(new CreationTool(getDrawingEditor(), new DiamondFigure())));
    // JUnitDoclet end method testcase.createInstance
  }

  /**
  * Method setUp is overwriting the framework method to
  * prepare an instance of this TestCase for a single test.
  * It's called from the JUnit framework only.
  */
  protected void setUp() throws Exception {
    // JUnitDoclet begin method testcase.setUp
    super.setUp();
    undoabletool = createInstance();
    // JUnitDoclet end method testcase.setUp
  }

  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    undoabletool = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }

  // JUnitDoclet begin javadoc_method activate()
  /**
  * Method testActivate is testing activate
  * @see CH.ifa.draw.util.UndoableTool#activate()
  */
  // JUnitDoclet end javadoc_method activate()
  public void testActivate() throws Exception {
    // JUnitDoclet begin method activate
    // JUnitDoclet end method activate
  }

  // JUnitDoclet begin javadoc_method deactivate()
  /**
  * Method testDeactivate is testing deactivate
  * @see CH.ifa.draw.util.UndoableTool#deactivate()
  */
  // JUnitDoclet end javadoc_method deactivate()
  public void testDeactivate() throws Exception {
    // JUnitDoclet begin method deactivate
    // JUnitDoclet end method deactivate
  }

  // JUnitDoclet begin javadoc_method mouseDown()
  /**
  * Method testMouseDown is testing mouseDown
  * @see CH.ifa.draw.util.UndoableTool#mouseDown(java.awt.event.MouseEvent, int, int)
  */
  // JUnitDoclet end javadoc_method mouseDown()
  public void testMouseDown() throws Exception {
    // JUnitDoclet begin method mouseDown
    // JUnitDoclet end method mouseDown
  }

  // JUnitDoclet begin javadoc_method mouseDrag()
  /**
  * Method testMouseDrag is testing mouseDrag
  * @see CH.ifa.draw.util.UndoableTool#mouseDrag(java.awt.event.MouseEvent, int, int)
  */
  // JUnitDoclet end javadoc_method mouseDrag()
  public void testMouseDrag() throws Exception {
    // JUnitDoclet begin method mouseDrag
    // JUnitDoclet end method mouseDrag
  }

  // JUnitDoclet begin javadoc_method mouseUp()
  /**
  * Method testMouseUp is testing mouseUp
  * @see CH.ifa.draw.util.UndoableTool#mouseUp(java.awt.event.MouseEvent, int, int)
  */
  // JUnitDoclet end javadoc_method mouseUp()
  public void testMouseUp() throws Exception {
    // JUnitDoclet begin method mouseUp
    // JUnitDoclet end method mouseUp
  }

  // JUnitDoclet begin javadoc_method mouseMove()
  /**
  * Method testMouseMove is testing mouseMove
  * @see CH.ifa.draw.util.UndoableTool#mouseMove(java.awt.event.MouseEvent, int, int)
  */
  // JUnitDoclet end javadoc_method mouseMove()
  public void testMouseMove() throws Exception {
    // JUnitDoclet begin method mouseMove
    // JUnitDoclet end method mouseMove
  }

  // JUnitDoclet begin javadoc_method keyDown()
  /**
  * Method testKeyDown is testing keyDown
  * @see CH.ifa.draw.util.UndoableTool#keyDown(java.awt.event.KeyEvent, int)
  */
  // JUnitDoclet end javadoc_method keyDown()
  public void testKeyDown() throws Exception {
    // JUnitDoclet begin method keyDown
    // JUnitDoclet end method keyDown
  }

  // JUnitDoclet begin javadoc_method isActive()
  /**
  * Method testIsActive is testing isActive
  * @see CH.ifa.draw.util.UndoableTool#isActive()
  */
  // JUnitDoclet end javadoc_method isActive()
  public void testIsActive() throws Exception {
    // JUnitDoclet begin method isActive
    // JUnitDoclet end method isActive
  }

  // JUnitDoclet begin javadoc_method setUsable()
  /**
  * Method testSetIsUsable is testing setUsable
  * and isUsable together by setting some value
  * and verifying it by reading.
  * @see CH.ifa.draw.util.UndoableTool#setUsable(boolean)
  * @see CH.ifa.draw.util.UndoableTool#isUsable()
  */
  // JUnitDoclet end javadoc_method setUsable()
  public void testSetIsUsable() throws Exception {
    // JUnitDoclet begin method setUsable isUsable
    boolean[] tests = {true, false};

    for (int i = 0; i < tests.length; i++) {
      undoabletool.setUsable(tests[i]);
      assertEquals(tests[i], undoabletool.isUsable());
    }
    // JUnitDoclet end method setUsable isUsable
  }

  // JUnitDoclet begin javadoc_method setEnabled()
  /**
  * Method testSetIsEnabled is testing setEnabled
  * and isEnabled together by setting some value
  * and verifying it by reading.
  * @see CH.ifa.draw.util.UndoableTool#setEnabled(boolean)
  * @see CH.ifa.draw.util.UndoableTool#isEnabled()
  */
  // JUnitDoclet end javadoc_method setEnabled()
  public void testSetIsEnabled() throws Exception {
    // JUnitDoclet begin method setEnabled isEnabled
    boolean[] tests = {true, false};

    for (int i = 0; i < tests.length; i++) {
      undoabletool.setEnabled(tests[i]);
      assertEquals(tests[i], undoabletool.isEnabled());
    }
    // JUnitDoclet end method setEnabled isEnabled
  }

  // JUnitDoclet begin javadoc_method editor()
  /**
  * Method testEditor is testing editor
  * @see CH.ifa.draw.util.UndoableTool#editor()
  */
  // JUnitDoclet end javadoc_method editor()
  public void testEditor() throws Exception {
    // JUnitDoclet begin method editor
    // JUnitDoclet end method editor
  }

  // JUnitDoclet begin javadoc_method view()
  /**
  * Method testView is testing view
  * @see CH.ifa.draw.util.UndoableTool#view()
  */
  // JUnitDoclet end javadoc_method view()
  public void testView() throws Exception {
    // JUnitDoclet begin method view
    // JUnitDoclet end method view
  }

  // JUnitDoclet begin javadoc_method setUndoActivity()
  /**
  * Method testSetGetUndoActivity is testing setUndoActivity
  * and getUndoActivity together by setting some value
  * and verifying it by reading.
  * @see CH.ifa.draw.util.UndoableTool#setUndoActivity(CH.ifa.draw.util.Undoable)
  * @see CH.ifa.draw.util.UndoableTool#getUndoActivity()
  */
  // JUnitDoclet end javadoc_method setUndoActivity()
  public void testSetGetUndoActivity() throws Exception {
    // JUnitDoclet begin method setUndoActivity getUndoActivity
    CH.ifa.draw.util.Undoable[] tests = {new PasteCommand.UndoActivity(getDrawingEditor().view()), null};

    for (int i = 0; i < tests.length; i++) {
      undoabletool.setUndoActivity(tests[i]);
      assertEquals(tests[i], undoabletool.getUndoActivity());
    }
    // JUnitDoclet end method setUndoActivity getUndoActivity
  }

  // JUnitDoclet begin javadoc_method toolUsable()
  /**
  * Method testToolUsable is testing toolUsable
  * @see CH.ifa.draw.util.UndoableTool#toolUsable(java.util.EventObject)
  */
  // JUnitDoclet end javadoc_method toolUsable()
  public void testToolUsable() throws Exception {
    // JUnitDoclet begin method toolUsable
    // JUnitDoclet end method toolUsable
  }

  // JUnitDoclet begin javadoc_method toolUnusable()
  /**
  * Method testToolUnusable is testing toolUnusable
  * @see CH.ifa.draw.util.UndoableTool#toolUnusable(java.util.EventObject)
  */
  // JUnitDoclet end javadoc_method toolUnusable()
  public void testToolUnusable() throws Exception {
    // JUnitDoclet begin method toolUnusable
    // JUnitDoclet end method toolUnusable
  }

  // JUnitDoclet begin javadoc_method toolActivated()
  /**
  * Method testToolActivated is testing toolActivated
  * @see CH.ifa.draw.util.UndoableTool#toolActivated(java.util.EventObject)
  */
  // JUnitDoclet end javadoc_method toolActivated()
  public void testToolActivated() throws Exception {
    // JUnitDoclet begin method toolActivated
    // JUnitDoclet end method toolActivated
  }

  // JUnitDoclet begin javadoc_method toolDeactivated()
  /**
  * Method testToolDeactivated is testing toolDeactivated
  * @see CH.ifa.draw.util.UndoableTool#toolDeactivated(java.util.EventObject)
  */
  // JUnitDoclet end javadoc_method toolDeactivated()
  public void testToolDeactivated() throws Exception {
    // JUnitDoclet begin method toolDeactivated
    // JUnitDoclet end method toolDeactivated
  }

  // JUnitDoclet begin javadoc_method toolEnabled()
  /**
  * Method testToolEnabled is testing toolEnabled
  * @see CH.ifa.draw.util.UndoableTool#toolEnabled(java.util.EventObject)
  */
  // JUnitDoclet end javadoc_method toolEnabled()
  public void testToolEnabled() throws Exception {
    // JUnitDoclet begin method toolEnabled
    // JUnitDoclet end method toolEnabled
  }

  // JUnitDoclet begin javadoc_method toolDisabled()
  /**
  * Method testToolDisabled is testing toolDisabled
  * @see CH.ifa.draw.util.UndoableTool#toolDisabled(java.util.EventObject)
  */
  // JUnitDoclet end javadoc_method toolDisabled()
  public void testToolDisabled() throws Exception {
    // JUnitDoclet begin method toolDisabled
    // JUnitDoclet end method toolDisabled
  }

  // JUnitDoclet begin javadoc_method addToolListener()
  /**
  * Method testAddToolListener is testing addToolListener
  * @see CH.ifa.draw.util.UndoableTool#addToolListener(CH.ifa.draw.framework.ToolListener)
  */
  // JUnitDoclet end javadoc_method addToolListener()
  public void testAddToolListener() throws Exception {
    // JUnitDoclet begin method addToolListener
    // JUnitDoclet end method addToolListener
  }

  // JUnitDoclet begin javadoc_method removeToolListener()
  /**
  * Method testRemoveToolListener is testing removeToolListener
  * @see CH.ifa.draw.util.UndoableTool#removeToolListener(CH.ifa.draw.framework.ToolListener)
  */
  // JUnitDoclet end javadoc_method removeToolListener()
  public void testRemoveToolListener() throws Exception {
    // JUnitDoclet begin method removeToolListener
    // JUnitDoclet end method removeToolListener
  }

  // JUnitDoclet begin javadoc_method createEventDispatcher()
  /**
  * Method testCreateEventDispatcher is testing createEventDispatcher
  * @see CH.ifa.draw.util.UndoableTool#createEventDispatcher()
  */
  // JUnitDoclet end javadoc_method createEventDispatcher()
  public void testCreateEventDispatcher() throws Exception {
    // JUnitDoclet begin method createEventDispatcher
    // JUnitDoclet end method createEventDispatcher
  }

  // JUnitDoclet begin javadoc_method getActiveView()
  /**
  * Method testGetActiveView is testing getActiveView
  * @see CH.ifa.draw.util.UndoableTool#getActiveView()
  */
  // JUnitDoclet end javadoc_method getActiveView()
  public void testGetActiveView() throws Exception {
    // JUnitDoclet begin method getActiveView
    // JUnitDoclet end method getActiveView
  }
  
  
  
  // JUnitDoclet begin javadoc_method testVault
  /**
  * JUnitDoclet moves marker to this method, if there is not match
  * for them in the regenerated code and if the marker is not empty.
  * This way, no test gets lost when regenerating after renaming.
  * <b>Method testVault is supposed to be empty.</b>
  */
  // JUnitDoclet end javadoc_method testVault
  public void testVault() throws Exception {
    // JUnitDoclet begin method testcase.testVault
    // JUnitDoclet end method testcase.testVault
  }
  
  /**
  * Method to execute the TestCase from command line
  * using JUnit's textui.TestRunner .
  */
  public static void main(String[] args) {
    // JUnitDoclet begin method testcase.main
    junit.textui.TestRunner.run(UndoableToolTest.class);
    // JUnitDoclet end method testcase.main
  }
}
