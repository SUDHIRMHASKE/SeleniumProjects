package scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSizeAndPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://webdriveruniversity.com/index.html");
			
		Dimension dim = new Dimension(516,400);
		driver.manage().window().setSize(dim);
		
		Point pt = new Point(850,100);
		driver.manage().window().setPosition(pt);
		
		System.out.println("Current size of window :"+driver.manage().window().getSize());
		System.out.println("Current position of window :"+driver.manage().window().getPosition());

	}

}
