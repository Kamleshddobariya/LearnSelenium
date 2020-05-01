package com.pluralsight;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UnitTest {
	
	@Test
	public void canGoToHomePage() {
		Pages.homePage().goTo();
		Assert.assertTrue(Pages.homePage().isAt());
	}
	
	@Test
	public void canGoToJavaPathPage() throws Exception {
		Pages.pathPages().goTo();
		Pages.pathPages().goToCoursePath();
		Assert.assertTrue(Pages.pathPages().isAt());
	}
	
	@AfterMethod
	public void tearDown() {
		Browser.close();
	}

}
