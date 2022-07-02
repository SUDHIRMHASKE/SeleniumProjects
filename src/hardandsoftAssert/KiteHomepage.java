package hardandsoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepage {
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserName;
	@FindBy(xpath = "//span[@class='nickname']") private WebElement nickname;

	public KiteHomepage(WebDriver driver)
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
	
	

}
