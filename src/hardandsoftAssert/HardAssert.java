package hardandsoftAssert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssert {
	WebDriver driver;
	KiteHomepage home;
	KiteLogIn login;
	KitePinPage userpin;
	LogOutPage logout;
	org.apache.poi.ss.usermodel.Sheet mysheet;
  
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		login=new KiteLogIn(driver);
		userpin=new KitePinPage(driver);
		home= new KiteHomepage(driver);
		logout= new LogOutPage(driver);
		File myfile= new File("E:\\excelpractice\\Zerodha.xlsx");
		mysheet= WorkbookFactory.create(myfile).getSheet("sheet1");
		
	}
	@BeforeMethod
	public void logintoKitezerodha() throws InterruptedException
	{
	
	login.sendUserName(mysheet.getRow(1).getCell(0).getStringCellValue());
	login.sendPassword(mysheet.getRow(1).getCell(1).getStringCellValue());
	login.clickLoginButton();
	Thread.sleep(1000);
	userpin.sendPin(mysheet.getRow(1).getCell(2).getStringCellValue());
	login.clickLoginButton();
	}
	
	@Test
	public void verification() throws InterruptedException
	{
		Thread.sleep(4000);
		String realuser = home.actualuser();
		String expecteduser = mysheet.getRow(1).getCell(0).getStringCellValue();
		Assert.assertEquals(expecteduser, realuser,"Actual and expected user are not matching TC failed");
		Reporter.log("Actual user and expected user are matching TC passed",true);	
		
		
	}
	
	@Test
	public void verification2()
	{
		String realnick = home.nickname();
		String expecteduser ="Vivek";
		Assert.assertEquals(expecteduser, realnick,"Actual and expected nickname are not matching TC failed");
		Reporter.log("Actual and expected nickname are matching TC passed",true);	
	}
	
	@AfterMethod(enabled = false)
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		logout.ClickOnUserName();
		logout.ClickOnLogout();
	}
	

}
