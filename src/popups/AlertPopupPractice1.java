package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupPractice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		button.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		WebElement text = driver.findElement(By.id("demo"));
		String actualtxt = text.getText();
		String expectedTxt="You pressed Ok";
		if(actualtxt.equals(expectedTxt)==true)
		{
			System.out.println("Actual Text : "+actualtxt);
			System.out.println("Expected Text : "+expectedTxt);
			System.out.println("Test case passed : expected text matched if ok button pressed");
		}
		System.out.println("----------------------------------------------------------------------------");
		button.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		WebElement text1 = driver.findElement(By.id("demo"));
		String actualtxt1 = text1.getText();
		String expectedTxt1="You Pressed Cancel";
		if(actualtxt1.equals(expectedTxt1)==true)
		{
			System.out.println("Actual Text : "+actualtxt1);
			System.out.println("Expected Text : "+expectedTxt1);
			System.out.println("Test case passed : expected text matched if Cancel button pressed");
		}
		

	}

}
