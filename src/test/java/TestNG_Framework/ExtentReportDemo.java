package TestNG_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
//this is class is a main class as it is responsible to drive all the reporting executions
	ExtentReports extent;

	@BeforeTest

	public void config()

	{

// ExtentReports , ExtentSparkReporter ->these 2 classes are very imp to generate reports

		String path = System.getProperty("user.dir") + "\\reports\\index.html";
//ExtentSparkReporter expects a path where ur report should be created, this class is responsible to create reports, it accepts
//to create html files and we have some methods in this class to configure the reports like writing report name in reports..etc
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("Web Automation Results"); // writes report name in reports

		reporter.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();

		extent.attachReporter(reporter);// attaching report from "ExtentSparkReporter" class obj

		extent.setSystemInfo("Tester", "Rahul Shetty");// to set tester name

	}

	@Test

	public void initialDemo()

	{
//this step writes reports for passed and failed cases-> for monitoring the test
		ExtentTest test = extent.createTest("Initial Demo");

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		driver.close();

//test.fail("Result do not match"); - this is used to fail the test report intentionally even if the test cases are passed

		extent.flush(); // this is used to end the test and writes final report

	}

}
