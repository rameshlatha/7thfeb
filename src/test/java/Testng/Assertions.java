package Testng;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	@Test
	void test(){
		int a=20;
		int b=30;
		//hard assert
		//Assert.assertEquals(a, b);
		
		//soft assert
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(a, b);
		sa.assertAll();
	}

}
