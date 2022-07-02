package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act= new Actions(driver);
		
		//double click
		//1st way
		//act.moveToElement(ele1).perform();
		//act.doubleClick().perform();
		
		//2nd way
		//act.moveToElement(ele1).doubleClick().build().perform();
		
		//3rd way
		act.doubleClick(ele1).perform();
		
		driver.switchTo().alert().accept();
		
		

	}

}
