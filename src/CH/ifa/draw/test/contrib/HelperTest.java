package CH.ifa.draw.test.contrib;

import junit.framework.TestCase;
// JUnitDoclet begin import
import CH.ifa.draw.contrib.Helper;
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
* TestCase HelperTest is generated by
* JUnitDoclet to hold the tests for Helper.
* @see CH.ifa.draw.contrib.Helper
*/
// JUnitDoclet end javadoc_class
public class HelperTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.contrib.Helper helper = null;
  // JUnitDoclet end class
  
  /**
  * Constructor HelperTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public HelperTest(String name) {
    // JUnitDoclet begin method HelperTest
    super(name);
    // JUnitDoclet end method HelperTest
  }
  
  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.contrib.Helper createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.contrib.Helper();
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
    helper = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    helper = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  // JUnitDoclet begin javadoc_method getDrawingView()
  /**
  * Method testGetDrawingView is testing getDrawingView
  * @see CH.ifa.draw.contrib.Helper#getDrawingView(java.awt.Container)
  */
  // JUnitDoclet end javadoc_method getDrawingView()
  public void testGetDrawingView() throws Exception {
    // JUnitDoclet begin method getDrawingView
    // JUnitDoclet end method getDrawingView
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
    junit.textui.TestRunner.run(HelperTest.class);
    // JUnitDoclet end method testcase.main
  }
}
