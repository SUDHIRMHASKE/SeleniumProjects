package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		// CHECKING FUNCTIONAL FLOW OF WEBSITE SAUCEDEMO.COM BY DIFFERENT XPATH OPTIONS
		//ON SAUCEDEMO WEBSITE LOGIN IN --- ADDING BACK PACK INTO CART
		// CHECKING ADDED OR NOT --- AND LOG OUT FROM WEBSITE
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'log')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Back')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='shopping_cart_link'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

	}

}
