package excelReading;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingcountries {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile= new File("E:\\excelpractice\\EmpData.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int totalRow = sheet.getLastRowNum();
		System.out.println(totalRow);
		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println(cell);
		
		for(int i=0; i<totalRow; i++)
		{
			Row row1 = sheet.getRow(i);
			for (int j=0; j<=cell-1; j++)
			{
				Cell cell1 = row1.getCell(j);
				switch(cell1.getCellType())
				{
				case STRING : System.out.print(cell1.getStringCellValue()+" | "); break;
				case NUMERIC : System.out.print(cell1.getNumericCellValue()+" | "); break;
				case BLANK:System.out.print("----- |"); break;
				default:
					break;
				}
			}
			System.out.println();
			}
	}

}
