package testNGListeners;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListenerXMlLevel {
  @Test
  public void Sabarmati() {
	  Reporter.log("Sabarmati Express Running",true);
  }
  
  @Test
  public void Nandigram() {
	  Reporter.log("Nandigram Express Running",true);
  }
  
  @Test
  public void Kakinada() {
	  Reporter.log("Kakinada Express Running",true);
  }
  
  @Test
  public void Gitanjali() {
	  Reporter.log("Gitanjali Express Running",true);
  }
}
