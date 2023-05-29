package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class data1 implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase is Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase is failed capture screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Tc is skipped");
	}

}
