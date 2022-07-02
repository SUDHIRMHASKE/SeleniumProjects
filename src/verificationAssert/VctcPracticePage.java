package verificationAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VctcPracticePage {
	
	@FindBy(xpath = "//h1[text()='Practice Page']") private WebElement page;
	@FindBy(xpath = "//input[@value='Radio3']") WebElement radiobutton;
	@FindBy(id = "autocomplete") WebElement textbox;
	
	public VctcPracticePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validtext()
	{
		return page.getText();
	}
	
	public void clickradio()
	{
		radiobutton.click();
	}
	
	public void typetext()
	{
		textbox.sendKeys("null");
	}

}
