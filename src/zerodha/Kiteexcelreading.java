package zerodha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kiteexcelreading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		File myfile=new File("E:\\velo.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		int totalrowcount = mysheet.getLastRowNum();
		int totalcellcount = mysheet.getRow(0).getLastCellNum()-1;
		System.out.println(totalrowcount);
		System.out.println(totalcellcount);
		ArrayList<String> ele=new ArrayList<String>();
		for(int i=0;i<=totalrowcount;i++) {
			for(int j=0;j<=totalcellcount;j++) {
				String txt = mysheet.getRow(i).getCell(j).getStringCellValue();
				ele.add(txt);
				System.out.println(ele.get(j));
			}
		}
		
	     driver.findElement(By.id("userid")).sendKeys(ele.get(0));
		 driver.findElement(By.id("password")).sendKeys(ele.get(1));
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.id("pin")).sendKeys(ele.get(2));
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
		
		

	}

}
