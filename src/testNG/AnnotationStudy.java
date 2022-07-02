package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void Test1() {
	  Reporter.log("Test1 is Running ",true);
  }
  
  @Test
  public void Test2()
  {
	  Reporter.log("Test2 is Running ",true);
  }
  
  @BeforeMethod
  public void Beforetest()
  {
	  Reporter.log("Before Method is runnig before every test ",true);
	 
  }
  
  @BeforeClass
  public void Beforeclass()
  {
	  Reporter.log("Before class is running -- before test and method", true);
  }
  
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("After class is running -- after excution of method and test ", true);
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  Reporter.log("After mehtod is running-- after execution of every test", true);
  }
}
