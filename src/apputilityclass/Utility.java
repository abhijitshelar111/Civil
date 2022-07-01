package apputilityclass;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility {
	public static String readdatafromexcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		 File myfile=new File("E:\\velo.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String myvalue = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return myvalue;
	}
	public static void takescreenshot(WebDriver driver) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(3);
		File dest=new File("E:\\velocity\\screenshot"+random+".png");
		FileHandler.copy(source, dest);
		
	}
	public static String readdatafromproperty(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myprop=new FileInputStream("C:\\Users\\Abhi\\eclipse-workspace\\seleniumproject\\myfile.properties");
		prop.load(myprop);
		String val = prop.getProperty(key);
		return val;
		
	}
	public static void implicitwait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
}
