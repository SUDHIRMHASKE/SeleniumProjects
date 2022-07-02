package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepage {
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserName;
	
	public KiteHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validation(String user, int usernumber)
	{
		String actualUser = UserName.getText();
		String expectedUser =user;
		
		if (actualUser.equals(expectedUser))
		{
			System.out.println("User name "+usernumber+" is Matching : Test Case is passed");
		}
		else
		{
			System.out.println("User name "+usernumber+" is not matching : Test case is Failed");
		}
	}

}
