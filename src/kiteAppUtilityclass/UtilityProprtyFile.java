package kiteAppUtilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityProprtyFile {
	
	public static String readpropetyfile(String key) throws IOException
	{
		Properties p=new Properties();
		
		FileInputStream property=new FileInputStream("C:\\Users\\kishor\\eclipse-workspace\\selenium_project\\src\\propertyfile");
		
		p.load(property);
		
		String value=p.getProperty(key);
		
		return value;
	}
	
//	public static void takeScreenshot(WebDriver driver) throws IOException
//	{
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		String Random = RandomString.make(3);
//		
//		File dest= new File("E:\\seleniumScreenshot\\scrShotListener"+Random+".png");
//		
//		FileHandler.copy(source, dest);
//	}
	
	public static void wait(WebDriver driver,int TimeSeconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeSeconds));
	}

}
