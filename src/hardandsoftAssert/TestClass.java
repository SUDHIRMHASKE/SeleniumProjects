package hardandsoftAssert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass {
	WebDriver driver;
	KiteHomepage home;
	KiteLogIn login;
	KitePinPage userpin;
	LogOutPage logout;
	SoftAssert sa;
  
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		login=new KiteLogIn(driver);
		userpin=new KitePinPage(driver);
		home= new KiteHomepage(driver);
		logout= new LogOutPage(driver);
		
	}
	
	@Test(dataProvider="logdata",priority = -1)
	public void logintoKitezerodha(String user,String pwd,String pin) throws InterruptedException
	{
	
	login.sendUserName(user);
	login.sendPassword(pwd);
	login.clickLoginButton();
	Thread.sleep(1000);
	userpin.sendPin(pin);
	login.clickLoginButton();
	}
	
	@DataProvider(name="logdata")
	public String[][] logindata() throws EncryptedDocumentException, IOException
	{
		File myfile= new File("E:\\excelpractice\\Zerodha.xlsx");
		Row row = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1);
		String user = row.getCell(0).getStringCellValue();
		String pwd = row.getCell(1).getStringCellValue();
		String pin = row.getCell(2).getStringCellValue();
		String data[][]= {{user,pwd,pin}};
		return data;
	}
	
	@Test(dataProvider="logdata")
	public void verification(String user1,String pwd1,String pin)
	{
		
		sa= new SoftAssert();
		sa.assertEquals(home.actualuser(),user1 );
		
	}
	
	@AfterMethod(enabled = false)
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		logout.ClickOnUserName();
		logout.ClickOnLogout();
	}
	
	
}
