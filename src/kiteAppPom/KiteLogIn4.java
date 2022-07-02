package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogIn4 {

		//1. Data Member/ Variables
		@FindBy(id = "userid") private WebElement UserName;
		@FindBy(id = "password") private WebElement password;
		@FindBy(xpath = "//button[@type='submit']") private WebElement LogInButton;
		
		//2. Constructor
		public KiteLogIn4(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		// 3. Methods for actions
		
		public void sendUserName(String username)
		{
			UserName.sendKeys(username);
		}
		
		public void sendPassword(String passwords)
		{
			password.sendKeys(passwords);
		}
		
		public void clickLoginButton()
		{
			LogInButton.click();
		}
}
