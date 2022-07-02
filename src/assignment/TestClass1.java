package assignment;


import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestClass1 extends SetupBaseClass{

	KiteLogIn1 login;
	KitePinPage2 pin1;
	
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		KiteUtility.wait(driver, 6);
		login=new KiteLogIn1(driver);
		pin1=new KitePinPage2(driver);	
	}
	
	@Test(priority = 4)
	public void loginWithValidCredentials() throws InterruptedException, IOException
	{
	SoftAssert sa= new SoftAssert();
	login.ClearUsernamePasswordTextbox();
	login.sendUserName(assignment.KiteUtility.KiteProperty("username"));
	login.sendPassword(assignment.KiteUtility.KiteProperty("password"));
	login.clickLoginButton();
	KiteUtility.wait(driver, 5);
	sa.assertTrue(pin1.pintxt().isDisplayed(),"Login UnSuccessful using valid data TC Failed");
	Reporter.log("Login Successful using valid data TC Passed", true);
	pin1.sendpin(assignment.KiteUtility.KiteProperty("pin"));
	pin1.clickContinue();
	KiteUtility.wait(driver, 3);
	pin1.ClickOnLogout();
	KiteUtility.wait(driver, 3);
	login.changeuser();
	sa.assertAll();
	}
	
	@Test(priority = 3)
	public void loginWithInValidPassword() throws IOException, InterruptedException
	{
		//Valid username Invalid password
		SoftAssert sa1 = new SoftAssert();
		login.ClearUsernamePasswordTextbox();
		login.sendUserName(assignment.KiteUtility.KiteProperty("username1"));
		login.sendPassword(assignment.KiteUtility.KiteProperty("Password1"));
		login.clickLoginButton();
		KiteUtility.wait(driver, 5);
		sa1.assertEquals(login.getwarning(), assignment.KiteUtility.KiteProperty("Warning1"),"Warning message not proper");
		Reporter.log("Valid username Invalid password not accepted --Warning Message displayed properly", true);	
		sa1.assertAll();
	}
	
	@Test(priority = 2)
	public void loginwithInvalidUsername() throws IOException, InterruptedException
	{
		SoftAssert sa1 = new SoftAssert();
		KiteUtility.wait(driver, 10);
		login.ClearUsernamePasswordTextbox();
		login.sendUserName(assignment.KiteUtility.KiteProperty("username2"));
		login.sendPassword(assignment.KiteUtility.KiteProperty("Passoword2"));
		login.clickLoginButton();
		KiteUtility.wait(driver, 10);
		sa1.assertEquals(login.getwarning(), assignment.KiteUtility.KiteProperty("Warning1"),"Warning message not proper");
		Reporter.log("InValid username Valid password not accepted --Warning Message displayed properly", true);	
		sa1.assertAll();
	}
	
	@Test(priority = 1)
	public void LoginWithBlankData() throws IOException
	{
		SoftAssert sa1 = new SoftAssert();
		login.ClearUsernamePasswordTextbox();
		login.clickLoginButton();
		KiteUtility.wait(driver, 5);
		sa1.assertEquals(login.getuserwarning(), assignment.KiteUtility.KiteProperty("userwarning"),"Warning message not proper");
		Reporter.log("Warning Message for username textbox is as expected", true);	
		sa1.assertEquals(login.getpwdwarning(), assignment.KiteUtility.KiteProperty("pwdwarning"),"Warning message not proper");
		Reporter.log("Warning Message for password textbox is as expected", true);
		sa1.assertAll();
		
	}
	}
