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
* TestCase FigureAttributesTest is generated by
* JUnitDoclet to hold the tests for FigureAttributes.
* @see CH.ifa.draw.figures.FigureAttributes
*/
// JUnitDoclet end javadoc_class
public class FigureAttributesTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.figures.FigureAttributes figureattributes = null;
  // JUnitDoclet end class

  /**
  * Constructor FigureAttributesTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public FigureAttributesTest(String name) {
    // JUnitDoclet begin method FigureAttributesTest
    super(name);
    // JUnitDoclet end method FigureAttributesTest
  }

  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.figures.FigureAttributes createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.figures.FigureAttributes();
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
    figureattributes = createInstance();
    // JUnitDoclet end method testcase.setUp
  }

  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    figureattributes = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }

  // JUnitDoclet begin javadoc_method get()
  /**
  * Method testGet is testing get
  * @see CH.ifa.draw.figures.FigureAttributes#get(CH.ifa.draw.framework.FigureAttributeConstant)
  */
  // JUnitDoclet end javadoc_method get()
  public void testGet() throws Exception {
    // JUnitDoclet begin method get
    // JUnitDoclet end method get
  }

  // JUnitDoclet begin javadoc_method set()
  /**
  * Method testSet is testing set
  * @see CH.ifa.draw.figures.FigureAttributes#set(CH.ifa.draw.framework.FigureAttributeConstant, java.lang.Object)
  */
  // JUnitDoclet end javadoc_method set()
  public void testSet() throws Exception {
    // JUnitDoclet begin method set
    // JUnitDoclet end method set
  }

  // JUnitDoclet begin javadoc_method hasDefined()
  /**
  * Method testHasDefined is testing hasDefined
  * @see CH.ifa.draw.figures.FigureAttributes#hasDefined(CH.ifa.draw.framework.FigureAttributeConstant)
  */
  // JUnitDoclet end javadoc_method hasDefined()
  public void testHasDefined() throws Exception {
    // JUnitDoclet begin method hasDefined
    // JUnitDoclet end method hasDefined
  }

  // JUnitDoclet begin javadoc_method clone()
  /**
  * Method testClone is testing clone
  * @see CH.ifa.draw.figures.FigureAttributes#clone()
  */
  // JUnitDoclet end javadoc_method clone()
  public void testClone() throws Exception {
    // JUnitDoclet begin method clone
    // JUnitDoclet end method clone
  }

  // JUnitDoclet begin javadoc_method read()
  /**
  * Method testRead is testing read
  * @see CH.ifa.draw.figures.FigureAttributes#read(CH.ifa.draw.util.StorableInput)
  */
  // JUnitDoclet end javadoc_method read()
  public void testRead() throws Exception {
    // JUnitDoclet begin method read
    // JUnitDoclet end method read
  }

  // JUnitDoclet begin javadoc_method write()
  /**
  * Method testWrite is testing write
  * @see CH.ifa.draw.figures.FigureAttributes#write(CH.ifa.draw.util.StorableOutput)
  */
  // JUnitDoclet end javadoc_method write()
  public void testWrite() throws Exception {
    // JUnitDoclet begin method write
    // JUnitDoclet end method write
  }

  // JUnitDoclet begin javadoc_method writeColor()
  /**
  * Method testWriteColor is testing writeColor
  * @see CH.ifa.draw.figures.FigureAttributes#writeColor(CH.ifa.draw.util.StorableOutput, java.lang.String, java.awt.Color)
  */
  // JUnitDoclet end javadoc_method writeColor()
  public void testWriteColor() throws Exception {
    // JUnitDoclet begin method writeColor
    // JUnitDoclet end method writeColor
  }

  // JUnitDoclet begin javadoc_method readColor()
  /**
  * Method testReadColor is testing readColor
  * @see CH.ifa.draw.figures.FigureAttributes#readColor(CH.ifa.draw.util.StorableInput)
  */
  // JUnitDoclet end javadoc_method readColor()
  public void testReadColor() throws Exception {
    // JUnitDoclet begin method readColor
    // JUnitDoclet end method readColor
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
    junit.textui.TestRunner.run(FigureAttributesTest.class);
    // JUnitDoclet end method testcase.main
  }
}
