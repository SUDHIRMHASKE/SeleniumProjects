package selfPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("userid")).sendKeys("CKD333");
		driver.findElement(By.id("password")).sendKeys("123245");
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(1000);
		
		WebElement msg = driver.findElement(By.xpath("//p[@class='error text-center']"));

		
		System.out.println(msg.getText());
		
	

	}

}
