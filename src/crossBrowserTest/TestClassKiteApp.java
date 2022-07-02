package crossBrowserTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestClassKiteApp extends KiteBaseClassCT {
	KiteLoginFun login;
	KitePinFun pin;
	KiteHomeFun home;
	
	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(String browser)
	{
	
		if(browser.equals("chrome"))
		{
			chromebrowser();
		}
		else if(browser.equals("firefox"))
		{
			firefoxbrowser();
		}
		else if(browser.equals("edge"))
		{
			edgebrowser();
		}
		openBrowser();
	UtilityCT.wait(driver, 4);
	login=new KiteLoginFun(driver);
	pin= new KitePinFun(driver);
	home= new KiteHomeFun(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException,IOException
	{
	login.sendUserName(UtilityCT.readDataFormExcel(1, 0));
	login.sendPassword(UtilityCT.readDataFormExcel(1, 1));
	login.clickOnLoginButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	pin.sendPin(UtilityCT.readDataFormExcel(1, 2));
	pin.clickcontinue();
	}
	@Test
	 public void validateUserName() throws EncryptedDocumentException, IOException
	{
	String actualUserName =home.actualuser();
	String expectedUserName=UtilityCT.readDataFormExcel(1, 0);
	Assert.assertEquals(actualUserName, expectedUserName,"TC is FAILED actual and expected user names not matching");
	Reporter.log("User names are matching TC is passed", true);
	
	 }
	@AfterMethod
	public void logoutfromKiteApp() throws InterruptedException
	{
	home.ClickOnLogout();
	}
	@AfterClass
	public void closeBrowser()
	{
	driver.close();
	}
}
