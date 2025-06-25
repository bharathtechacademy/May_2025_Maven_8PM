package methodsInJava;

public class WithMethodsInTesting {

	public static void main(String[] args) {

		System.out.println("***********Test Case 1************");

		WithMethodsInTesting obj = new WithMethodsInTesting();
		obj.launchTheBrowserAndApplication();
		obj.loginIntoApplication();

		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		obj.logoutAndCloseBrowser();

		System.out.println("***********Test Case 2************");
		obj.launchTheBrowserAndApplication();
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		obj.logoutAndCloseBrowser();

		System.out.println("***********Test Case 3************");
		obj.launchTheBrowserAndApplication();
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseBrowser();;

		System.out.println("***********Test Case 3-Invalid************");
		obj.launchTheBrowserAndApplication();
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseBrowser();

		System.out.println("***********Test Case 4************");
		obj.launchTheBrowserAndApplication();
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		System.out.println(obj.getBalance());
		obj.logoutAndCloseBrowser();
	}

	void launchTheBrowserAndApplication(){
		System.out.println("Launch the firefox browser");
		System.out.println("Enter url and launch application");
	}

	void loginIntoApplication(){
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}

	void logoutAndCloseBrowser(){
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}
	
	double getBalance(){
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;
		return balance;
	}

}
