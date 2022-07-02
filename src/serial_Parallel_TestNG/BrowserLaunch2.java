package serial_Parallel_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BrowserLaunch2 {
  @Test
  public void Launch2() {
	  System.out.println("Thread for Browserlaunch2 : "+Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Mymethod2 is running");

  }
}
