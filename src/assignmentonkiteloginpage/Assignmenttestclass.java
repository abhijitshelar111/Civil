package assignmentonkiteloginpage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignmenttestclass extends AssignmentOnKiteBaseClass {
	
	AssignementPOM login;
	SoftAssert soft = new SoftAssert();
	
	@BeforeClass
	public void LaunchBrawser()
	{
		openBrowser();
		login =new AssignementPOM(driver);
		AssignmentOnKiteUtilityClass.Implicitwait(driver, 1000);
	}
	
  @Test(priority = 1)
  public void Testcase1() throws EncryptedDocumentException, IOException, InterruptedException
  {
//	  login.Senduserid(null);
//	  login.SendPassword(null);
	  
	  login.ClicktoLogin();
	  String Actualerror1 = login.getActualErrorMsg1();
	  String ExpectedError1 = AssignmentOnKiteUtilityClass.readDatafromExl(0, 3);
	  soft.assertEquals(Actualerror1,ExpectedError1,"userid errormsg is not showing");
	  Reporter.log("userid errormsg is  showing ",true);
	   
	  String Actualerror2 = login.getActualErrorMsg2();
	  String ExpectedError2 = AssignmentOnKiteUtilityClass.readDatafromExl(0, 4);
	  soft.assertEquals(Actualerror2,ExpectedError2,"password errormsg is not showing");
	  Reporter.log("password errormsg is  showing ",true);
	  AssignmentOnKiteUtilityClass.Implicitwait(driver, 5000);
  }
  @Test(priority = 2)
  public void Testcase2() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  login.Senduserid(AssignmentOnKiteUtilityClass.readDatafromExl(0,0 ));

	  login.ClicktoLogin();
	 
	  String Actualerror2 = login.getActualErrorMsg2();
	  String ExpectedError2 = AssignmentOnKiteUtilityClass.readDatafromExl(0, 4);
	  soft.assertEquals(Actualerror2,ExpectedError2,"password errormsg is not showing");
	  Reporter.log("password errormsg is  showing ",true); 
      AssignmentOnKiteUtilityClass.Implicitwait(driver, 7000);
      login.ClearSceen();
  }
  @Test(priority = 3)
  public void testcase4() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  login.Senduserid(AssignmentOnKiteUtilityClass.readDatafromExl(0,0 ));
	  login.SendPassword(AssignmentOnKiteUtilityClass.readDatafromExl(0, 5));
	  login.ClicktoLogin();
	  String actualerror3 = login.getActualErrorMsg3();
	  String expectederror3=AssignmentOnKiteUtilityClass.readDatafromExl(0, 6);
      Assert.assertEquals(actualerror3,expectederror3,"invalid userid and password msg not showing");
      Reporter.log("invalid userid and password msg showing");
      AssignmentOnKiteUtilityClass.Implicitwait(driver, 7000);
      login.ClearSceen();
  }
  @Test(priority = 4)
  public void testcase5() throws EncryptedDocumentException, IOException
  {
	  login.Senduserid(AssignmentOnKiteUtilityClass.readDatafromExl(0,7));
	  login.SendPassword(AssignmentOnKiteUtilityClass.readDatafromExl(0, 2));
	  login.ClicktoLogin();
	  String actualerror3 = login.getActualErrorMsg3();
	  String expectederror3=AssignmentOnKiteUtilityClass.readDatafromExl(0, 6);
      Assert.assertEquals(actualerror3,expectederror3,"invalid userid and password msg not showing");
      Reporter.log("invalid userid and password msg showing");
      AssignmentOnKiteUtilityClass.Implicitwait(driver, 7000);
  }
  

  @Test(priority = 5)
  public void Testcase3() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  login.ClearSceen();
	  login.SendPassword(AssignmentOnKiteUtilityClass.readDatafromExl(0,1 ));

	  login.ClicktoLogin();
	 
	  String Actualerror1 = login.getActualErrorMsg3();
	  String ExpectedError1 = AssignmentOnKiteUtilityClass.readDatafromExl(0, 6);
	  soft.assertEquals(Actualerror1,ExpectedError1,"userid errormsg is not showing");
	  Reporter.log("userid errormsg is  showing ",true);
	   
}
  @Test(priority = 6)
  public void Testcase6() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  login.ClearSceen();
	  login.Senduserid(AssignmentOnKiteUtilityClass.readDatafromExl(0,0 ));
	  login.SendPassword(AssignmentOnKiteUtilityClass.readDatafromExl(0,1));
	  login.ClicktoLogin();
	  Reporter.log("login and going forward to pinpage",true);
	  login.Pin(AssignmentOnKiteUtilityClass.readDatafromExl(0,2 ));
	  
	  
  }
 
}
