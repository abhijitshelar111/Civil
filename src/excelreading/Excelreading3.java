package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreading3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("E:\\velo.xlsx");
		Sheet cl = WorkbookFactory.create(myfile).getSheet("Sheet1");
		//read the column
//		for(int i=0;i<3;i++)
//		{
//			String txt = cl.getRow(i).getCell(0).getStringCellValue();
//			System.out.println(txt);
//		}
		
		int totalrowcount = cl.getLastRowNum()+1;
		int lastcellnum = cl.getRow(0).getLastCellNum();
		int totalcellcount = lastcellnum;
		System.out.println(totalrowcount);
		System.out.println(totalcellcount);
		for(int i=0;i<totalrowcount;i++)
		{
			String txt = cl.getRow(i).getCell(0).getStringCellValue();
			System.out.println(txt);
		}

	}

}
