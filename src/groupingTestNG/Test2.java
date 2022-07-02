package groupingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(groups = "regression")
	  public void method11() {
		  Reporter.log("Method11-Regression", true);
	  }
	  @Test(groups = "sanity")
	  public void method12() {
		  Reporter.log("Method12-Sanity", true);
	  } 
	  @Test(groups = "regression")
	  public void method13() {
		  Reporter.log("Method13-Regression", true);
	  }
	  @Test(groups = "sanity")
	  public void method14() {
		  Reporter.log("Method14-Sanity", true);
	  }
	  @Test(groups = "regression")
	  public void method15() {
		  Reporter.log("Method15-Regression", true);
	  }
	  @Test(groups = "sanity")
	  public void method16() {
		  Reporter.log("Method16-Sanity", true);
	  }
	  @Test(groups = "regression")
	  public void method17() {
		  Reporter.log("Method17-Regression", true);
	  }
	  @Test(groups = "sanity")
	  public void method18() {
		  Reporter.log("Method18-Sanity", true);
	  }
	  @Test(groups = "regression")
	  public void method19() {
		  Reporter.log("Method19-Regression", true);
	  }
	  @Test(groups = "sanity")
	  public void method20() {
		  Reporter.log("Method20-Sanity", true);
	  }
}
