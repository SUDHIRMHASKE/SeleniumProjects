package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class I_Frame_Sample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//switch selenium focus from main page to frame
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(500);
		//current focus is on frame now
		
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click(); // this element is present on iframe(need to switch selenium focus from main page to frame)
		Thread.sleep(500);
		
		// to take action on main page again, we need to switch selenium  focus from frame to main page
		driver.switchTo().parentFrame();  // switching selenium focus to main page
		
		WebElement selectoption = driver.findElement(By.id("dropdown-class-example"));
		
		Select s= new Select(selectoption);
		
		s.selectByVisibleText("Option3");

	}

}
