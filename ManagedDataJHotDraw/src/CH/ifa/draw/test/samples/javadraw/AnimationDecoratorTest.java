package CH.ifa.draw.test.samples.javadraw;

import junit.framework.TestCase;
// JUnitDoclet begin import
import CH.ifa.draw.samples.javadraw.AnimationDecorator;
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
* TestCase AnimationDecoratorTest is generated by
* JUnitDoclet to hold the tests for AnimationDecorator.
* @see CH.ifa.draw.samples.javadraw.AnimationDecorator
*/
// JUnitDoclet end javadoc_class
public class AnimationDecoratorTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.samples.javadraw.AnimationDecorator animationdecorator = null;
  // JUnitDoclet end class
  
  /**
  * Constructor AnimationDecoratorTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public AnimationDecoratorTest(String name) {
    // JUnitDoclet begin method AnimationDecoratorTest
    super(name);
    // JUnitDoclet end method AnimationDecoratorTest
  }
  
  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.samples.javadraw.AnimationDecorator createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.samples.javadraw.AnimationDecorator();
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
    animationdecorator = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    animationdecorator = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  // JUnitDoclet begin javadoc_method velocity()
  /**
  * Method testVelocity is testing velocity
  * @see CH.ifa.draw.samples.javadraw.AnimationDecorator#velocity(int, int)
  */
  // JUnitDoclet end javadoc_method velocity()
  public void testVelocity() throws Exception {
    // JUnitDoclet begin method velocity
    // JUnitDoclet end method velocity
  }
  
  // JUnitDoclet begin javadoc_method animationStep()
  /**
  * Method testAnimationStep is testing animationStep
  * @see CH.ifa.draw.samples.javadraw.AnimationDecorator#animationStep()
  */
  // JUnitDoclet end javadoc_method animationStep()
  public void testAnimationStep() throws Exception {
    // JUnitDoclet begin method animationStep
    // JUnitDoclet end method animationStep
  }
  
  // JUnitDoclet begin javadoc_method basicMoveBy()
  /**
  * Method testBasicMoveBy is testing basicMoveBy
  * @see CH.ifa.draw.samples.javadraw.AnimationDecorator#basicMoveBy(int, int)
  */
  // JUnitDoclet end javadoc_method basicMoveBy()
  public void testBasicMoveBy() throws Exception {
    // JUnitDoclet begin method basicMoveBy
    // JUnitDoclet end method basicMoveBy
  }
  
  // JUnitDoclet begin javadoc_method basicDisplayBox()
  /**
  * Method testBasicDisplayBox is testing basicDisplayBox
  * @see CH.ifa.draw.samples.javadraw.AnimationDecorator#basicDisplayBox(java.awt.Point, java.awt.Point)
  */
  // JUnitDoclet end javadoc_method basicDisplayBox()
  public void testBasicDisplayBox() throws Exception {
    // JUnitDoclet begin method basicDisplayBox
    // JUnitDoclet end method basicDisplayBox
  }
  
  // JUnitDoclet begin javadoc_method displayBox()
  /**
  * Method testDisplayBox is testing displayBox
  * @see CH.ifa.draw.samples.javadraw.AnimationDecorator#displayBox()
  */
  // JUnitDoclet end javadoc_method displayBox()
  public void testDisplayBox() throws Exception {
    // JUnitDoclet begin method displayBox
    // JUnitDoclet end method displayBox
  }
  
  // JUnitDoclet begin javadoc_method write()
  /**
  * Method testWrite is testing write
  * @see CH.ifa.draw.samples.javadraw.AnimationDecorator#write(CH.ifa.draw.util.StorableOutput)
  */
  // JUnitDoclet end javadoc_method write()
  public void testWrite() throws Exception {
    // JUnitDoclet begin method write
    // JUnitDoclet end method write
  }
  
  // JUnitDoclet begin javadoc_method read()
  /**
  * Method testRead is testing read
  * @see CH.ifa.draw.samples.javadraw.AnimationDecorator#read(CH.ifa.draw.util.StorableInput)
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
    junit.textui.TestRunner.run(AnimationDecoratorTest.class);
    // JUnitDoclet end method testcase.main
  }
}
