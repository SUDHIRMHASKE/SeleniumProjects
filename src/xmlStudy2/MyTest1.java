package xmlStudy2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest1 {
	@Test(priority = -5)
	  public void method1() {
		  Reporter.log("Method1", true);
	  }
	  
	  @Test(priority = -4)
	  public void method2() {
		  Reporter.log("Method2", true);
	  }
	  
	  @Test(priority = -3)
	  public void method3() {
		  Reporter.log("Method3", true);
	  }
	  
	  @Test(priority = -2)
	  public void method4() {
		  Reporter.log("Method4", true);
	  }
	  
	  @Test(priority = -1)
	  public void method5() {
		  Reporter.log("Method5", true);
	  }
}
