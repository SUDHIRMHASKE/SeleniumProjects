package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(500);
		
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		Integer numofframe = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("number of frames are = "+numofframe);
		
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(frame2);
		Thread.sleep(500);
		WebElement text1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(text1.getText());
		
		driver.switchTo().parentFrame();
		Thread.sleep(500);
		System.out.println(driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());
		
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		System.out.println(driver.getTitle());
	}

}
