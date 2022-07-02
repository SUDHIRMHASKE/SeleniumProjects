package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		 org.openqa.selenium.WebElement button = driver.findElement(By.xpath("//section[@class='sc-bLJvFH gNTUkm']"));
		
		System.out.println(button.isEnabled());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8899776655");
		System.out.println(button.isEnabled());
	}

}
