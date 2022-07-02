package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_ClearMethodStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(100);
		WebElement textbox = driver.findElement(By.xpath("//input[@maxlength='2048']"));
		
		textbox.sendKeys("Entered Text to Clear");
		Thread.sleep(300);
		textbox.clear();
		Thread.sleep(3000);
		driver.close();

	}

}
