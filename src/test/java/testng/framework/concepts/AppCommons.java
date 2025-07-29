package testng.framework.concepts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppCommons extends WebCommons{
	
	@DataProvider(name = "testData")
	public Object[][] testData() {
		return new Object[][] {
			{ 1000.0, 5.0 },
			{ 2000.0, 7.5 },
			{ 1500.0, 6.0 }
		};
	}

	public void loginIntoApplication(String username, String password) {
		System.out.println("Login process started for user: " + username);
		System.out.println("User logged in successfully with password: " + password);
	}

	public void logoutFromApplication() {
		System.out.println("User logged out successfully.");
	}

	public void closeApplication() {
		System.out.println("Application is closed successfully.");
	}

	public void verifyApplicationHomePage() {
		System.out.println("Application home page is verified successfully.");
	}
	
	@BeforeMethod(dependsOnMethods = {"launchBrowserAndApplication"})
	@Parameters({"USERNAME", "PASSWORD"})
	public void loginIntoApp(String username, String password) {
		loginIntoApplication(username, password);
		verifyApplicationHomePage();
	}
	
	@AfterMethod
	public void logoutFromApp() {
		logoutFromApplication();
		closeApplication();
	}
	
	@Test
	public void testCase1() {
		Assert.fail("Test case 1 failed due to some reason.");
		System.out.println("Executing test case 1...");		
	}
	
	@Test
	public void testCase2() {
		System.out.println("Executing test case 2...");
	}
	
	@Test(dataProvider = "testData")
	public void testCase3(double principle, double interest) {
		System.out.println("Executing test case 3 with principle: " + principle + " and interest: " + interest);
		System.out.println("Test case 3 executed successfully.");}
}