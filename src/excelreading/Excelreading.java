package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("E:\\velo.xlsx");
		Sheet cl = WorkbookFactory.create(myfile).getSheet("Sheet1");
		//read total sheet using static coding
		
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<3;j++)
		{
			String txt = cl.getRow(i).getCell(j).getStringCellValue();
			System.out.print(txt+" ");
			
		}
		System.out.println();
	}

	}

}
