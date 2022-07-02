package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepage4 {
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserName;
	@FindBy(xpath = "//span[@class='nickname']") private WebElement nickname;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;


	public KiteHomepage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String actualuser()
	{
		String name = UserName.getText();
		return name;
	}
	
	public String nickname()
	{
		String nick = nickname.getText();
		return nick;
	}
	
	public void ClickOnLogout() throws InterruptedException
	{
		UserName.click();
		Thread.sleep(500);
		logout.click();
	}
	
	
	

}
