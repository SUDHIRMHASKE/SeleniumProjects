package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/default.asp");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='HTML Course'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='CSS Course'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='JavaScript Course'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Front End Course'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='SQL Course'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Python Course'])[2]")).click();
		
		
		Set<String> winhand = driver.getWindowHandles();
		ArrayList<String> winnumber = new ArrayList<>(winhand);
		for(int i=0; i<=winnumber.size()-1;i++)
		{
			System.out.println("--------------------------------------------------");
			driver.switchTo().window(winnumber.get(i));
			Thread.sleep(7000);
			System.out.println(driver.getTitle());
			
		}
	}

}
