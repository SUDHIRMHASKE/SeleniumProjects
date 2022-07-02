package kiteAppUtilityclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility {
	
	public static String readXldata(int rownumber, int cellnumber) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("E:\\excelpractice\\Zerodha.xlsx");
		Workbook wb = WorkbookFactory.create(myfile);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(rownumber);
		Cell cell = row.getCell(cellnumber);
		String xldata = cell.getStringCellValue();
		return xldata;
		
//		File myfile=new File("E:\\excelpractice\\Zerodha.xlsx");
//		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
//		String myvalue = mysheet.getRow(rownumber).getCell(cellnumber).getStringCellValue();
//		return myvalue;
//		
	}
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(4);
		File Destination= new File("E:\\seleniumScreenshot\\ScreenshotTest"+random+".png");
		
		FileHandler.copy(Source, Destination);
	}
	
	public static void wait(WebDriver driver,int duration)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}

}
