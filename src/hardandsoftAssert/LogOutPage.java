package hardandsoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {

	@FindBy(xpath = "//span[@class='user-id']") private WebElement username;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	@FindBy(linkText = "Change user") private WebElement changeuser;
	
	public LogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnUserName()
	{
		username.click();
	}
	
	public void ClickOnLogout()
	{
		logout.click();
	}
	
	public void changeuser()
	{
		changeuser.click();
	}
}
