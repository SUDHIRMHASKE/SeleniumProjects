package crossBrowserTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class KiteBaseClassCT {

	protected static WebDriver driver;
	public void openBrowser()
	{
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void chromebrowser()
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver(opt);
	}
	
	public void firefoxbrowser()
	{
		FirefoxOptions opt1=new FirefoxOptions();
		opt1.addArguments("headless");
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver(opt1);
	}
	
	public void edgebrowser()
	{
		EdgeOptions opt2=new EdgeOptions();
		opt2.addArguments("incognito");
		System.setProperty("webdriver.edge.driver", "E:\\selenium\\msedgedriver.exe");
		driver = new EdgeDriver(opt2);
	}

}
