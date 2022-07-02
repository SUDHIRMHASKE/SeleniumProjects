package miscelleneous;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for(int i=0; i<=links.size()-1; i++)
		{
			WebElement lin = links.get(i);
			String url = lin.getAttribute("href");	
			URL link= new URL(url);
			//Create a connection using url object link
			HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();  
			
			Thread.sleep(1000);
			httpconn.connect();  //establish connection	
			int code = httpconn.getResponseCode();//return response code--
			                               //if response code >= 400--link is broken
			if(code>=400)
			{
				System.out.println(url+"-"+" is broken link");
			}
			else
			{
				System.out.println(url+"-"+" is valid link");
			}
		}
	}
}
