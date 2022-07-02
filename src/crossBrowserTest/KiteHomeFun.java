package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomeFun {
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;


	public KiteHomeFun(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String actualuser()
	{
		String name = UserName.getText();
		return name;
	}
	
	public void ClickOnLogout() throws InterruptedException
	{
		UserName.click();
		Thread.sleep(500);
		logout.click();
	}

}
