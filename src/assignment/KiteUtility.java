package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class KiteUtility {
	
	public static void wait(WebDriver driver,int duration)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	
	public static String KiteProperty(String key) throws IOException
	{
		Properties obj= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\kishor\\eclipse-workspace\\selenium_project\\src\\assignment\\KiteLogData");
		obj.load(fis);
		String value = obj.getProperty(key);
		return value;
	}

}
