package assignmentcommoncode;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VctcTestClass extends VctcBaseClass {
	VctcPracticePage page;
	
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		openBrowser();
		VctcUtility.wait(driver, 5);
		page= new VctcPracticePage(driver);
	}
	
	@Test
	public void screenshotAndScroll() throws IOException
	{
		VctcUtility.scrollpage(driver, page.radio4());
		VctcUtility.takeScreenshot(driver);
		VctcUtility.wait(driver, 5);
		
		VctcUtility.scrollpage(driver, page.table());
		VctcUtility.takeScreenshot(driver);
		VctcUtility.wait(driver, 5);
		
		VctcUtility.scrollpage(driver, page.iframe());
		VctcUtility.takeScreenshot(driver);
		VctcUtility.wait(driver, 5);
	}
	
}
