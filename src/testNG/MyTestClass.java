package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void mymethod1() {
	  System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://webdriveruniversity.com/index.html");
		System.out.println("mymethod1 is running");
  }
  
  @Test
  public void mymethod2() {
	  System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Mymethod2 is running");
  }
  
  @Test
  public void mymethod3() {
	  System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Reporter.log("Mymethod3 is running ", true);
  }
}
