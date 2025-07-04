package selenium;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionsConcepts {

	public static void main(String[] args) {
		
		//1. Hard Assertions ==> It will fail the program immediately when there is a mismatch
		Assert.assertEquals("Google", "Google","Not Matching");
		Assert.assertNotEquals("Google", "Yahoo");
		Assert.assertTrue(2 < 3);
		Assert.assertFalse(2 > 3);
		Assert.assertNull(null);
		Assert.assertNotNull(1234);
//		Assert.fail("Fail the Program");
		
		
		//2. Soft Assertions ==> It will fail the program at the end of the execution
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Google", "Yahoo");
		softAssert.assertNotEquals("Google", "Google");
		softAssert.assertTrue(2 > 3);
		softAssert.assertFalse(2 < 3);
		softAssert.assertNull(1234);
		softAssert.assertNotNull(null);
		softAssert.fail("Fail the Program");
		softAssert.assertAll();
		System.out.println("Execution Completed");

	}

}
