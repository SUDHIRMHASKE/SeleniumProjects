package assignment;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public static String readXldata(int rownumber, int cellnumber) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("E:\\excelpractice\\KiteZerodha.xlsx");
		Workbook wb = WorkbookFactory.create(myfile);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(rownumber);
		Cell cell = row.getCell(cellnumber);
		String xldata = cell.getStringCellValue();
		return xldata;
	}
	public int getrowcount() throws IOException
	{
		File myfile= new File("E:\\excelpractice\\Zerodha.xlsx");
		Workbook wb = WorkbookFactory.create(myfile);
		Sheet sheet = wb.getSheet("Sheet1");
		int totalrow = sheet.getLastRowNum();
		
		return totalrow;
	}
	
	public int getcolcount(int rownumber) throws IOException
	{
		File myfile= new File("E:\\excelpractice\\Zerodha.xlsx");
		Workbook wb = WorkbookFactory.create(myfile);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(rownumber);
		short totalcol = row.getLastCellNum();
		
		return totalcol;
	}
	
	

}
