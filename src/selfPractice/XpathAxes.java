package selfPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		//X-path axes by following sibling 
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("abd@gmail.com");
		
		//X-path axes by preceding Sibling and child
		driver.findElement(By.xpath("//td[text()='Germany']/preceding-sibling::td/child::input")).click();
		
		//X-path axes by Following sibling and Parent
		String txt = driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]/parent::div/h1")).getText();
		System.out.println(txt);
		
		//X-path axes by child
		driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][1]")).sendKeys("First Name");
		
		//X-path axes by descendant
		driver.findElement(By.xpath("//div[@class='container']/descendant::button[2]")).click();
		
		//X-path axes by Ancestor and Ancestor-or-self
		String txt1 = driver.findElement(By.xpath("//div[@class='buttons']/ancestor::div/a[1]")).getText();
		System.out.println(txt1);
		driver.findElement(By.xpath("//div[@class='buttons']/ancestor-or-self::div/button[3]")).click();
		
		//X-path by following and preceding
		driver.findElement(By.xpath("//label[text()='Password']/following::input[1]")).sendKeys("password");
		driver.findElement(By.xpath("//label[text()='Password']/preceding::input[1]")).sendKeys("xyz@gmail.com");
		
	}

}
