package xmlStudy1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest1 {
  @Test
  public void method1() {
	  Reporter.log("Method1", true);
  }
  
  @Test(dependsOnMethods = {"method1"},priority = -1)
  public void method2() {
	  Reporter.log("Method2", true);
  }
  
  @Test
  public void method3() {
	  Reporter.log("Method3", true);
  }
  
  @Test(dependsOnMethods = {"method3"})
  public void method4() {
	  Reporter.log("Method4", true);
  }
  
  @Test
  public void method5() {
	  Reporter.log("Method5", true);
  }
}
