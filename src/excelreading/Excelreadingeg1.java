package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreadingeg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("E:\\velo.xlsx");
		
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
        System.out.println(name);
        
        String n2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
        System.out.println(n2);
        double n3 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
        System.out.println(n3);
        boolean n4 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
        System.out.println(n4);
	}

}
