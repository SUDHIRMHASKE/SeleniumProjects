package testNGListeners;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListenerXMLLevel2 {
  @Test
  public void Maharashtra() {
	  Reporter.log("Maharashtra Express Running ", true);
  }
  
  @Test
  public void Rajasthan() {
	  Reporter.log("Rajasthan Express Running", true);
  }
  
  @Test
  public void Gujrat() {
	  Reporter.log("Gujrat Express Running", true);
  }
  
  @Test
  public void Assam() {
	  Reporter.log("Assam express Running ", true);
  }
}
