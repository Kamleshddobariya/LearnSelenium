package MyTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion_1 {

	// hard assertion: if it failed, immediately test case will be marked as failed
	// soft assertion: if a soft assertion is getting failed >> test case will not-
	// be marked as passed as well as next lines will be excecuted
	// assertall() : to mark the test case as failed, if any soft assertion is-
	// getting failed

	SoftAssert softAssert = new SoftAssert(); // Soft assert is TestNG class

	@Test
	public void test1() {
		System.out.println("Open Browser");

		Assert.assertEquals(true, true); // This known as Hard Assertion

		System.out.println("enter Username");
		System.out.println("enter Password");
		System.out.println("Click on login");

		Assert.assertEquals(true, true); // This known as Hard Assertion

		System.out.println("Validate Home page");

		softAssert.assertEquals(true, false, "not able to validate homepate"); // This is converted to soft assert

		System.out.println("Go to Deals page");
		System.out.println("Create a Deal");

		softAssert.assertEquals(true, false, "not able to create a deal"); // This is converted to soft assert

		System.out.println("Go to Contacts page");
		System.out.println("Create a contact");
		softAssert.assertEquals(true, false, "not able to create contact"); // This is converted to soft assert

		softAssert.assertAll(); // By this we can come to know which are the soft assertion get failed during
								// above test

	}

	@Test
	public void test2() {

		System.out.println("Logout");
		softAssert.assertEquals(true, false);
		softAssert.assertAll();
	}

	@AfterClass
	public void tearDown() {
		// softAssert.assertAll(); This should not be used
	}
}
