package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywords1 {
	
  @Test(timeOut = 1000,priority = -1)
  public void method1() throws InterruptedException {
	  Thread.sleep((long) 999.9999999999999);
	  Reporter.log("Method1 is Running", true);
  }
  
  @Test(dependsOnMethods = {"method1"})
  public void method2() {
	  Reporter.log("Method2 is Running", true);
  }
  
  @Test(dependsOnMethods = {"method2"})
  public void method3() {
	  Reporter.log("Method3 is Running", true);
  }
  
  @Test(priority = -2)
  public void method4() {
	  Reporter.log("Method4 is Running", true);
  }
  
  @Test(dependsOnMethods = {"method4"},priority = -3)
  public void method5() {
	  Reporter.log("Method5 is Running", true);
  }
}
