package xmlStudy1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest2 {
	@Test(priority = -6)
	  public void method6() {
		  Reporter.log("Method6", true);
	  }
	  
	  @Test(priority = -7)
	  public void method7() {
		  Reporter.log("Method7", true);
	  }
	  
	  @Test(priority = -8,dependsOnMethods = {"method7"})
	  public void method8() {
		  Reporter.log("Method8", true);
	  }
	  
	  @Test(priority = -9,dependsOnMethods = {"method8"})
	  public void method9() {
		  Reporter.log("Method9", true);
	  }
	  
	  @Test(priority = -10)
	  public void method10() {
		  Reporter.log("Method10", true);
	  }
}
