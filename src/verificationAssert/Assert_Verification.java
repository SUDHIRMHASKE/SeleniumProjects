package verificationAssert;

import java.time.Duration;
//import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert_Verification {
	WebDriver driver;
	VctcPracticePage page1;
	//ArrayList list= new ArrayList();
	@BeforeMethod
	public void lauchvctc()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://vctcpune.com/selenium/practice.html");	
	}
  @Test
  public void validate() throws InterruptedException {
	  page1 = new VctcPracticePage(driver);
	  String actual = page1.validtext();
	  
	  //Assert Equals
	  Assert.assertEquals(actual, "Practice Page","Actual text in not matching TC failed");
	  Reporter.log("Actual Text is matching TC passed", true);
	  
	  //Assert not Equals
	  Assert.assertNotEquals(actual, "Not Practice page", "Actual text in not expected text TC failed");
	  Reporter.log("Actual text is Not equal to another text", true);
	  
	  //Assert False
	  Assert.assertFalse(page1.radiobutton.isSelected(), "Radio button already selected TC failed");
	  Reporter.log("Radion button not already selected TC Passed", true);
	  
	  //Assert True
	  page1.clickradio();
	  Assert.assertTrue(page1.radiobutton.isSelected(), "Radio button not selected after click TC failed");
	  Reporter.log("Radio button selected after click TC passed", true);
	  
	  //Assert null
	//  list.add(null);
	 // Assert.assertNull(list.get(0),"Array List Not contains null TC failed");
	  Reporter.log("Arraylist contains null Tc passed", true);
	  
	  //Assert not null
	  page1.typetext();
	  Assert.assertNotNull(page1.textbox.getText(), "Message was not typed TC failed");
	  Reporter.log("Message was successfully typed in text box TC passed", true);
	   }
}
