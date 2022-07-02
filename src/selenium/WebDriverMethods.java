package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe"); // TO ACCESS CHROME BROWSER
		
		WebDriver driver = new ChromeDriver();   // OBJECT OF CHROME DRIVER IS CRATED
		
		driver.navigate().to("https://kite.zerodha.com/");
		
		String title=driver.getTitle();
		
		System.out.println("Title of webpage is "+title);
		
		System.out.println("Directly printing Title "+driver.getTitle());
		
		String Url=driver.getCurrentUrl();
		
		System.out.println("Url of website is "+Url);
		
		System.out.println("Directly printing Url "+driver.getCurrentUrl());

	}

}
