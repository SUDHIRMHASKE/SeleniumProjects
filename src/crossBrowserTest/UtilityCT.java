package crossBrowserTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityCT {
	
	public static String readDataFormExcel(int row, int cell) throws
	EncryptedDocumentException, IOException
	{
	File MyFile=new File("E:\\excelpractice\\Zerodha.xlsx");
	Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
	Row row1 = mySheet.getRow(row);
	Cell cell1 = row1.getCell(cell);
	String myValue = cell1.getStringCellValue();
	return myValue;
	}
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String random=RandomString.make(3);
	File dest= new File("E:\\seleniumScreenshot\\ScreenshotTest"+random+".png");
	FileHandler.copy(src, dest);
	}
	
	public static void wait(WebDriver driver,int duration)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}

}
