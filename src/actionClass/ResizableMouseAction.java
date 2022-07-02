package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableMouseAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0, 300)");

		driver.switchTo().frame(0);
		
		
		WebElement resize = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Actions act= new Actions(driver);
		act.moveToElement(resize).click().dragAndDropBy(resize,200,200).build().perform();
		Thread.sleep(3000);


	}

}
