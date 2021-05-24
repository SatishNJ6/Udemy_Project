package TestNG_Framework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is an Interface is TestNG which implements Listeners class to implement the unimplemented methods
//TestNG provides the @Listeners annotation which listens to every event that occurs in a selenium code. 
//Listeners are activated either before the test or after the test case. It is an interface that modifies the TestNG behavior. 
//For example, when you are running a test case either through selenium or appium and suddenly a test case fails. We need a
//screenshot of the test case that has been failed, to achieve such scenario, TestNG provides a mechanism, i.e., Listeners.
//When the test case failure occurs, then it is redirected to the new block written for the screenshot.
public class Listeners implements ITestListener {
//if we to run listeners code, then we have to give this path in testng.xml file at after suite and before test
	public void onTestStart(ITestResult result) {

	}

	// this method is used for reporting
	public void onTestSuccess(ITestResult result) { // onTestsuccess and @AfterMethod are same which runs after each &
													// every method, difference is onTestsuccess executes only if the
		System.out.println("I successfully executed listeners pass code"); // test case is success or else it will go to
																			// onTestFailure method

	}

	public void onTestFailure(ITestResult result) { // onTestFailure method is used to write the code for taking
													// screenshots for failed test cases

		// 1.screenshot code
		// 2.response if API is failed

		System.out.println("I failed executing listeners code" + " " + result.getName());// it prints the failed tc in
																							// console. IQ: how do you
																							// capture failed method -
																							// using ITestResult class
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
