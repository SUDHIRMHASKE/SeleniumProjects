package verificationUsingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertFailed {
  @Test
  public void Hard() {
	  SoftAssert sa=new SoftAssert();
	
	  sa.fail();
	  Reporter.log("failed using assert", true);
	  sa.assertAll();
  }
  
  @Test
  public void soft() {
	
	  
  }
}
