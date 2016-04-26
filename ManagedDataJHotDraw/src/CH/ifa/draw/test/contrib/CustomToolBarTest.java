package CH.ifa.draw.test.contrib;

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
* TestCase CustomToolBarTest is generated by
* JUnitDoclet to hold the tests for CustomToolBar.
* @see CH.ifa.draw.contrib.CustomToolBar
*/
// JUnitDoclet end javadoc_class
public class CustomToolBarTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.contrib.CustomToolBar customtoolbar = null;
  // JUnitDoclet end class

  /**
  * Constructor CustomToolBarTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public CustomToolBarTest(String name) {
    // JUnitDoclet begin method CustomToolBarTest
    super(name);
    // JUnitDoclet end method CustomToolBarTest
  }

  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.contrib.CustomToolBar createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.contrib.CustomToolBar();
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
    customtoolbar = createInstance();
    // JUnitDoclet end method testcase.setUp
  }

  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    customtoolbar = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }

  // JUnitDoclet begin javadoc_method switchToolBar()
  /**
  * Method testSwitchToolBar is testing switchToolBar
  * @see CH.ifa.draw.contrib.CustomToolBar#switchToolBar()
  */
  // JUnitDoclet end javadoc_method switchToolBar()
  public void testSwitchToolBar() throws Exception {
    // JUnitDoclet begin method switchToolBar
    // JUnitDoclet end method switchToolBar
  }

  // JUnitDoclet begin javadoc_method switchToEditTools()
  /**
  * Method testSwitchToEditTools is testing switchToEditTools
  * @see CH.ifa.draw.contrib.CustomToolBar#switchToEditTools()
  */
  // JUnitDoclet end javadoc_method switchToEditTools()
  public void testSwitchToEditTools() throws Exception {
    // JUnitDoclet begin method switchToEditTools
    // JUnitDoclet end method switchToEditTools
  }

  // JUnitDoclet begin javadoc_method switchToStandardTools()
  /**
  * Method testSwitchToStandardTools is testing switchToStandardTools
  * @see CH.ifa.draw.contrib.CustomToolBar#switchToStandardTools()
  */
  // JUnitDoclet end javadoc_method switchToStandardTools()
  public void testSwitchToStandardTools() throws Exception {
    // JUnitDoclet begin method switchToStandardTools
    // JUnitDoclet end method switchToStandardTools
  }

  // JUnitDoclet begin javadoc_method activateTools()
  /**
  * Method testActivateTools is testing activateTools
  * @see CH.ifa.draw.contrib.CustomToolBar#activateTools()
  */
  // JUnitDoclet end javadoc_method activateTools()
  public void testActivateTools() throws Exception {
    // JUnitDoclet begin method activateTools
    // JUnitDoclet end method activateTools
  }

  // JUnitDoclet begin javadoc_method add()
  /**
  * Method testAdd is testing add
  * @see CH.ifa.draw.contrib.CustomToolBar#add(java.awt.Component)
  */
  // JUnitDoclet end javadoc_method add()
  public void testAdd() throws Exception {
    // JUnitDoclet begin method add
    // JUnitDoclet end method add
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
    junit.textui.TestRunner.run(CustomToolBarTest.class);
    // JUnitDoclet end method testcase.main
  }
}
