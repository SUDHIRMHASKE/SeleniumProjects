package kiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAppUtilityclass.UtilityProprtyFile;
import net.bytebuddy.utility.RandomString;

public class BaseClassPropertyFile {
	
public static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(UtilityProprtyFile.readpropetyfile("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void takeScreenshotusingListener(String TCname) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(4);
		
		File dest=new File("E:\\seleniumScreenshot\\scrShotListener"+random+".jpg");
		
		FileHandler.copy(source, dest);
	}
}
