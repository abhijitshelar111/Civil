package kitewithexcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File myfile=new File("E:\\velo.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		Kiteloginpage login=new Kiteloginpage(driver);
		login.sendusername(mysheet.getRow(0).getCell(0).getStringCellValue());
		login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.clickloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Kitepinpage kitepin=new Kitepinpage(driver);
		kitepin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		kitepin.clickcontinuebutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Kitehomepage logout=new Kitehomepage(driver);
		logout.validateuserid(mysheet.getRow(0).getCell(0).getStringCellValue());
		logout.clicklogout();

	}

}
