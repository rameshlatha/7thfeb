package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnatationExmMethod {
 public WebDriver driver; 
	@BeforeMethod 
  void login() {
	System.out.println("this is login method");
 }
  @Test(priority=1)
  void search() {
	  System.out.println("this is search");
  }@AfterMethod
  void logout() {
	  System.out.println("this is logout");
  }
  @Test(priority=2)
  void addproduct() {
	  System.out.println("this is addproduct");
  }
}
