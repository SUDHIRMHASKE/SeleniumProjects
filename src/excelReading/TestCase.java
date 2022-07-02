package excelReading;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		File myfile= new File("E:\\excelpractice\\HRM.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		Row row = sheet.getRow(0);
			
		driver.findElement(By.id("txtUsername")).sendKeys(row.getCell(0).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.id("txtPassword")).sendKeys(row.getCell(1).getStringCellValue());
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(row.getCell(2).getStringCellValue());
		driver.findElement(By.id("empsearch_id")).sendKeys(row.getCell(3).getStringCellValue());
		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys(row.getCell(4).getStringCellValue());
		driver.findElement(By.id("searchBtn")).click();
		
		String actualresult = driver.findElement(By.xpath("(//td)[5]")).getText();
		String expectedresult="Engineer";
		if(expectedresult.equals(actualresult))
		{
			System.out.println("Job Title is Matching : Test Case Passed");
		}
		else
		{
			System.out.println("Job Title is Not Matching : Test Case Failed");
		}
		
	}

}
