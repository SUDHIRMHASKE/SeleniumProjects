package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
	
  @Test(invocationCount = 3)
  public void mymethod() 
  {
	  Reporter.log("My method is running invocation count",true);
  }
  
  @BeforeMethod
  public void beforetest()
  {
	  Reporter.log("Before test setup ",true);
  }
  
  @AfterMethod
  public void afterest()
  {
	  Reporter.log("After test setup", true);
  }
  
  @BeforeMethod
  public void beforetest1()
  {
	  Reporter.log("Before test setup1", true);
  }
  
  @AfterMethod
  public void aftertest()
  {
	  Reporter.log("After test setup2", true);
  }
}
