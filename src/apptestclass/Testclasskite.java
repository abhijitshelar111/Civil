package apptestclass;

import java.io.IOException;

import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import appbaseclass.Baseclass;
import apppom.Kitehomepage;
import apppom.Kiteloginpage;
import apppom.Kitepinpage;
import apputilityclass.Utility;

public class Testclasskite extends Baseclass{
	Kiteloginpage login;
	Kitepinpage pin;
	Kitehomepage home;
	
	
	@BeforeClass
	public void launch()
	{
		open();
		login= new Kiteloginpage(driver);
		pin=new Kitepinpage(driver);
		home=new Kitehomepage(driver);
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.sendusername(Utility.readdatafromexcel(0, 0));
		login.sendpassword(Utility.readdatafromexcel(0, 1));
		login.clickloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin(Utility.readdatafromexcel(0, 2));
		pin.clickcontinuebutton();
		
	}
	
  @Test
  public void validateuserid() throws EncryptedDocumentException, IOException 
  {
	  String actualusername = home.actualuserid();
	  String expectedusername=Utility.readdatafromexcel(0, 0);
	  Assert.assertEquals(actualusername,expectedusername,"TC is failed");
	  Reporter.log("TC is passed");
	  Utility.takescreenshot(driver);
  }
  
  @AfterMethod
  public void logout() throws InterruptedException
  {
	  home.clicklogout();
  }
  @AfterClass
  public void closebrowser()
  {
	  driver.close();
  }
}
