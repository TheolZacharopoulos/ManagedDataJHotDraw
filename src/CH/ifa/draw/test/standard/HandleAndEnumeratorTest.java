package CH.ifa.draw.test.standard;

import junit.framework.TestCase;
// JUnitDoclet begin import
import CH.ifa.draw.standard.HandleAndEnumerator;
import CH.ifa.draw.standard.RelativeLocator;
import CH.ifa.draw.standard.NullHandle;
import CH.ifa.draw.standard.HandleEnumerator;
import CH.ifa.draw.util.CollectionsFactory;
import CH.ifa.draw.figures.RectangleFigure;

import java.util.List;
import java.awt.*;
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
* TestCase HandleAndEnumeratorTest is generated by
* JUnitDoclet to hold the tests for HandleAndEnumerator.
* @see CH.ifa.draw.standard.HandleAndEnumerator
*/
// JUnitDoclet end javadoc_class
public class HandleAndEnumeratorTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.standard.HandleAndEnumerator handleandenumerator = null;
  // JUnitDoclet end class
  
  /**
  * Constructor HandleAndEnumeratorTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public HandleAndEnumeratorTest(String name) {
    // JUnitDoclet begin method HandleAndEnumeratorTest
    super(name);
    // JUnitDoclet end method HandleAndEnumeratorTest
  }
  
  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.standard.HandleAndEnumerator createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
	RectangleFigure figure1 = new RectangleFigure(new Point(15, 15), new Point(20, 20));
	List l1 = CollectionsFactory.current().createList();
	l1.add(new NullHandle(figure1, RelativeLocator.north()));
	l1.add(new NullHandle(figure1, RelativeLocator.north()));
	HandleEnumerator handleEnum1 = new HandleEnumerator(l1);

	RectangleFigure figure2 = new RectangleFigure(new Point(55, 55), new Point(70, 70));
	List l2 = CollectionsFactory.current().createList();
	l2.add(new NullHandle(figure2, RelativeLocator.north()));
	l2.add(new NullHandle(figure2, RelativeLocator.north()));
	HandleEnumerator handleEnum2 = new HandleEnumerator(l2);
    return new CH.ifa.draw.standard.HandleAndEnumerator(handleEnum1, handleEnum2);
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
    handleandenumerator = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    handleandenumerator = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  // JUnitDoclet begin javadoc_method nextHandle()
  /**
  * Method testNextHandle is testing nextHandle
  * @see CH.ifa.draw.standard.HandleAndEnumerator#nextHandle()
  */
  // JUnitDoclet end javadoc_method nextHandle()
  public void testNextHandle() throws Exception {
    // JUnitDoclet begin method nextHandle
    // JUnitDoclet end method nextHandle
  }
  
  // JUnitDoclet begin javadoc_method hasNextHandle()
  /**
  * Method testHasNextHandle is testing hasNextHandle
  * @see CH.ifa.draw.standard.HandleAndEnumerator#hasNextHandle()
  */
  // JUnitDoclet end javadoc_method hasNextHandle()
  public void testHasNextHandle() throws Exception {
    // JUnitDoclet begin method hasNextHandle
    // JUnitDoclet end method hasNextHandle
  }
  
  // JUnitDoclet begin javadoc_method toList()
  /**
  * Method testToList is testing toList
  * @see CH.ifa.draw.standard.HandleAndEnumerator#toList()
  */
  // JUnitDoclet end javadoc_method toList()
  public void testToList() throws Exception {
    // JUnitDoclet begin method toList
    // JUnitDoclet end method toList
  }
  
  // JUnitDoclet begin javadoc_method reset()
  /**
  * Method testReset is testing reset
  * @see CH.ifa.draw.standard.HandleAndEnumerator#reset()
  */
  // JUnitDoclet end javadoc_method reset()
  public void testReset() throws Exception {
    // JUnitDoclet begin method reset
    // JUnitDoclet end method reset
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
    junit.textui.TestRunner.run(HandleAndEnumeratorTest.class);
    // JUnitDoclet end method testcase.main
  }
}
