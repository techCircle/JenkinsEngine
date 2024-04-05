package TestNG_Review;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		onTestStart(result);
		System.out.println("onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
//		onTestSuccess(result);
		System.out.println("onTestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		onTestFailure(result);
		// take a screenshot
		System.out.println("onTestFailure");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
//		onTestSkipped(result);
		System.out.println("onTestSkipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
//		onTestFailedButWithinSuccessPercentage(result);
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
//		onTestFailedWithTimeout(result);
		System.out.println("onTestFailedWithTimeout");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
//		onStart(context);
		System.out.println("onStart");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
//		onFinish(context);
		// generate report
		System.out.println("onFinish");
	}

}
