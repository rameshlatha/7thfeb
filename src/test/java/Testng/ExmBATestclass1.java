package Testng;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExmBATestclass1 {
	
	@Test
void abc() {
	System.out.println("this is abc method class1");
}
	@BeforeTest
void efg() {
	System.out.println("this is efg method class1");
}
}
