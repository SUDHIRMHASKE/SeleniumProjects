package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(10000);
		WebElement dropdownbox = driver.findElement(By.id("cars"));
		
		Select s = new Select(dropdownbox);
		
		boolean result=s.isMultiple();
		System.out.println("is drop down allow multiple selection "+result);
		
		s.selectByIndex(1);
		Thread.sleep(200);
		s.deselectByIndex(1);
		s.selectByValue("opel");
		Thread.sleep(200);
		s.deselectByValue("opel");
		s.selectByVisibleText("Audi");
		Thread.sleep(200);
		s.deselectByVisibleText("Audi");
		Thread.sleep(200);
		s.selectByVisibleText("Audi");
		s.selectByValue("opel");
		s.selectByIndex(1);
		Thread.sleep(200);
		s.deselectAll();
		
		for (int i=0; i<=3; i++)
		{
			Thread.sleep(300);
			s.selectByIndex(i);
		}
		
		String firstoption = s.getFirstSelectedOption().getText();
		System.out.println("first slected option is "+firstoption);
		
		System.out.println(s.getAllSelectedOptions().size());
		
		for(int i=0; i<=s.getAllSelectedOptions().size()-1; i++)
		{
			String alloption = s.getAllSelectedOptions().get(i).getText();
			System.out.println("options "+i+" "+alloption);
		}

	}

}
