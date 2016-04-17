package CH.ifa.draw.test.samples.net;

import junit.framework.TestCase;
// JUnitDoclet begin import
import CH.ifa.draw.samples.net.NodeFigure;
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
* TestCase NodeFigureTest is generated by
* JUnitDoclet to hold the tests for NodeFigure.
* @see CH.ifa.draw.samples.net.NodeFigure
*/
// JUnitDoclet end javadoc_class
public class NodeFigureTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.samples.net.NodeFigure nodefigure = null;
  // JUnitDoclet end class
  
  /**
  * Constructor NodeFigureTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public NodeFigureTest(String name) {
    // JUnitDoclet begin method NodeFigureTest
    super(name);
    // JUnitDoclet end method NodeFigureTest
  }
  
  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.samples.net.NodeFigure createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.samples.net.NodeFigure();
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
    nodefigure = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    nodefigure = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  // JUnitDoclet begin javadoc_method displayBox()
  /**
  * Method testDisplayBox is testing displayBox
  * @see CH.ifa.draw.samples.net.NodeFigure#displayBox()
  */
  // JUnitDoclet end javadoc_method displayBox()
  public void testDisplayBox() throws Exception {
    // JUnitDoclet begin method displayBox
    // JUnitDoclet end method displayBox
  }
  
  // JUnitDoclet begin javadoc_method containsPoint()
  /**
  * Method testContainsPoint is testing containsPoint
  * @see CH.ifa.draw.samples.net.NodeFigure#containsPoint(int, int)
  */
  // JUnitDoclet end javadoc_method containsPoint()
  public void testContainsPoint() throws Exception {
    // JUnitDoclet begin method containsPoint
    // JUnitDoclet end method containsPoint
  }
  
  // JUnitDoclet begin javadoc_method draw()
  /**
  * Method testDraw is testing draw
  * @see CH.ifa.draw.samples.net.NodeFigure#draw(java.awt.Graphics)
  */
  // JUnitDoclet end javadoc_method draw()
  public void testDraw() throws Exception {
    // JUnitDoclet begin method draw
    // JUnitDoclet end method draw
  }
  
  // JUnitDoclet begin javadoc_method handles()
  /**
  * Method testHandles is testing handles
  * @see CH.ifa.draw.samples.net.NodeFigure#handles()
  */
  // JUnitDoclet end javadoc_method handles()
  public void testHandles() throws Exception {
    // JUnitDoclet begin method handles
    // JUnitDoclet end method handles
  }
  
  // JUnitDoclet begin javadoc_method connectorVisibility()
  /**
  * Method testConnectorVisibility is testing connectorVisibility
  * @see CH.ifa.draw.samples.net.NodeFigure#connectorVisibility(boolean, CH.ifa.draw.framework.ConnectionFigure)
  */
  // JUnitDoclet end javadoc_method connectorVisibility()
  public void testConnectorVisibility() throws Exception {
    // JUnitDoclet begin method connectorVisibility
    // JUnitDoclet end method connectorVisibility
  }
  
  // JUnitDoclet begin javadoc_method connectorAt()
  /**
  * Method testConnectorAt is testing connectorAt
  * @see CH.ifa.draw.samples.net.NodeFigure#connectorAt(int, int)
  */
  // JUnitDoclet end javadoc_method connectorAt()
  public void testConnectorAt() throws Exception {
    // JUnitDoclet begin method connectorAt
    // JUnitDoclet end method connectorAt
  }
  
  // JUnitDoclet begin javadoc_method getRepresentingFigure()
  /**
  * Method testGetRepresentingFigure is testing getRepresentingFigure
  * @see CH.ifa.draw.samples.net.NodeFigure#getRepresentingFigure()
  */
  // JUnitDoclet end javadoc_method getRepresentingFigure()
  public void testGetRepresentingFigure() throws Exception {
    // JUnitDoclet begin method getRepresentingFigure
    // JUnitDoclet end method getRepresentingFigure
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
    junit.textui.TestRunner.run(NodeFigureTest.class);
    // JUnitDoclet end method testcase.main
  }
}
