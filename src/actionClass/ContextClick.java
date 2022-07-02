package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclk = driver.findElement(By.xpath("//span[contains(@class,'context')]"));
		WebElement del = driver.findElement(By.xpath("//span[text()='Delete']"));
		Actions act = new Actions(driver);
		
		act.contextClick(rightclk).click(del).build().perform();
		
		//driver.switchTo().alert().accept();

	}

}
