package scrolling;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolling1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		//scroll at point given
		//js.executeScript("window.scrollBy(0,5000)");                     
		
		// scroll at bottom of page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//h1[text()='DATEPICKER']")).click();
		Set<String> ID = driver.getWindowHandles();
		ArrayList<String> ids= new ArrayList<>(ID);
		driver.switchTo().window(ids.get(1));
		WebElement cal = driver.findElement(By.xpath("//span[@class='input-group-addon']"));
		wait.until(ExpectedConditions.visibilityOf(cal));
		cal.click();
		 List<WebElement> days = driver.findElements(By.xpath("//table[@class=' table-condensed']/thead/tr[2]/th"));
		 int count = days.size();
		 for(int i=1; i<=count; i++)
		 {
			 WebElement listday = driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr[2]/th["+i+"]"));
			 String dayname = listday.getText();
			 System.out.print(dayname+" | ");
		 }
		 List<WebElement> rowcount = driver.findElements(By.xpath("//table[@class=' table-condensed']/tbody/tr"));
		 List<WebElement> colcount = driver.findElements(By.xpath("//table[@class=' table-condensed']/tbody/tr[1]/td"));
		 System.out.println();
		 for(int i=1; i<=rowcount.size(); i++) {
			 for (int j=1; j<=colcount.size(); j++) {
				 WebElement date = driver.findElement(By.xpath("//table[@class=' table-condensed']/tbody/tr["+i+"]/td["+j+"]"));
				 String date1 = date.getText();
				 System.out.print(date1+" | ");
			 }
			 System.out.println();
		 }
	}

}
