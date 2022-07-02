package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinFun {

	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button") private WebElement LogInButton;

	
	public KitePinFun(WebDriver driver)
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
