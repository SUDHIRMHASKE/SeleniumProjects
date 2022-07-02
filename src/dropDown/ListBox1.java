package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement createAccount = driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]"));
		createAccount.click();
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		//select day----by Index
		Select s= new Select(day);
		s.selectByIndex(4);
		
		//select month----By visible text
		Select s1= new Select(month);
		s1.selectByVisibleText("Mar");
		
		//Select year-----By Value
		Select s2 = new Select(year);
		s2.selectByValue("2020");
		
		// To check multiple selection allowed or not
		System.out.println("Is Multiple Selection allowed "+s.isMultiple());
		
		//To Selectl Value Serially
		for(int i=0; i<=11; i++)
		{
			s1.selectByIndex(i);
			Thread.sleep(3000);
		}
	}

}
