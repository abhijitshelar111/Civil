package kitewithexcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File myfile=new File("E:\\velo.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		ArrayList<String> ar=new ArrayList<String>();
		int totalrowcount = mysheet.getLastRowNum();
		int totalcellcount = mysheet.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=totalrowcount;i++)
		{
	        for(int j=0;j<=totalcellcount;j++)
	        {
          String count=mysheet.getRow(i).getCell(j).getStringCellValue();
          ar.add(count);}
		
		Kiteloginpage login=new Kiteloginpage(driver);
		login.sendusername(ar.get(0));
		login.sendpassword(ar.get(1));
		login.clickloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Kitepinpage kitepin=new Kitepinpage(driver);
		kitepin.sendpin(ar.get(2));
		kitepin.clickcontinuebutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Kitehomepage logout=new Kitehomepage(driver);
		logout.validateuserid(ar.get(0));
		logout.clicklogout();
		logout.clickonchangeuser();
		ar.clear();
		
	        
		}

	}

}
