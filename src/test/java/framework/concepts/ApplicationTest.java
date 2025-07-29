package framework.concepts;

public class ApplicationTest {

	public static void main(String[] args) {
		AppCommons appCommons = new AppCommons();
		WebCommons webCommons = new WebCommons();

		webCommons.startReporting();
		
		webCommons.launchBrowserAndApplication("Chrome", "http://example.com");		
		appCommons.loginIntoApplication("user1", "pass1");
		appCommons.verifyApplicationHomePage();		
		appCommons.testCase1();		
		appCommons.logoutFromApplication();
		webCommons.closeBrowser();
		System.out.println("*******************************");
		
		webCommons.launchBrowserAndApplication("Chrome", "http://example.com");		
		appCommons.loginIntoApplication("user1", "pass1");
		appCommons.verifyApplicationHomePage();		
		appCommons.testCase2();		
		appCommons.logoutFromApplication();
		webCommons.closeBrowser();
		System.out.println("*******************************");

		webCommons.launchBrowserAndApplication("Chrome", "http://example.com");		
		appCommons.loginIntoApplication("user1", "pass1");
		appCommons.verifyApplicationHomePage();		
		appCommons.testCase3("Test Data 1");		
		appCommons.logoutFromApplication();
		webCommons.closeBrowser();
		System.out.println("*******************************");

		webCommons.launchBrowserAndApplication("Chrome", "http://example.com");		
		appCommons.loginIntoApplication("user1", "pass1");
		appCommons.verifyApplicationHomePage();		
		appCommons.testCase3("Test Data 2");		
		appCommons.logoutFromApplication();
		webCommons.closeBrowser();
		System.out.println("*******************************");

		webCommons.stopReporting();

	}

}
