package Testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationExmClass {
public WebDriver driver;
@BeforeClass
void login() {
	System.out.println("this is login method");
}
@Test(priority=1)
void search() {
	System.out.println("this is search method");
}
@Test(priority=2)
void addproduct() {
	System.out.println("this is addproduct");
}
@AfterClass
void logout() {
	System.out.println("this is logout ");
}
}
