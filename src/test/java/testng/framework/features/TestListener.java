package testng.framework.features;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	public void onTestStart(ITestResult result) {		
    	System.out.println(result.getMethod().getMethodName()+" - Started Execution...");
	}

	public void onTestSuccess(ITestResult result) {
    	System.out.println(result.getMethod().getMethodName()+" - is Successfully Executed...");

	}

	public void onTestFailure(ITestResult result) {
    	System.out.println(result.getMethod().getMethodName()+" - is Failed...");
    	System.out.println(result.getMethod().getMethodName()+" - is Failed due to...."+result.getThrowable().getLocalizedMessage());
	}

}
