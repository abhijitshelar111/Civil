package groupingtestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallelexecution {
	@Test
	  public void mymethod1()
	  {
		    System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/"); 
			Reporter.log("Mymethod is running",true);
		  
	  }
	@Test
	  public void mymethod2()
	  {
		    System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/"); 
			Reporter.log("Mymethod 2 is running",true);
		  
	  }
	@Test
	  public void mymethod3()
	  {
		    System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.angelone.in/"); 
			Reporter.log("Mymethod 3 is running",true);
		  
	  }
}
