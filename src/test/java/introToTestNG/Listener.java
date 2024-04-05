package introToTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities.BaseClass;
import Utilities.commonMethods;

public class Listener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("open browser");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " This this has passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " This this has failed and take a screenshot");
		commonMethods.takeScreenShot(BaseClass.getDriver());

	}

	public void onStart(ITestContext context) {
		System.out.println("Start of the Execution");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Finalizing of the Execution");

	}
	
	
	
	

}
