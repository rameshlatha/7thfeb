package Testng;

import org.testng.annotations.Test;

public class Groupingmethod {
	@Test(groups= {"smoke"})
	void loginBygmail() {
		System.out.println("login gmail");
	}
	@Test(groups= {"smoke","sanity"})
	void loginByfacebook() {
		System.out.println("login facebook");

	}
	@Test(groups={"sanity"})
	void loginBylinkedin() {
		System.out.println("login linkedin");

	}

}
