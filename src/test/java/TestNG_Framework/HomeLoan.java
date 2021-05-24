package TestNG_Framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
//in TestNg @Test methods executes in alphabetic order
	// IQ:we dont prefer parallel execution in TestNG bcoz system performance may
	// become slow, we use selenium grid concept for parallel execution of tests
	@BeforeClass
	public void beforeClass() {
		System.out.println("I will run before all the method in a class file");
	}

	// @BeforeClass and @AfterClass defines at class level, scope of these
	// annotations is only for class level
	@AfterClass
	public void afterClass() {
		System.out.println("I will run after all the method in a class file");
	}

	@Test(groups = { "Regression" })
	public void homeLoanWebLogin() {
		System.out.println("HomeloanWebLogin");
	}

	@Parameters({ "URL" })
	@Test
	public void homeLoanMobileLogin(String url) {
		System.out.println("HomeloanMobileLogin");
		System.out.println(url);
	}

	@Test(groups = { "Regression" })
	public void homeLoanAPILogin() {
		System.out.println("HomeloanAPILogin");
	}

	@BeforeTest
	public void openBrowser() {
		System.out.println("Launch Browser"); // @BeforeTest and @AfterTest defines at testng.xml file
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("Quit Browser");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("I will run before every method in class file");// @BeforeMethod and @AfterMethod defines at
																			// class files - class level
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("I will run after every method in class file");
	}

}
