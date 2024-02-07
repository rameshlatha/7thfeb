package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Paralleltest {
public WebDriver driver;
@BeforeClass
@Parameters({"browser"})
void setup(String br) {
	if(br.equals("chrome")) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}else{
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
}
@Test(priority=1)
@Parameters({"url"})
void launch(String appurl) {
	driver.get(appurl);
	
}
@Test(priority=2)
void login() {
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
@AfterClass
void close() {
	driver.quit();
}
}
