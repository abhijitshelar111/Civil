package kitewithexcel;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGkite {
	WebDriver driver;
	Kiteloginpage login;
	Kitepinpage pin;
	Kitehomepage home;
	Sheet mysheet;
  @BeforeClass
	public void launchbrowser() throws EncryptedDocumentException, IOException
	{
	  System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	  login=new Kiteloginpage(driver);
	  pin=new Kitepinpage(driver);
	  home=new Kitehomepage(driver);
	  File myfile=new File("E:\\velo.xlsx");
	  mysheet= WorkbookFactory.create(myfile).getSheet("Sheet3");
	  
		
	}
  @BeforeMethod
	public void logintokite()
	{
	  login.sendusername(mysheet.getRow(0).getCell(0).getStringCellValue());
	  Reporter.log("send username",true);
	  login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
	  Reporter.log("send password",true);
	  login.clickloginbutton();
	  Reporter.log("clicking on loginbutton",true);
	  pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
	  Reporter.log("send pin",true);
	  pin.clickcontinuebutton();
	  
	  
		
	}
  @Test
  public void validation() 
  {
	    String expected = mysheet.getRow(0).getCell(0).getStringCellValue();  
	    String actualuser = home.actualuserid();
	    Reporter.log("validating userid",true);
	    Assert.assertEquals(expected,actualuser,"expected and actualuser are not matching TC is failed");
	    Reporter.log("expected and actualuser are  matching TC is passed",true);
	    
	  
  }
  @AfterMethod
  public void logout() throws InterruptedException
  {
	  home.clicklogout();
	  Reporter.log("logging out.....",true);
	  
	  
  }
  @AfterClass
  public void closebrowser()
  {
	  Reporter.log("closing browser",true);
	  driver.close();
	  
  }
}
