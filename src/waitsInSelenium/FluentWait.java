package waitsInSelenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class FluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Declare and Initialize Fluent wait
		Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofMillis(5500))
		//Specify polling time
		.pollingEvery(Duration.ofMillis(500))
		//Specify what exceptions to ignore
		.ignoring(NoSuchElementException.class);
		
		driver.get("https://demoqa.com/checkbox");
		
		WebElement element= wait.until(new Function<WebDriver, WebElement>()
				{
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//span[text()='Home']"));
			}
				});
		
		element.click();

	}

}
