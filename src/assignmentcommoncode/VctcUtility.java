package assignmentcommoncode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class VctcUtility {
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(4);
		File Destination= new File("E:\\seleniumScreenshot\\ScreenshotTest"+random+".png");
		
		FileHandler.copy(Source, Destination);
	}
	
	public static void scrollpage(WebDriver driver,WebElement Element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",Element);
	}
	
	public static void wait(WebDriver driver,int duration)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	
	public static String VctcDataProperty(String key) throws IOException
	{
		Properties obj= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\kishor\\eclipse-workspace\\selenium_project\\src\\assignmentcommoncode\\VctcData");
		obj.load(fis);
		String value = obj.getProperty(key);
		return value;
	}
	

}
