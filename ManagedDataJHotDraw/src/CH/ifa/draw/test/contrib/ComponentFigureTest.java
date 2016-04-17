package CH.ifa.draw.test.contrib;

import junit.framework.TestCase;
// JUnitDoclet begin import
import CH.ifa.draw.contrib.ComponentFigure;
import CH.ifa.draw.test.JHDTestCase;

import javax.swing.*;
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
* TestCase ComponentFigureTest is generated by
* JUnitDoclet to hold the tests for ComponentFigure.
* @see CH.ifa.draw.contrib.ComponentFigure
*/
// JUnitDoclet end javadoc_class
public class ComponentFigureTest
// JUnitDoclet begin extends_implements
extends JHDTestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.contrib.ComponentFigure componentfigure = null;
  // JUnitDoclet end class
  
  /**
  * Constructor ComponentFigureTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public ComponentFigureTest(String name) {
    // JUnitDoclet begin method ComponentFigureTest
    super(name);
    // JUnitDoclet end method ComponentFigureTest
  }
  
  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.contrib.ComponentFigure createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.contrib.ComponentFigure(new JButton("TestComponent"));
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
    componentfigure = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    componentfigure = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  // JUnitDoclet begin javadoc_method basicDisplayBox()
  /**
  * Method testBasicDisplayBox is testing basicDisplayBox
  * @see CH.ifa.draw.contrib.ComponentFigure#basicDisplayBox(java.awt.Point, java.awt.Point)
  */
  // JUnitDoclet end javadoc_method basicDisplayBox()
  public void testBasicDisplayBox() throws Exception {
    // JUnitDoclet begin method basicDisplayBox
    // JUnitDoclet end method basicDisplayBox
  }
  
  // JUnitDoclet begin javadoc_method displayBox()
  /**
  * Method testDisplayBox is testing displayBox
  * @see CH.ifa.draw.contrib.ComponentFigure#displayBox()
  */
  // JUnitDoclet end javadoc_method displayBox()
  public void testDisplayBox() throws Exception {
    // JUnitDoclet begin method displayBox
    // JUnitDoclet end method displayBox
  }
  
  // JUnitDoclet begin javadoc_method handles()
  /**
  * Method testHandles is testing handles
  * @see CH.ifa.draw.contrib.ComponentFigure#handles()
  */
  // JUnitDoclet end javadoc_method handles()
  public void testHandles() throws Exception {
    // JUnitDoclet begin method handles
    // JUnitDoclet end method handles
  }
  
  // JUnitDoclet begin javadoc_method getComponent()
  /**
  * Method testGetComponent is testing getComponent
  * @see CH.ifa.draw.contrib.ComponentFigure#getComponent()
  */
  // JUnitDoclet end javadoc_method getComponent()
  public void testGetComponent() throws Exception {
    // JUnitDoclet begin method getComponent
    // JUnitDoclet end method getComponent
  }
  
  // JUnitDoclet begin javadoc_method draw()
  /**
  * Method testDraw is testing draw
  * @see CH.ifa.draw.contrib.ComponentFigure#draw(java.awt.Graphics)
  */
  // JUnitDoclet end javadoc_method draw()
  public void testDraw() throws Exception {
    // JUnitDoclet begin method draw
    // JUnitDoclet end method draw
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
    junit.textui.TestRunner.run(ComponentFigureTest.class);
    // JUnitDoclet end method testcase.main
  }
}
