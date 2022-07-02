package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMehod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe"); // TO ACCESS CHROME BROWSER
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.snapdeal.com/search?keyword=in&santizedKeyword=shoes+for+men&catId=0&categoryId=0&suggested=false&vertical=p&noOfResults=20&searchState=&clickSrc=go_header&lastKeyword=&prodCatId=&changeBackToAll=false&foundInAll=false&categoryIdSearched=&cityPageUrl=&categoryUrl=&url=&utmContent=&dealDetail=&sort=rlvncy");
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("inputValEnter")).clear();
		Thread.sleep(100);
		 WebElement loginbutton = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		
		 System.out.println(loginbutton.isEnabled());

	}

}
