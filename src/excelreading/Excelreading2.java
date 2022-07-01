package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreading2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("E:\\velo.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		//reading whole row
//		for(int i=0;i<3;i++)
//		{
//			String txt = mysheet.getRow(0).getCell(i).getStringCellValue();
//			System.out.println(txt);
//		}
		
		int lastrownum = mysheet.getLastRowNum();
		int totalrowcount=lastrownum;
		int lastcellnum = mysheet.getRow(0).getLastCellNum();
		int totalcellcount = lastcellnum;
		System.out.println(totalrowcount);
		System.out.println(totalcellcount);
		
		for(int i=0;i<totalcellcount;i++)  //dynamic coding
		{
			String txt = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(txt);
		}

	}

}
