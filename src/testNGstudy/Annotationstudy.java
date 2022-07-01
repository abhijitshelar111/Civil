package testNGstudy;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotationstudy {
  @Test
  public void first() 
  {
	  Reporter.log("first method is running",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("before method is running", true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("after method is running",true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("before class is running",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("afterclass is running",true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("before test is running",true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("after test is running",true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("before suite is running",true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("after suite is running",true);
  }

}
