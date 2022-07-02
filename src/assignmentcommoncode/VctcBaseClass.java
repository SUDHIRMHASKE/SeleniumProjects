package assignmentcommoncode;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VctcBaseClass {
	
	//browser setup
	public WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver(opt);
		driver.get(assignmentcommoncode.VctcUtility.VctcDataProperty("URL"));
		driver.manage().window().maximize();
		
	}

}
