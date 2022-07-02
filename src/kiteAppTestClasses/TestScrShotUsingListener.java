package kiteAppTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClassPropertyFile;
import kiteAppPom.KiteHomepage4;
import kiteAppPom.KiteLogIn4;
import kiteAppPom.KitePinPage4;
import kiteAppUtilityclass.UtilityProprtyFile;

@Listeners(testNGListeners.Listener1.class)

public class TestScrShotUsingListener extends BaseClassPropertyFile{
	KiteLogIn4 login;
	KiteHomepage4 home;
	KitePinPage4 pin;

	@BeforeClass
	public void lauchbrowser() throws IOException
	{
		openBrowser();
		login = new KiteLogIn4(driver);
		home = new KiteHomepage4(driver);
		pin = new KitePinPage4(driver);
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		
		login.sendUserName(UtilityProprtyFile.readpropetyfile("UN"));
		login.sendPassword(UtilityProprtyFile.readpropetyfile("PWD"));
		login.clickLoginButton();
		UtilityProprtyFile.wait(driver, 5);
		pin.sendPin(UtilityProprtyFile.readpropetyfile("PIN"));
		pin.clickcontinue();
		UtilityProprtyFile.wait(driver, 5);	
	}
	
	@Test
  public void Validateuser() throws EncryptedDocumentException, IOException {
		String actualname = home.actualuser();
		String expectedname = UtilityProprtyFile.readpropetyfile("UN1");
		
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
		UtilityProprtyFile.wait(driver, 3);
		driver.close();
	}
}
