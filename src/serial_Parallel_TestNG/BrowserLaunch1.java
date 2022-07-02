package serial_Parallel_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch1 {
  @Test
  public void Launch1() {
	  System.out.println("Thread for Browserlaunch1 : "+Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://webdriveruniversity.com/index.html");
		System.out.println("mymethod1 is running");
  }
}
