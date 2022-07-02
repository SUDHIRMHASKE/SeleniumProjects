package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//GET METHOD
		driver.get("https://www.w3schools.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//MAXIMIZE AND MINIMIZE
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.getWindowHandle();
		//NAVIGATE METHOD
		
		driver.navigate().to("https://www.swiggy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.zomato.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.close();
		Thread.sleep(10000);
		driver.quit();
		

	}

}
