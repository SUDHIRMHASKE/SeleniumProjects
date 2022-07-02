package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotStudy {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//takes screenshot of full page
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination= new File("E:\\seleniumScreenshot\\myscrShot.png");
		FileHandler.copy(Source, Destination);
		
		//add Random string in screenshot name
		String random=RandomString.make(4);
		File Destination1= new File("E:\\\\seleniumScreenshot\\\\myscrShot"+random+".jpg");
		FileHandler.copy(Source, Destination1);
		
		//take screenshot of specific section
		WebElement sectionofpage = driver.findElement(By.xpath("//div[@role='note']"));
		File source2 = sectionofpage.getScreenshotAs(OutputType.FILE);
		File Destination2= new File("E:\\seleniumScreenshot\\SECTION"+random+".jpg");
		FileHandler.copy(source2, Destination2);
		
		//takes screenshot of specific element
		WebElement elementonpage = driver.findElement(By.id("logo"));
		File source3 = elementonpage.getScreenshotAs(OutputType.FILE);
		File Destination3= new File("E:\\seleniumScreenshot\\Element"+random+".jpg");
		FileHandler.copy(source3, Destination3);

	}

}
