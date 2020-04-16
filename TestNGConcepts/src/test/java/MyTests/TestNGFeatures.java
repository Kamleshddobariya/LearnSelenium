package MyTests;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void login() {
		System.out.println("Login Test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods="login")
	public void HomePageTest() {
		System.out.println("HomePageTest");
	}
	
	@Test(dependsOnMethods="login")
	public void SearchPageTest() {
		System.out.println("SearchPageTest");
	}
	
	@Test(dependsOnMethods="login")
	public void RegPageTest() {
		System.out.println("RegPageTest");
	}
	
}
