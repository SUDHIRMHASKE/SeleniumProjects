package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogIn1 {

		//1. Data Member/ Variables
		@FindBy(id = "userid") WebElement UserName;
		@FindBy(id = "password") private WebElement password;
		@FindBy(xpath = "//button") private WebElement LogInButton;
		@FindBy(linkText = "Change user") private WebElement changeuser;
		@FindBy(xpath = "((//div)[11]/following::p)[1]") private WebElement warning;
		@FindBy(xpath = "(//span[@class='su-message'])[1]") private WebElement usermsg;
		@FindBy(xpath = "(//span[@class='su-message'])[2]") private WebElement pwdmsg;
		
		//2. Constructor
		public KiteLogIn1(WebDriver driver) 
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
		
		public String getwarning() throws InterruptedException
		{
			Thread.sleep(1000);
			String msg = warning.getText();
			return msg;
		}
		
		public String getuserwarning()
		{
			String msg = usermsg.getText();
			return msg;
		}
		
		public String getpwdwarning()
		{
			String msg = pwdmsg.getText();
			return msg;
		}
		
		public void changeuser()
		{
			changeuser.click();
		}
		
		public void ClearUsernamePasswordTextbox()
		{
			UserName.clear();
			password.clear();
		}
}
