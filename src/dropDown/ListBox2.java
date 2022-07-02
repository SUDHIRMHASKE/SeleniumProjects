package dropDown;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		
		List<WebElement> availablemonths = s.getOptions();
		TreeSet<String> ts = new TreeSet<String>();
		
		for(WebElement ele:availablemonths)
		{
			String text = ele.getText();
			ts.add(text);
		}
		System.out.println(ts);
		
		for(String s1:ts)
		{
			System.out.println(s1);
		}
	}

}
