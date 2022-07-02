package selfPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> ar=  new ArrayList<String>(ids);
//		for(String id:ar)
//		{
//			System.out.println(id);
//		}
		driver.switchTo().window(ar.get(1));
		Thread.sleep(5000);
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		driver.switchTo().window(ar.get(2));
		Thread.sleep(5000);
		String text1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text1);
		
	}

}
