package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagTask {
public WebDriver driver;
@BeforeClass
void openurl() {
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test(priority=1)
	void login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
@Test(priority=2)
void dropdown() {
	driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();

	driver.findElement(By.xpath("//option[@value='lohi']")).click();
}
@Test(priority=3)
void addtocard() {
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
	driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
	driver.findElement(By.xpath("//button[@id='checkout']")).click();

}
@Test(priority=4)
void shopcard() {
	driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("latha");
	driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("R");
	driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("600100");
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.findElement(By.xpath("//button[@id='finish']")).click();
}

@AfterClass
void close() {
	//driver.close();
}

}
