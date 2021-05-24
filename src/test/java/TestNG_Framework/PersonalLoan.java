package TestNG_Framework;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {

	@Test(dataProvider = "getData") // data driven testing
	public void personalLoanWebLogin(String username, String password) {
		System.out.println("personalLoanWebLogin");
		System.out.println(username);
		System.out.println(password);
		Assert.assertTrue(false); // to check failure scenario in Listeners class
	}

	@Parameters({ "URL", "API_KEY" }) // Parameters is used to get values like url, Api key, report paths..etc from
										// .xml file,
										// we can pass multiple parameters
	@Test
	public void personalLoanMobileLogin(String url, String key) {
		System.out.println("personalloanMobileLogin");
		System.out.println(url);
		System.out.println(key);
	}

	@Test(groups = { "Regression" }) // groups tag is to run only required test cases from diff class files,
										// Requirement: there are 100 test cases in the project m then if the client
										// wants to run only 40 test cases, then we go with groups concept, we define
										// tags at @Test methods and create groups tag in .xml file - exclude keyword
										// can be used to exclude those particular tags
	public void personalLoanAPILogin() {
		System.out.println("personalloanAPILogin");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am the Before Suite from First"); // @BeforeSuite and @AfterSuite defines at testng.xml
																// file
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am the After Suite from Last");
	}

	@DataProvider // this annotation is used to perform data driven testing if we want to pass
					// multiple set data like uname and password, to run same tc multiple times,
					// this is indpendent of .xml file
					// we can do paramaterization in TestNG in 2 ways, 1st is from .xml file by
					// giving <parameter> keyword and the 2nd way is using @DataProvider Annotation
	public Object[][] getData() {

		// 1st combination - username,password - good credit history = row
		// 2nd combination - username,password - no credit history
		// 3rd combination - username,password - fraudelent credit history

		// columns in the row are nothing but values from that particular
		// combination(row)
		Object[][] data = new Object[3][2]; // multi-dimensional array

		// 1st set
		data[0][0] = "FirstUserName";
		data[0][1] = "FirstPassword";
		// 2nd set
		data[1][0] = "SecondUserName";
		data[1][1] = "SecondPassword";
		// 3rd set
		data[2][0] = "ThirdUserName";
		data[2][1] = "ThirdPassword";
		return data; // return type is array of object(IQ)
	}
}
//Parameter &apos;URL&apos; is required by @Test on method personalLoanMobileLogin but has not been marked @Optional or defined
//in C:\Users\satishku\AppData\Local\Temp\testng-eclipse-301759950\testng-customsuite.xml - this is the error if we run from
// class level if we dependency from .xml file
