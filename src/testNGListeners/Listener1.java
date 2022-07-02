package testNGListeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteAppBaseClass.BaseClassPropertyFile;

public class Listener1 implements ITestListener {
	
	BaseClassPropertyFile bcpf=new BaseClassPropertyFile();
	
	//OnTestPass
	//OnTestFail
	//OnTestSuccess
	//OnTestSkip
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String TCname = result.getName();
		
		try {
			bcpf.takeScreenshotusingListener(TCname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC is Executed Successfully", true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Success TC name is : "+result.getName(), true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC is Skipped, please check Dependent TC ", true);
		Reporter.log("Skipped TC is : "+result.getName(), true);
		ITestListener.super.onTestSkipped(result);
	}
	
	

}
