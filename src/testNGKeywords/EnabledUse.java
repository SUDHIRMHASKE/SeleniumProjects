package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse {
  @Test
  public void A() {
	  Reporter.log("A is running", true);
  }
  
  @Test(enabled = true)
  public void B() {
	  Reporter.log("B is running--enabled true", true);
  }
  
  @Test(enabled = false)
  public void C() {
	  Reporter.log("C is running--enabled false", true);
  }
  
  @Test(enabled = false)
  public void D() {
	  Reporter.log("D is running", true);
  }
}
