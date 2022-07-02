package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  @Test
  public void A() {
	  Reporter.log("A is running", true);
  }
  
  @Test(timeOut = 1000)  // fails method when timeout is reached forcefully
  public void B() throws InterruptedException {
	  Thread.sleep(1001);
	  Reporter.log("B is running", true);
  }
  
  @Test(timeOut = 1000)
  public void C() throws InterruptedException {
	  Thread.sleep(999);
	  Reporter.log("C is running", true);
  }
  
  @Test
  public void D() {
	  Reporter.log("D is running", true);
  }
}
