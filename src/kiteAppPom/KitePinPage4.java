package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage4 {

	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button") private WebElement LogInButton;

	
	public KitePinPage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendPin(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickcontinue()
	{
		LogInButton.click();
	}
}
