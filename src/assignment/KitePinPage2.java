package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage2 {

	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button") private WebElement continuebutton;
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	
	
	public KitePinPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendpin(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickContinue()
	{
		continuebutton.click();
	}
	
	public WebElement pintxt()
	{
		WebElement txtbox=PIN;
		return txtbox;
	}
	
	public void ClickOnLogout() throws InterruptedException
	{
		UserName.click();
		Thread.sleep(500);
		logout.click();
	}
	
	
}
