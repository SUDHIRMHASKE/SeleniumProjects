package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopupPractice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		button.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("SUDHIR");
		alert1.accept();
		WebElement text = driver.findElement(By.id("demo1"));
		String actualtxt = text.getText();
		String expectedTxt="Hello SUDHIR How are you today";
		if(actualtxt.equals(expectedTxt)==true)
		{
			System.out.println("Actual Text : "+actualtxt);
			System.out.println("Expected Text : "+expectedTxt);
			System.out.println("Test case passed : expected text matched if ok button pressed");
		}

	}

}
