package assignmentonkiteloginpage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class AssignmentOnKiteUtilityClass
{
	public static String readDatafromExl(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile= new File("E:\\velo.xlsx");
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
    public static void Implicitwait(WebDriver driver,int timeout)
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeout));
    	
    }
    
}
