package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreadingeg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("E:\\velo.xlsx");
		Sheet cl = WorkbookFactory.create(myfile).getSheet("Sheet1");
		//read total sheet using dynamic coding
		int totalrowcount = cl.getLastRowNum()+1;
		int lastcellnum = cl.getRow(0).getLastCellNum();
		int totalcellcount = lastcellnum;
		System.out.println(totalrowcount);
		System.out.println(totalcellcount);
		for(int i=0;i<totalrowcount;i++)
		{
			for(int j=0;j<totalcellcount;j++)
			{
				String txt = cl.getRow(i).getCell(j).getStringCellValue();
				System.out.print(txt+" ");
			}
			System.out.println();
		}

	}

}
