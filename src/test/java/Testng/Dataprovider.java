package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	public WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider="HRM")
	void login(String uname, String pwd ) {
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@AfterClass
	void close() {
		driver.quit();
	}
	@DataProvider(name ="HRM")
	String[][]loginData(){
		String data[][]={
		{"Admin","admin123"},{"latha","latha123"}
	};
	return data;
}
}

