package selfPractice;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListStudy {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		String s1="//input[@name='checkBoxOption1']";
		String s2="//input[@name='checkBoxOption2']";
		String s3="//input[@name='checkBoxOption3']";
		
		ArrayList<String> al= new ArrayList<String>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);
		
		WebElement option1 = driver.findElement(By.xpath(al.get(0)));
//		WebElement option2 = driver.findElement(By.xpath(al.get(1)));
//		WebElement option3 = driver.findElement(By.xpath(al.get(2)));
//		option1.click();
//		option2.click();
//		option3.click();
		for (int i=0; i<=2 ;i++)
		{
			driver.findElement(By.xpath(al.get(i))).click();
		}
		
		Dimension d= new Dimension(400,400);
		driver.manage().window().setSize(d);
		
		Point p = new Point(900,0);
		driver.manage().window().setPosition(p);
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", option1);
		
			}
}
