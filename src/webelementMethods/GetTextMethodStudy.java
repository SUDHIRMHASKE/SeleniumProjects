package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethodStudy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://upstox.com/");
		String actualText = driver.findElement(By.xpath("//div[text()='Own your future with Upstox']")).getText();
		
		String expectedText="Own your future with Upstox";
		
		if(expectedText.equals(actualText))
		{
			System.out.println("Text is mathching no requirement hampered");
		}
		else 
		{
			System.out.println("Tex is not mathched requirement hampered");
		}
		
		

	}

}
