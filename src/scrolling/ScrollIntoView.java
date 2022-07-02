package scrolling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		
		WebElement datepicker = driver.findElement(By.xpath("//h1[text()='DATEPICKER']"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		Thread.sleep(9000);
		js.executeScript("arguments[0].scrollIntoView(true)",datepicker);
		Thread.sleep(9000);
		datepicker.click();
		
		Set<String> ID = driver.getWindowHandles();
		ArrayList<String> ids= new ArrayList<>(ID);
		
		driver.switchTo().window(ids.get(1));
		
		WebElement cal = driver.findElement(By.xpath("//span[@class='input-group-addon']"));
		
		wait.until(ExpectedConditions.visibilityOf(cal));
		cal.click();
	}

}
