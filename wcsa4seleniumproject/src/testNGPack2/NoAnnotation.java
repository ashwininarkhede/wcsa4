package testNGPack2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAnnotation {
  @Test
  public void test() {
	  Reporter.log("@Test Anotation",true);
  }
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("@beforeClass Anotation",true); 
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("@beforeMethod Anotation",true); 
  }
  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("@beforeTest Anotation",true); 
  }
  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("@beforeSuite Anotation",true); 
  }
  
  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("@afterSuite Anotation",true); 
  }
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("@afterClass Anotation",true); 
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("@afterMethod Anotation",true); 
  }
	  @AfterTest
	  public void afterTest()
	  {
		  Reporter.log("@afterTest Anotation",true); 
	  }

  
}
