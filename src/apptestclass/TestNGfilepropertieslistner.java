package apptestclass;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import appbaseclass.Baseclassusinglistner;
import apppom.Kitehomepage;
import apppom.Kiteloginpage;
import apppom.Kitepinpage;
import apputilityclass.Utility;

@Listeners(testNGlistener.Listener.class)
public class TestNGfilepropertieslistner extends Baseclassusinglistner{
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
		login.sendusername(Utility.readdatafromproperty("UN"));
		login.sendpassword(Utility.readdatafromproperty("PWD"));
		login.clickloginbutton();
	    Utility.implicitwait(driver, 1000);
		pin.sendpin(Utility.readdatafromproperty("PIN"));
		pin.clickcontinuebutton();
		 Utility.implicitwait(driver, 1000);
	}
	
  @Test
  public void validateuserid() throws EncryptedDocumentException, IOException 
  {
	  String actualusername = home.actualuserid();
	  String expectedusername=Utility.readdatafromproperty("UN1");
	  Assert.assertEquals(actualusername,expectedusername,"TC is failed");
	  Reporter.log("TC is passed",true);
//	  Utility.takescreenshot(driver);
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
