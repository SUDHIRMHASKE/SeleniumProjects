package excelReading;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriting {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("E:\\excelpractice\\HRM.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		cell.setCellValue("selenium");
		FileOutputStream fos = new FileOutputStream("E:\\excelpractice\\HRM.xlsx");
		wb.write(fos);

		
	}

}
