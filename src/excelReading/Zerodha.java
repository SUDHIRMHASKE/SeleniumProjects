package excelReading;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			System.setProperty( "webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get( "https://kite.zerodha.com/");
			//driver.manage().window().maximize();
			File myfile=new File("E:\\excelpractice\\Zerodha.xlsx");
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet( "sheet1");
			int totalrows = mysheet.getLastRowNum();
			int totalcell = mysheet.getRow(0).getLastCellNum()-1;
				 System.out.println(totalrows);
				 System.out.println(totalcell);
				 
			ArrayList<String> element = new ArrayList<String>();
			
			for(int i=0;i<=totalrows;i++) {
				for(int j=0;j<=totalcell;j++) {					
				String temp = mysheet.getRow(i).getCell(j).getStringCellValue();
				element.add(temp);
				System.out.println(element.get(j));
				}
			}
			
			driver.findElement( By.id("userid")).sendKeys(element.get(0));
			driver.findElement( By.id( "password")).sendKeys(element.get(1));
			driver.findElement(By.xpath( "//button[@type='submit']") ).click();
			Thread.sleep(1000);
			driver.findElement(By.id("pin")).sendKeys(element.get(2));	
			driver.findElement( By.xpath( "//button[@type='submit']")).click();			 
			Thread.sleep(1000);
			String actualuser = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
			String expecteduser =element.get(0);
			if(expecteduser.equals(actualuser))
			{
					System.out.println("Test case passed : Valid user");	
			}
			else 
			{
					System.out.println("Test case Failed : Invalid user");
			}
			driver.findElement(By.xpath("//span[@class='user-id']")).click();
			WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
			logout.click();				
	}
}
