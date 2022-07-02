package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement ele1 = driver.findElement(By.xpath("//a[contains(text(),\"OWNER'S EQUITY\")]"));
		Actions act= new Actions(driver);
		
		// Move to element using mouse action
		act.moveToElement(ele1).perform();
		
		//Click on webelement using mouse action
		WebElement ele2 = driver.findElement(By.xpath("//a[contains(text(),'SEO')]"));
		//1st way
		//act.moveToElement(ele2).perform();
		//act.click().perform();
		
		//2nd way
		//act.moveToElement(ele2).click().build().perform();
		
		//3rd way
		//act.click(ele2).perform();
		
		//Right Click ----- Context Click
		//act.moveToElement(ele2).contextClick().build().perform();
		act.contextClick(ele2).perform();

	}

}
