package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClass1;
import kiteAppPom.KiteHomepage4;
import kiteAppPom.KiteLogIn1;
import kiteAppPom.KitePin1;
import kiteAppUtilityclass.Utility;
import kiteAppUtilityclass.Utility1;

public class userValidation1 extends BaseClass1 {
	KiteLogIn1 login;
	KitePin1 pin;
	KiteHomepage4 home;
	protected void initialize(WebDriver WebDriver)
	{
		WebDriver=driver;
	}
	@BeforeClass
	public void launchBrowser()
	{
	openBrowser();
	login=new KiteLogIn1(driver);
	pin= new KitePin1(driver);
	home= new KiteHomepage4(driver);
	}
	@BeforeMethod(alwaysRun = true)
	public void loginToKiteApp() throws EncryptedDocumentException,IOException
	{
		String user = Utility1.readDataFormExcel(1, 0);
		System.out.println(user);
	login.sendUserName(user);
	String pwd = Utility1.readDataFormExcel(1, 1);
	login.sendPassword(pwd);
	login.clickOnLoginButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	pin.sendPin(Utility1.readDataFormExcel(1, 2));
	pin.clickOnContinueButton();
	}
	@Test
	 public void validateUserName() throws EncryptedDocumentException, IOException
	{
	String actualUserName =home.actualuser();
	String expectedUserName=Utility1.readDataFormExcel(1, 0);
	Assert.assertEquals(actualUserName, expectedUserName,"TC is FAILED actual and expected user names not matching");
	Reporter.log("User names are matching TC is passed", true);
	Utility.takeScreenshot(driver);
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
