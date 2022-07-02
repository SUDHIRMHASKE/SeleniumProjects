package kiteAppTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClass;
import kiteAppPom.KiteHomepage4;
import kiteAppPom.KiteLogIn4;
import kiteAppPom.KitePinPage4;
import kiteAppUtilityclass.Utility;

public class UserValidation extends BaseClass {
	KiteLogIn4 login;
	KiteHomepage4 home;
	KitePinPage4 pin;
//	protected void initialize(WebDriver WebDriver)
//	{
//		WebDriver=driver;
//	}
//  
	@BeforeClass
	public void lauchbrowser()
	{
		openBrowser();
		login = new KiteLogIn4(driver);
		home = new KiteHomepage4(driver);
		pin = new KitePinPage4(driver);
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		System.out.println(Utility.readXldata(1, 0));
		System.out.println(Utility.readXldata(1, 1));
		System.out.println(Utility.readXldata(1, 2));
		login.sendUserName(Utility.readXldata(1, 0));
		login.sendPassword(Utility.readXldata(1, 1));
		login.clickLoginButton();
		Utility.wait(driver, 10);
		pin.sendPin(Utility.readXldata(1, 2));
		pin.clickcontinue();
		Utility.wait(driver, 10);	
	}
	
	@Test
  public void Validateuser() throws EncryptedDocumentException, IOException {
		String actualname = home.actualuser();
		String expectedname = Utility.readXldata(1, 0);
		
		Assert.assertEquals(actualname, expectedname, "Actual and expected user not matching TC Failed");
		Reporter.log("Actual and expected user matching TC passed", true);
	  
  }
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		home.ClickOnLogout();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		
	}
	
}
