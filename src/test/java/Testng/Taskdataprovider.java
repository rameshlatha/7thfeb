package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Taskdataprovider {
public WebDriver driver;
@BeforeClass()
void openurl() {
	driver =new ChromeDriver();
	driver.get("https://products.ncryptedprojects.com/taskgator/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test(dataProvider="input")
void login(String username,String pwd) {
	      driver.findElement(By.xpath("//span[@data-hover='Login']")).click();
          driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
  	      driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		  driver.findElement(By.xpath("//label[@for='test1']")).click();
		  driver.findElement(By.xpath("//button[@name='sbtLogin']")).click();
}
@AfterClass()
void close() {
	driver.close();
}
@DataProvider (name ="input") 
	String[][]logindata(){
		String[][] data= { {"buyer.ncrypted@gmail.com","123"},
				          {"seller.ncrypted@gmail.com","123456"}
	};
	
		return data;
	}	

}
