package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile= new File("E:\\excelpractice\\Countries.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int totalrow = sheet.getLastRowNum();
		short totalcol = sheet.getRow(0).getLastCellNum();
		System.out.println(totalrow);
		System.out.println(totalcol);
		
		for(int i=0; i<=totalrow; i++)
		{
			String value = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(value);
		}
	}
}
