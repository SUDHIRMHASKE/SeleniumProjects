package waitsInSelenium;



import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder]")).sendKeys("Mobiles");
		
		driver.get("https://www.indiamart.com/");
		driver.findElement(By.id("search-input")).sendKeys("Mobiles");
		
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("Mobiles");
	}
}
