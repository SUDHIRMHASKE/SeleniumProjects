package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).clear();
		Thread.sleep(3000);
	    WebElement button = driver.findElement(By.xpath("//button[@class='sc-1kx5g6g-1 dlCvBh sc-cANqwJ bJkgYO']"));
		Thread.sleep(2000);
		System.out.println(button.isEnabled());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8899776655");
		Thread.sleep(2000);
		System.out.println(button.isEnabled());
	}


}
