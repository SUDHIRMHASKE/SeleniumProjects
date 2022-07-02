package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsANDNotEquals {
  @Test
  public void Assertions() {
	  String a="Velocity";
	  String b="Velocity";
	  String c="Pune";
	  //Hard Assert
	  //If a and b are same then TC should be passed else TC failed
	  
	  Assert.assertEquals(a, b, "Strings a and b are not matching TC Failed");
	  Reporter.log("String a and b are matching TC Passed", true);
	  
	//If a and c are Not same then TC should be passed else TC failed
	  
	  Assert.assertNotEquals(a, c,"String a and c are same TC Failed");
	  Reporter.log("String a and c are not same TC Passed ", true);
  
	  //SoftAssert
	  
	  SoftAssert sa=new SoftAssert();
	  
	  sa.assertEquals(a, b, "Strings a and b are not matching TC Failed");
	  Reporter.log("String a and b are matching TC Passed", true);
	  
	  sa.assertNotEquals(a, c,"String a and c are same TC Failed");
	  Reporter.log("String a and c are not same TC Passed ", true);
	  
	  sa.assertAll();
	  
  }
}
