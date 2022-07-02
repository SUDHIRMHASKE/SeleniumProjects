package serial_Parallel_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BrowserLaunch3 {
  @Test
  public void Launch3() {
	  System.out.println("Thread for Browserlaunch3 : "+Thread.currentThread().getId());

	  	System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Reporter.log("Mymethod3 is running ", true);
  }
}
