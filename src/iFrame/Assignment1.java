package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(500);
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(500);
		
		WebElement ClickMe = driver.findElement(By.xpath("//button[@type='button']"));
		
		ClickMe.click();
		ClickMe.getText();
		
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();
	}

}
