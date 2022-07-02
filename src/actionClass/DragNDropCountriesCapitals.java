package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDropCountriesCapitals {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//Capitals
		WebElement Oslo = driver.findElement(By.id("box1"));
		WebElement Stockholm = driver.findElement(By.id("box2"));
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement Copenhagen = driver.findElement(By.id("box4"));
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement Rome = driver.findElement(By.id("box6"));
		WebElement Madrid = driver.findElement(By.id("box7"));
		
		//countries
		WebElement Italy = driver.findElement(By.id("box106"));
		WebElement Spain = driver.findElement(By.id("box107"));
		WebElement Norway = driver.findElement(By.id("box101"));
		WebElement Denmark = driver.findElement(By.id("box104"));
		WebElement SouthKorea = driver.findElement(By.id("box105"));
		WebElement Sweden = driver.findElement(By.id("box102"));
		WebElement UnitedStates = driver.findElement(By.id("box103"));
		
		//drag and drop
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Rome, Italy).dragAndDrop(Washington, UnitedStates).build().perform();
		act.dragAndDrop(Oslo,Norway).dragAndDrop(Seoul, SouthKorea).build().perform();
		act.dragAndDrop(Madrid, Spain).dragAndDrop(Copenhagen, Denmark).build().perform();
		act.dragAndDrop(Stockholm,Sweden).perform();

	}

}
