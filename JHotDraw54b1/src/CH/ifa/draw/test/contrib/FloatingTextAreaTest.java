package CH.ifa.draw.test.contrib;

import junit.framework.TestCase;
// JUnitDoclet begin import
import CH.ifa.draw.contrib.FloatingTextArea;
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
* TestCase FloatingTextAreaTest is generated by
* JUnitDoclet to hold the tests for FloatingTextArea.
* @see CH.ifa.draw.contrib.FloatingTextArea
*/
// JUnitDoclet end javadoc_class
public class FloatingTextAreaTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.contrib.FloatingTextArea floatingtextarea = null;
  // JUnitDoclet end class
  
  /**
  * Constructor FloatingTextAreaTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public FloatingTextAreaTest(String name) {
    // JUnitDoclet begin method FloatingTextAreaTest
    super(name);
    // JUnitDoclet end method FloatingTextAreaTest
  }
  
  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.contrib.FloatingTextArea createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.contrib.FloatingTextArea();
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
    floatingtextarea = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    floatingtextarea = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  // JUnitDoclet begin javadoc_method createOverlay()
  /**
  * Method testCreateOverlay is testing createOverlay
  * @see CH.ifa.draw.contrib.FloatingTextArea#createOverlay(java.awt.Container)
  */
  // JUnitDoclet end javadoc_method createOverlay()
  public void testCreateOverlay() throws Exception {
    // JUnitDoclet begin method createOverlay
    // JUnitDoclet end method createOverlay
  }
  
  // JUnitDoclet begin javadoc_method setBounds()
  /**
  * Method testSetBounds is testing setBounds
  * @see CH.ifa.draw.contrib.FloatingTextArea#setBounds(java.awt.Rectangle, java.lang.String)
  */
  // JUnitDoclet end javadoc_method setBounds()
  public void testSetBounds() throws Exception {
    // JUnitDoclet begin method setBounds
    // JUnitDoclet end method setBounds
  }
  
  // JUnitDoclet begin javadoc_method getText()
  /**
  * Method testGetText is testing getText
  * @see CH.ifa.draw.contrib.FloatingTextArea#getText()
  */
  // JUnitDoclet end javadoc_method getText()
  public void testGetText() throws Exception {
    // JUnitDoclet begin method getText
    // JUnitDoclet end method getText
  }
  
  // JUnitDoclet begin javadoc_method getPreferredSize()
  /**
  * Method testGetPreferredSize is testing getPreferredSize
  * @see CH.ifa.draw.contrib.FloatingTextArea#getPreferredSize(int)
  */
  // JUnitDoclet end javadoc_method getPreferredSize()
  public void testGetPreferredSize() throws Exception {
    // JUnitDoclet begin method getPreferredSize
    // JUnitDoclet end method getPreferredSize
  }
  
  // JUnitDoclet begin javadoc_method endOverlay()
  /**
  * Method testEndOverlay is testing endOverlay
  * @see CH.ifa.draw.contrib.FloatingTextArea#endOverlay()
  */
  // JUnitDoclet end javadoc_method endOverlay()
  public void testEndOverlay() throws Exception {
    // JUnitDoclet begin method endOverlay
    // JUnitDoclet end method endOverlay
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
    junit.textui.TestRunner.run(FloatingTextAreaTest.class);
    // JUnitDoclet end method testcase.main
  }
}
