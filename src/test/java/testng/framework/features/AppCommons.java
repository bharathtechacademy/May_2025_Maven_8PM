package testng.framework.features;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppCommons {

    @Test(priority = 2, groups = {"Regression"})
    public void TestCase1()  {
//    	Assert.fail("Test Case 1 - Home Page Validations Failed...");
        System.out.println("Test Case 1 - Home Page Validations Started...");
    }

    @Test(priority = 1, groups = {"Regression", "Smoke"}, dependsOnMethods = {"TestCase1","TestCase3"})
    public void TestCase2() {
        System.out.println("Test Case 2 - Add Product to Cart Feature Validations Executed Successfully...");
    }

    @Test(dataProvider = "loginData", priority = -1, groups = {"Sanity"})
    public void TestCase3(String username, String password) {
        System.out.println("Test Case 3 - Login Validations Executed Successfully with..."+username+" ,"+password);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser1() {
        System.out.println("Browser 1 is closed....");
    }
    
    @AfterMethod(alwaysRun = true,dependsOnMethods = {"closeBrowser1"})
    public void closeBrowser2() {
        System.out.println("Browser 2 is closed....");
    }

    // Dummy data provider
    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
            {"user1", "pass1"}
        };
    }
}
