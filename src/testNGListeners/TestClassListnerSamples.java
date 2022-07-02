package testNGListeners;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListeners.Listener.class)
public class TestClassListnerSamples {
	
	
  @Test
  public void method1() {
	  Reporter.log("Intentionally failed method", true);
	  Assert.fail(); 
  }
  
  @Test(dependsOnMethods = {"method1"})
  public void method2() {
	  Reporter.log("depend on method 1 which is failed", true);
  }
  
  @Test(timeOut = 900)
  public void method3() throws InterruptedException {
	  Thread.sleep(1000);
  }
  
  @Test
  public void method4() {
	  Reporter.log("Successfully executed", true);
  }
  
  @Test
  public void method5() {
	  Assert.fail();
	  Reporter.log("Intentionally Failed ", true);
  }
  
  @Test(dependsOnMethods = {"method5"})
  public void method6() {
	  Reporter.log("depends on method5 which is failed", true);
  }
  
  @Test
  public void statusoftests()
  {
	  Listener.status();
  }
}
