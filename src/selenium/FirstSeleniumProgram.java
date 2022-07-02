package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe"); // TO ACCESS CHROME BROWSER
		
		WebDriver driver = new ChromeDriver();   // OBJECT OF CHROME DRIVER IS CRATED
		
		// WEB DRIVER METHODS TO CONTROL BROWSER ACTIONS
		// MULTIPLE METHODS SEPERATED USING DOT CALLED CASCADED METHODS EX DRIVER.NAVIGATE().FORWARD(); ETC
		
		driver.get("https://www.youtube.com/");    // GET METHOD TO OPEN URL IN BROWSER
		
		//driver.close();  // TO CLOSE CURRENT OPENED IN BROWSER USING SELENIUM TOOL
		
		//driver.quit();  // TO CLOSE ALL TABS IN BROWSER OPENED USING SELENIUM TOOL
		
		// TO MANAGE WINDOW MAXIMIZE AND MINIMIZE
		
		driver.manage().window().maximize(); // TO MAXIMIZE WINDOW WHICH OPENED BY SELENIUM TOOL
		
		//driver.manage().window().minimize(); // TO MINIMIZE CURRENT WINDOW OPENED BY SELENIUM TOOL
		
		// TO NAVIGATE IN OTHER WINDOWS, RETURN BACK TO PREVIOUS AND FORWARD AND REFRESH WINDOW
		
		driver.navigate().to("https://www.flipkart.com/"); // TO OPEN ANOTHER URL IN BROWSER WINDOW --TO VISIT MULTIPLE PAGES
		
		driver.navigate().back(); // TO NAVIGATE BACK INTO PREVIOUS BROWSER WINDOW WHICH ALREADY OPENED i.e. YOUTUBE.COM
		
		driver.navigate().forward(); // TO NAVIGATE TO NEXT BROSER WINDOW WHICH ALREADY OPENED i.e. FLIPCART.COM
		
		driver.navigate().refresh(); // TO REFRESH CURRENT TAB 
		

	}

}
