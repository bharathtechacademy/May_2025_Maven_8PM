package testng.framework.features;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppCommons extends WebCommons {

    @Test(priority = 2, groups = {"Regression"}, retryAnalyzer=RetryTest.class) //, invocationCount = 2
    public void TestCase1() throws InterruptedException  {
    	Assert.fail("Timeout Exception");
//    	System.out.println("Test Case 1 - Started Execution...");
    	Thread.sleep(3000);
        System.out.println("Test Case 1 - Home Page Validations Started...");
    }

    @Test(priority = 1, groups = {"Regression", "Smoke"}) // dependsOnMethods = {"TestCase1"},timeOut = 2000
    public void TestCase2() throws InterruptedException {
//    	System.out.println("Test Case 2 - Started Execution...");
    	Thread.sleep(3000);
        System.out.println("Test Case 2 - Add Product to Cart Feature Validations Executed Successfully...");
    }

    @Test(dataProvider = "loginData", priority = -1, groups = {"Sanity"}, enabled=true)
    public void TestCase3(String username, String password) throws InterruptedException {
//    	System.out.println("Test Case 3 - Started Execution...");
    	Thread.sleep(3000);
        System.out.println("Test Case 3 - Login Validations Executed Successfully with..."+username+" ,"+password);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser1() {
        System.out.println("Browser is closed....");
    }

}
