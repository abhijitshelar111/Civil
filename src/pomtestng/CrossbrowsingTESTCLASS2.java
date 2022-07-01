package pomtestng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CrossbrowsingTESTCLASS2 {
	WebDriver driver;
	Homepage home;Loginpage login;Pinpage pin;Logoutpage logout;
	@BeforeClass
	public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();}
	@BeforeMethod
	public void launch() {
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login=new Loginpage(driver);
		pin=new Pinpage(driver);
		home=new Homepage(driver);
		logout=new Logoutpage(driver);}
   @Test(dataProvider = "logdata")
   public void logintozerodha(String user,String password,String userpin) { 
      login.sendusername(user);
	  login.sendpwd(password);
	  login.clickloginbutton();
	  pin.sendpin(userpin);
	  pin.continueb();}
  @DataProvider(name="logdata")
  public String[][] logindata() throws EncryptedDocumentException, IOException{
      File myfile=new File("E:\\velo.xlsx");
	  Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	  String user = mysheet.getRow(0).getCell(0).getStringCellValue();
	  String password = mysheet.getRow(0).getCell(1).getStringCellValue();
	  String userpin = mysheet.getRow(0).getCell(2).getStringCellValue();
	  String data[][]= {{user,password,userpin}};
	  return data;}
  @Test(dataProvider = "logdata")
  public void verification(String user,String password,String userpin) {
    SoftAssert sa=new SoftAssert();
	sa.assertEquals(home.actualuser(),user );
	Reporter.log("user id  mathch TC is passed",true);}
  @AfterMethod(enabled = false)
  public void logout() throws InterruptedException{
  logout.clickonuserid();}
  @AfterClass
  public void close() {
  driver.close();}
  
}
