package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBorardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.textcompare.org/");
		Actions act = new Actions(driver);
		
		WebElement text1 = driver.findElement(By.xpath("(//div[@class='view-line'])[1]"));
		WebElement text2 = driver.findElement(By.xpath("(//div[@data-mprt='7'])[2]"));
		
		//input text /select text / copy text / paste text 
		act.moveToElement(text1).click().sendKeys(text1, "It is random text to compare !").build().perform();//input text
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();      //select text
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();      //copy text
		Thread.sleep(4000);
		act.moveToElement(text2).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();  //paste text
	}
}
