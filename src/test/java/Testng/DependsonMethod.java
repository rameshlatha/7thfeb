package Testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsonMethod {
	@Test(priority=1)
	void openurl() {
		System.out.println("open application");
	}
	@Test(priority=2)
void login() {
		Assert.assertFalse(true);
	System.out.println("login app");
	
}
	@Test(priority=3,dependsOnMethods= {"login"})
void logout() {
	System.out.println("logout app");
	
}
}
