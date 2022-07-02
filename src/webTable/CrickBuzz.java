package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickBuzz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/45101/mdx-vs-gloucs-south-group-t20-blast-2022");
		//List<WebElement> row = driver.findElements(By.xpath("//body/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div"));
		List<WebElement> column = driver.findElements(By.xpath("//body/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div[2]/div"));
		
		for(int i=2; i<=12; i++)
		{
			for(int j=1; j<=column.size(); j++)
			{
		String txt = driver.findElement(By.xpath("//body/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div["+i+"]/div["+j+"]")).getText();
		System.out.print(" "+txt+" ");	
				
			}
		System.out.println();
		}
	}
}
