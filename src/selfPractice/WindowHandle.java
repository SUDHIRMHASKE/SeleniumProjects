package selfPractice;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		String parenthandle = driver.getWindowHandle();
		Thread.sleep(500);
		System.out.println(parenthandle);
		
		driver.findElement(By.xpath("//a[contains(@title,'Get Your Own Website With W3Schools')]")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for(String hand:handles) {
		System.out.println(hand);
		if(!hand.equalsIgnoreCase(parenthandle))
		{
			driver.switchTo().window(hand);
			driver.manage().window().maximize();
			driver.close();
		}
		}
		Thread.sleep(5000);
		driver.switchTo().window(parenthandle);
	

	}

}
