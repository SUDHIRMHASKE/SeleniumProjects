package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTrueAndFalse {
  @Test
  public void Assertions2() {
	  
	  boolean a=true;
	  boolean b=false;
	  
	  //Hard Assertions
	  Assert.assertTrue(a,"a is false TC failed");
	  Reporter.log("a is true TC passed", true);
	  
	  Assert.assertFalse(b, "b is not false TC failed");
	  Reporter.log("b is false TC passed", true);
	  
	  //Soft Assert
	  SoftAssert sa=new SoftAssert();
	  sa.assertTrue(a,"a is false TC failed");
	  Reporter.log("a is true TC passed", true);
	  
	  sa.assertFalse(b, "b is not false TC failed");
	  Reporter.log("b is false TC passed", true);

	  sa.assertAll();
  }
}
