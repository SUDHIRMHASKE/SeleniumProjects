package assignmentcommoncode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VctcPracticePage {
	
	@FindBy(xpath = "//label[text()='Radio4']") private WebElement radiobutton4;
	@FindBy(xpath = "//td[contains(text(),'QA E')]") private WebElement tabledata;
	@FindBy(id = "courses-iframe") private WebElement iframe;
	
	public VctcPracticePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement radio4()
	{
		WebElement button=radiobutton4;
		return button;
	}
	
	public WebElement table()
	{
		WebElement data=tabledata;
		return data;
	}
	
	public WebElement iframe()
	{
		WebElement frame=iframe;
		return frame;
	}
}
