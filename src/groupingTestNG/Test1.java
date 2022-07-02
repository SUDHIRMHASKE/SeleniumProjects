package groupingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	 @Test(groups = "regression")
	  public void method1() {
		  Reporter.log("Method1-Regression", true);
	  }
	  
	  @Test(groups = "sanity")
	  public void method2() {
		  Reporter.log("Method2-Sanity", true);
	  }
	  
	  @Test(groups = "regression")
	  public void method3() {
		  Reporter.log("Method3-Regression", true);
	  }
	  
	  @Test(groups = "sanity")
	  public void method4() {
		  Reporter.log("Method4-Sanity", true);
	  }
	  
	  @Test(groups = "regression")
	  public void method5() {
		  Reporter.log("Method5-Regression", true);
	  }
	  
	  @Test(groups = "sanity")
	  public void method6() {
		  Reporter.log("Method6-Sanity", true);
	  }
	  
	  @Test(groups = "regression")
	  public void method7() {
		  Reporter.log("Method7-Regression", true);
	  }
	  
	  @Test(groups = "sanity")
	  public void method8() {
		  Reporter.log("Method8-Sanity", true);
	  }
	  
	  @Test(groups = "regression")
	  public void method9() {
		  Reporter.log("Method9-Regression", true);
	  }
	  
	  @Test(groups = "sanity")
	  public void method10() {
		  Reporter.log("Method10-Sanity", true);
	  }
}
