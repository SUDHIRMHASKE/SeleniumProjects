package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.roblox.com/");
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.id("MonthDropdown"));
		WebElement days = driver.findElement(By.id("DayDropdown"));
		 
		Select s=new Select(month);
		Select s1=new Select(days);
		s.selectByVisibleText("June");
		Thread.sleep(1000);
		s.selectByIndex(10);
		Thread.sleep(1000);
		s.selectByValue("Feb");
		
		for (int i=0; i<=31; i++)
		{
			s1.selectByIndex(i);
		}
		
		for (int i=1; i<=12; i++)
		{
			String months = s.getOptions().get(i).getText();
			System.out.print(months+" ");
			
		}
	}

}
