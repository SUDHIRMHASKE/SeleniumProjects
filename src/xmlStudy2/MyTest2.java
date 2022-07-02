package xmlStudy2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest2 {
	@Test(enabled = true)
	  public void method6() {
		  Reporter.log("Method6", true);
	  }
	  
	  @Test(enabled = false)
	  public void method7() {
		  Reporter.log("Method7", true);
	  }
	  
	  @Test(enabled = false)
	  public void method8() {
		  Reporter.log("Method8", true);
	  }
	  
	  @Test(enabled = true)
	  public void method9() {
		  Reporter.log("Method9", true);
	  }
	  
	  @Test(enabled = true)
	  public void method10() {
		  Reporter.log("Method10", true);
	  }
}
