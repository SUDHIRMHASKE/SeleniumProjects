package testNGKeywords;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class PriorityUse {
	
  @Test(priority = -2)
  public void A() 
  {
	Reporter.log("A executing", true);  
  }
  @Test(priority = 2)
  public void D() 
  {
  Reporter.log("D executing", true);
  }
  @Test(priority = 1)
  public void C() 
  {
	  Reporter.log("C executing", true);
  }
  @Test(priority = -1)
  public void B() 
  {
	  Reporter.log("B executing", true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before test setup", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After test setup", true);
  }

}
