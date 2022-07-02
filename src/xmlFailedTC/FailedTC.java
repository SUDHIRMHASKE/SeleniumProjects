package xmlFailedTC;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTC {
	@Test(timeOut = 100)
	  public void method1() throws InterruptedException {
		Thread.sleep(110);
		  Reporter.log("Method1-Regression", true);
	  }
	  
	  @Test
	  public void method2() {
		  Reporter.log("Method2-Sanity", true);
	  }
	  
	  @Test
	  public void method3() {
		  Assert.fail();
		  Reporter.log("Method3-Regression", true);
	  }
	  
	  @Test
	  public void method4() {
		  Reporter.log("Method4-Sanity", true);
	  }
	  
	  @Test
	  public void method5() {
		  Reporter.log("Method5-Regression", true);
	  }
	  
	  @Test(enabled = false)
	  public void method6() {
		  Reporter.log("Method6-Sanity", true);
	  }
	  
	  @Test
	  public void method7() {
		  Reporter.log("Method7-Regression", true);
	  }
	  
	  @Test
	  public void method8() {
		  Reporter.log("Method8-Sanity", true);
	  }
	  
	  @Test
	  public void method9() {
		  Reporter.log("Method9-Regression", true);
	  }
	  
	  @Test
	  public void method10() {
		  Assert.fail();
		  Reporter.log("Method10-Sanity", true);
	  }

}
