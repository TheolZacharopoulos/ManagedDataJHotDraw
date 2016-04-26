package CH.ifa.draw.test.standard;

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
* TestCase LocatorConnectorTest is generated by
* JUnitDoclet to hold the tests for LocatorConnector.
* @see CH.ifa.draw.standard.LocatorConnector
*/
// JUnitDoclet end javadoc_class
public class LocatorConnectorTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.standard.LocatorConnector locatorconnector = null;
  // JUnitDoclet end class

  /**
  * Constructor LocatorConnectorTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public LocatorConnectorTest(String name) {
    // JUnitDoclet begin method LocatorConnectorTest
    super(name);
    // JUnitDoclet end method LocatorConnectorTest
  }

  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.standard.LocatorConnector createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.standard.LocatorConnector();
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
    locatorconnector = createInstance();
    // JUnitDoclet end method testcase.setUp
  }

  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    locatorconnector = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }

  // JUnitDoclet begin javadoc_method containsPoint()
  /**
  * Method testContainsPoint is testing containsPoint
  * @see CH.ifa.draw.standard.LocatorConnector#containsPoint(int, int)
  */
  // JUnitDoclet end javadoc_method containsPoint()
  public void testContainsPoint() throws Exception {
    // JUnitDoclet begin method containsPoint
    // JUnitDoclet end method containsPoint
  }

  // JUnitDoclet begin javadoc_method displayBox()
  /**
  * Method testDisplayBox is testing displayBox
  * @see CH.ifa.draw.standard.LocatorConnector#displayBox()
  */
  // JUnitDoclet end javadoc_method displayBox()
  public void testDisplayBox() throws Exception {
    // JUnitDoclet begin method displayBox
    // JUnitDoclet end method displayBox
  }

  // JUnitDoclet begin javadoc_method draw()
  /**
  * Method testDraw is testing draw
  * @see CH.ifa.draw.standard.LocatorConnector#draw(java.awt.Graphics)
  */
  // JUnitDoclet end javadoc_method draw()
  public void testDraw() throws Exception {
    // JUnitDoclet begin method draw
    // JUnitDoclet end method draw
  }

  // JUnitDoclet begin javadoc_method write()
  /**
  * Method testWrite is testing write
  * @see CH.ifa.draw.standard.LocatorConnector#write(CH.ifa.draw.util.StorableOutput)
  */
  // JUnitDoclet end javadoc_method write()
  public void testWrite() throws Exception {
    // JUnitDoclet begin method write
    // JUnitDoclet end method write
  }

  // JUnitDoclet begin javadoc_method read()
  /**
  * Method testRead is testing read
  * @see CH.ifa.draw.standard.LocatorConnector#read(CH.ifa.draw.util.StorableInput)
  */
  // JUnitDoclet end javadoc_method read()
  public void testRead() throws Exception {
    // JUnitDoclet begin method read
    // JUnitDoclet end method read
  }

  // JUnitDoclet begin javadoc_method getLocator()
  /**
  * Method testGetLocator is testing getLocator
  * @see CH.ifa.draw.standard.LocatorConnector#getLocator()
  */
  // JUnitDoclet end javadoc_method getLocator()
  public void testGetLocator() throws Exception {
    // JUnitDoclet begin method getLocator
    // JUnitDoclet end method getLocator
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
    junit.textui.TestRunner.run(LocatorConnectorTest.class);
    // JUnitDoclet end method testcase.main
  }
}
