package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement dest = driver.findElement(By.id("bank"));
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest1 = driver.findElement(By.id("amt7"));
		WebElement source2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement dest2 = driver.findElement(By.id("loan"));
		WebElement source3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dest3 = driver.findElement(By.id("amt8"));
		Actions act= new Actions(driver);
		//1st way
		act.dragAndDrop(source, dest).perform();
		act.dragAndDrop(source1, dest1).perform();
		
		//2nd way
		act.clickAndHold(source2).moveToElement(dest2).release().build().perform();
		act.clickAndHold(source3).moveToElement(dest3).release().build().perform();
		
		WebElement perfect = driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",perfect);

	}

}
