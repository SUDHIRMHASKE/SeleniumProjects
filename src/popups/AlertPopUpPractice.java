package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(400);
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(400);
		String actualTxt = alert1.getText();
		String expectedTxt="I am an alert box!";
		
		if(actualTxt.equals(expectedTxt)==true)
		{
			System.out.println("Actual Text : "+actualTxt);
			System.out.println("Expected Text : "+expectedTxt);
			System.out.println("actual and expected text matched : Test case passed");
		}
		
		//alert1.accept();
		
		
	}

}
