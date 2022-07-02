package miscelleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartReviews {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("flipkart redmi note");
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		String expectedtxt="flipkart redmi note 11 pro";
		for(WebElement res:result)
		{
			System.out.println(res.getText());
			String actualtxt = res.getText();
			if(actualtxt.equals(expectedtxt))
			{
				res.click();
				break;
			}
		}
		driver.findElement(By.xpath("//h3[contains(text(),'Mi REDMI Note 11 Pro')]")).click();
		
		WebElement rating = driver.findElement(By.xpath("(//div[@class='col-12-12']/span)[1]"));
		WebElement review = driver.findElement(By.xpath("(//div[@class='col-12-12']/span)[2]"));
		
		System.out.println("===========================================");
		System.out.println(rating.getText()+" "+review.getText());
	}

}
