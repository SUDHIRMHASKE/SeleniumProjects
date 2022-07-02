package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XcelTableReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile= new File("E:\\excelpractice\\EmpData.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int totalRow = sheet.getLastRowNum();
		System.out.println(totalRow);
		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println(cell);
		
		for(int i=0; i<=totalRow; i++)
		{
			for (int j=0; j<=cell-1; j++)
			{
				Cell cell1 = sheet.getRow(i).getCell(j);
				CellType type = cell1.getCellType();
				if(type==CellType.STRING)
				{
					System.out.print(cell1.getStringCellValue()+" | ");
				}
				else if(type==CellType.NUMERIC)
				{
					System.out.print(cell1.getNumericCellValue()+" | ");
				}
				else if(type==CellType.BOOLEAN)
				{
					System.out.print(cell1.getBooleanCellValue()+" | ");
				}
				else if(type==CellType.BLANK)
				{
					System.out.print("----- | ");
				}
			}
			System.out.println();
			}
	}

}
