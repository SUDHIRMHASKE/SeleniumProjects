package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(100);
		
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(100);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(100);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(100);
		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();

	}

}
