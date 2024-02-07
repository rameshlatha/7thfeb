package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_task {
	public WebDriver driver;
	@Test(priority=1)
	public void openurl() {
		driver=new ChromeDriver(); 
	
	    driver.get("https://products.ncryptedprojects.com/taskgator/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
	}
	@Test(priority=2)
		public void login() {
	
            driver.findElement(By.xpath("//span[@data-hover='Login']")).click();
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys("buyer.ncrypted@gmail.com");
         	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//label[@for='test1']")).click();
			driver.findElement(By.xpath("//button[@name='sbtLogin']")).click();
	}
	@Test(priority=3)
		void title() {
		String Expt="TaskGator";
		String Act=driver.getTitle();
		System.out.println(Act);
		//Assert.assertEquals(Expt, Act);
		Assert.assertTrue(false);
		}
		
	
	


}
