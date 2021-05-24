package TestNG_Framework;

import org.testng.annotations.Test;

public class CarLoan {
	@Test(enabled = false) // if we want to exclude single test case, if there is some issue with this tc,
							// IQ:if the interviewer asks how will you exclude once tc from your test cases
							// without commenting code, this is best answer(@Test(enabled=false))
	public void carLoanWebLogin() {
		System.out.println("carloanWebLogin");
	}

	@Test(timeOut = 4000) // if the element is not visible in this method, then we give this to wait till
							// 4 secs before throwing exception
	public void carLoanMobileLogin() {
		System.out.println("carloanMobileLogin");
	}

	@Test(dependsOnMethods = { "carLoanWebLogin", "carLoanMobileLogin" }) // if one tc is dependant on another, then we
																			// give like this, for eg: if i want run
																			// first login, then home page, then logout,
																			// will give dependacy attribute at methods
	public void carLoanAPILogin() {
		System.out.println("carloanAPILogin");
	}

}
//(enabled, timeOut, dependsOnMethods) --> all these 3 attributes are helper attributes in TestNG