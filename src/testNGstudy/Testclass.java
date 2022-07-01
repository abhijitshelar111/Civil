package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testclass {
  @Test
  public void mymethod1()
  {
	    System.setProperty("webdriver.edge.driver","E:\\velocity\\chromedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/"); 
		Reporter.log("Mymethod is running",true);
	  
  }
}
