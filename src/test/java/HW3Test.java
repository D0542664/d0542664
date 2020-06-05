import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HW3Test {
  HW3 triangleTest;
    
  @BeforeClass
  public static void setUpClass() {
    System.out.println("Set up class");
  }
    
  @Before 
  public void setUp() {
    triangleTest = new HW3();
    System.out.println("@Before");
  }

    
  @After
  public void after() {
    System.out.println("@After");
  }
    
  @AfterClass
  public static void afterClass() {
    System.out.println("After class");
  }

  @Test
  public void test1() throws Exception {
    assertEquals("正三角形", triangleTest.checkTriangle(2,2,2));
  }
  
  @Test
  public void test2() throws Exception {
    assertEquals("等腰直角三角形",triangleTest.checkTriangle(1,1,1.414));
    assertEquals("等腰直角三角形",triangleTest.checkTriangle(1,1.414,1));
    assertEquals("等腰直角三角形",triangleTest.checkTriangle(1.414,1,1));
  }
  
  @Test
  public void test3() throws Exception {
    assertEquals("直角三角形",triangleTest.checkTriangle(3,4,5));
    assertEquals("直角三角形",triangleTest.checkTriangle(4,5,3));
    assertEquals("直角三角形",triangleTest.checkTriangle(5,4,3));
  }
  
  @Test
  public void test4() throws Exception {
    assertEquals("等腰三角形",triangleTest.checkTriangle(2,2,3));
    assertEquals("等腰三角形",triangleTest.checkTriangle(2,3,2));
    assertEquals("等腰三角形",triangleTest.checkTriangle(3,2,2));
  }
  
  @Test
  public void test5() throws Exception {
    assertEquals("三角形",triangleTest.checkTriangle(2,3,4));
  }
  
  @Test(expected = Exception.class)
  public void testWithExceprion1() throws Exception {
    assertEquals("", triangleTest.checkTriangle(0,2,2));
    assertEquals("", triangleTest.checkTriangle(2,2,0));
    assertEquals("", triangleTest.checkTriangle(2,0,2));
    //throw new WrongSideException("");
  }
  
  @Test(expected = Exception.class)
  public void testWithExceprion2() throws Exception {
    //throw new WrongSideException("");
    assertEquals("", triangleTest.checkTriangle(1,1,2));
    assertEquals("", triangleTest.checkTriangle(1,2,1));
    assertEquals("", triangleTest.checkTriangle(2,1,1));
  }
}
