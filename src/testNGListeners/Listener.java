package testNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	
	static int failedcount=0;
	static int passedcount=0;
	static int skippedcount=0;
	static int noofTestStarted=0;
	static int nooftestFinished=0;
	static int failedwithtimeout=0;
	 @Override
		public void onStart(ITestContext context) {
			Reporter.log("Execution is Started ", true);
			noofTestStarted++;
			ITestListener.super.onStart(context);
		}
	 
	 @Override
		public void onTestStart(ITestResult result) {
			Reporter.log("Test is started ", true);
			noofTestStarted++;
			ITestListener.super.onTestStart(result);
		}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Case is Failed, take Screenshot", true);
		failedcount++;
		ITestListener.super.onTestFailure(result);
	}
	
	 @Override
		public void onTestFailedWithTimeout(ITestResult result) {
			Reporter.log("This taking too much time : ", true);
			failedwithtimeout=failedcount+1;
			ITestListener.super.onTestFailedWithTimeout(result);
		}
	
		@Override
		public void onTestSuccess(ITestResult result) {
			Reporter.log("Successfully Executed Test case are : ", true);
			passedcount++;
			ITestListener.super.onTestSuccess(result);
		}
		
	 
	 @Override
		public void onTestSkipped(ITestResult result) {
			Reporter.log("Skipped Test case ", true);
			skippedcount++;
			ITestListener.super.onTestSkipped(result);
		}
	  
	 @Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test cases are finished ", true);
		nooftestFinished=nooftestFinished+1;
		ITestListener.super.onFinish(context);
	}
	 
	 public static void status()
	 {
		 System.out.println("Failed test cases : "+failedcount);
		 System.out.println("passed test cases : "+passedcount);
		 System.out.println("Skipped test cases : "+skippedcount);
		 System.out.println("No of test cases Started : "+noofTestStarted);
		 System.out.println("No of Test cases Finished : "+nooftestFinished);
		 System.out.println("No of Test cases failed due to Timeout : "+failedwithtimeout);
	 }

	
}
