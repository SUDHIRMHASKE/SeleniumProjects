package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://vctcpune.com/selenium/practice.html");
		List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/th"));
		int columncount = col.size();
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowcount = row.size();
		
		System.out.println("Print table by using for loop =================================\n");
		for(int i=1; i<=rowcount; i++)
		{
			for(int j=1; j<=columncount; j++)
			{
				if(i==1)
				{
					String value = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/th["+j+"]")).getText();
					System.out.print(value+" | ");
				}
				else
				{
					String value = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(value+" | ");
				}
			}
			System.out.println();
		}
		
		//By for each loop
		System.out.println("Print table by using for each loop =================================\n");
		
		for(WebElement ro:row)
		{
			String values = ro.getText();
			System.out.print(values+" | ");
			System.out.println();
		}
		

	}

}
