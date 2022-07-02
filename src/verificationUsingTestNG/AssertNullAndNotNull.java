package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullAndNotNull {
  @Test
  public void Assertions1() {
	  
	  String a=null;
	  String b="full";
	  //Hard Assert
	  Assert.assertNull(a,"a is not null Tc failed");
	  Reporter.log("a is null Tc passed", true);
	  
	  Assert.assertNotNull(b, "b is null TC failed");
	  Reporter.log("b is not null TC passed", true);
	  
	  //Soft Assert
	  
	  SoftAssert sa=new SoftAssert();
	  sa.assertNull(a,"a is not null Tc failed");
	  Reporter.log("a is null Tc passed", true);
	  
	  sa.assertNotNull(b, "b is null TC failed");
	  Reporter.log("b is not null TC passed", true);
	  
	  sa.assertAll();
  }
}
