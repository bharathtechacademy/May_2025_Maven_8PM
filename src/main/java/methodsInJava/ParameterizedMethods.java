package methodsInJava;

public class ParameterizedMethods {
	

	public static void main(String[] args) {

		System.out.println("***********Test Case 1************");
		

		ParameterizedMethods obj = new ParameterizedMethods();
		
		System.out.println(obj.calculateTotalAmount(10,1000000.0, 8.2));

		obj.launchTheBrowserAndApplication("Chrome");
		obj.loginIntoApplication();

		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		obj.logoutAndCloseBrowser();

		System.out.println("***********Test Case 2************");
		obj.launchTheBrowserAndApplication("Chrome");
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		obj.logoutAndCloseBrowser();

		System.out.println("***********Test Case 3************");
		obj.launchTheBrowserAndApplication("Firefox");
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseBrowser();;

		System.out.println("***********Test Case 3-Invalid************");
		obj.launchTheBrowserAndApplication("Firefox");
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseBrowser();

		System.out.println("***********Test Case 4************");
		obj.launchTheBrowserAndApplication("Edge");
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		System.out.println(obj.getBalance());
		obj.logoutAndCloseBrowser();
	}

	void launchTheBrowserAndApplication(String browser){
		System.out.println("Launch the "+browser+" browser");
		System.out.println("Enter url and launch application");
	}
	
//	void launchTheChromeBrowserAndApplication(){
//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url and launch application");
//	}
//	
//	void launchTheEdgeBrowserAndApplication(){
//		System.out.println("Launch the edge browser");
//		System.out.println("Enter url and launch application");
//	}
//	
//	void launchTheFirefoxBrowserAndApplication(){
//		System.out.println("Launch the firefox browser");
//		System.out.println("Enter url and launch application");
//	}

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

	double calculateTotalAmount(int years, double principleAmount, double interestRate){
		double totalAmount = principleAmount+ ((principleAmount*interestRate)*years)/100 ;
		return totalAmount;
	}
	
}
