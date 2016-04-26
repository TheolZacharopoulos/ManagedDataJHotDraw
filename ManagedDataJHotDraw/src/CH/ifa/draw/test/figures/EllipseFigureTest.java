package CH.ifa.draw.test.figures;

import junit.framework.TestCase;
// JUnitDoclet begin import

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
* TestCase EllipseFigureTest is generated by
* JUnitDoclet to hold the tests for EllipseFigure.
* @see CH.ifa.draw.figures.EllipseFigure
*/
// JUnitDoclet end javadoc_class
public class EllipseFigureTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.figures.EllipseFigure ellipsefigure = null;
  // JUnitDoclet end class

  /**
  * Constructor EllipseFigureTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public EllipseFigureTest(String name) {
    // JUnitDoclet begin method EllipseFigureTest
    super(name);
    // JUnitDoclet end method EllipseFigureTest
  }

  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.figures.EllipseFigure createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.figures.EllipseFigure();
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
    ellipsefigure = createInstance();
    // JUnitDoclet end method testcase.setUp
  }

  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    ellipsefigure = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }

  // JUnitDoclet begin javadoc_method handles()
  /**
  * Method testHandles is testing handles
  * @see CH.ifa.draw.figures.EllipseFigure#handles()
  */
  // JUnitDoclet end javadoc_method handles()
  public void testHandles() throws Exception {
    // JUnitDoclet begin method handles
    // JUnitDoclet end method handles
  }

  // JUnitDoclet begin javadoc_method basicDisplayBox()
  /**
  * Method testBasicDisplayBox is testing basicDisplayBox
  * @see CH.ifa.draw.figures.EllipseFigure#basicDisplayBox(java.awt.Point, java.awt.Point)
  */
  // JUnitDoclet end javadoc_method basicDisplayBox()
  public void testBasicDisplayBox() throws Exception {
    // JUnitDoclet begin method basicDisplayBox
    // JUnitDoclet end method basicDisplayBox
  }

  // JUnitDoclet begin javadoc_method displayBox()
  /**
  * Method testDisplayBox is testing displayBox
  * @see CH.ifa.draw.figures.EllipseFigure#displayBox()
  */
  // JUnitDoclet end javadoc_method displayBox()
  public void testDisplayBox() throws Exception {
    // JUnitDoclet begin method displayBox
    // JUnitDoclet end method displayBox
  }

  // JUnitDoclet begin javadoc_method drawBackground()
  /**
  * Method testDrawBackground is testing drawBackground
  * @see CH.ifa.draw.figures.EllipseFigure#drawBackground(java.awt.Graphics)
  */
  // JUnitDoclet end javadoc_method drawBackground()
  public void testDrawBackground() throws Exception {
    // JUnitDoclet begin method drawBackground
    // JUnitDoclet end method drawBackground
  }

  // JUnitDoclet begin javadoc_method drawFrame()
  /**
  * Method testDrawFrame is testing drawFrame
  * @see CH.ifa.draw.figures.EllipseFigure#drawFrame(java.awt.Graphics)
  */
  // JUnitDoclet end javadoc_method drawFrame()
  public void testDrawFrame() throws Exception {
    // JUnitDoclet begin method drawFrame
    // JUnitDoclet end method drawFrame
  }

  // JUnitDoclet begin javadoc_method connectionInsets()
  /**
  * Method testConnectionInsets is testing connectionInsets
  * @see CH.ifa.draw.figures.EllipseFigure#connectionInsets()
  */
  // JUnitDoclet end javadoc_method connectionInsets()
  public void testConnectionInsets() throws Exception {
    // JUnitDoclet begin method connectionInsets
    // JUnitDoclet end method connectionInsets
  }

  // JUnitDoclet begin javadoc_method connectorAt()
  /**
  * Method testConnectorAt is testing connectorAt
  * @see CH.ifa.draw.figures.EllipseFigure#connectorAt(int, int)
  */
  // JUnitDoclet end javadoc_method connectorAt()
  public void testConnectorAt() throws Exception {
    // JUnitDoclet begin method connectorAt
    // JUnitDoclet end method connectorAt
  }

  // JUnitDoclet begin javadoc_method write()
  /**
  * Method testWrite is testing write
  * @see CH.ifa.draw.figures.EllipseFigure#write(CH.ifa.draw.util.StorableOutput)
  */
  // JUnitDoclet end javadoc_method write()
  public void testWrite() throws Exception {
    // JUnitDoclet begin method write
    // JUnitDoclet end method write
  }

  // JUnitDoclet begin javadoc_method read()
  /**
  * Method testRead is testing read
  * @see CH.ifa.draw.figures.EllipseFigure#read(CH.ifa.draw.util.StorableInput)
  */
  // JUnitDoclet end javadoc_method read()
  public void testRead() throws Exception {
    // JUnitDoclet begin method read
    // JUnitDoclet end method read
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
    junit.textui.TestRunner.run(EllipseFigureTest.class);
    // JUnitDoclet end method testcase.main
  }
}
