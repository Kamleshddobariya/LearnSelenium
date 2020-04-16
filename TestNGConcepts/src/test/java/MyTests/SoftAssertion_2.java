package MyTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion_2 {

	// Soft assertion in each teas cases

	@Test
	public void test1() {

		SoftAssert softAssert1 = new SoftAssert(); // Soft assert is TestNG class
		System.out.println("Open Browser");

		Assert.assertEquals(true, true); // This known as Hard Assertion

		System.out.println("enter Username");
		System.out.println("enter Password");
		System.out.println("Click on login");

		Assert.assertEquals(true, true); // This known as Hard Assertion

		System.out.println("Validate Home page");

		softAssert1.assertEquals(true, false, "not able to validate homepate"); // This is converted to soft assert

		System.out.println("Go to Deals page");
		System.out.println("Create a Deal");

		softAssert1.assertEquals(true, false, "not able to create a deal"); // This is converted to soft assert

		System.out.println("Go to Contacts page");
		System.out.println("Create a contact");
		softAssert1.assertEquals(true, false, "not able to create contact"); // This is converted to soft assert

		softAssert1.assertAll(); // By this we can come to know which are the soft assertion get failed during
									// above test

	}

	@Test
	public void test2() {

		SoftAssert softAssert2 = new SoftAssert(); // Soft assert is TestNG class
		System.out.println("Logout");
		softAssert2.assertEquals(true, false);
		softAssert2.assertAll();
	}

	@AfterClass
	public void tearDown() {
		// softAssert.assertAll(); This should not be used
	}
}
