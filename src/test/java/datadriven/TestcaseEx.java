package datadriven;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestcaseEx {
	WebDriver driver;
	@BeforeClass
 void openurl() {
	 driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }
 @Test
	 void login() throws InterruptedException, IOException{
			Thread.sleep(3000);
			String file=System.getProperty("user.dir")+"/Data/Testdataex1.xlsx";
			int rows=Excelreadandwrite.getRowCount(file,"Sheet1");
			for(int r=1;r<=rows;r++) {
			String username=Excelreadandwrite.getCellData(file,"Sheet1",r,0);   //read from excel
			String pwd=Excelreadandwrite.getCellData(file, "Sheet1", r,1);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);       //pass the values
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			// validation
			String exp_url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"; 
        	String act_url=driver.getCurrentUrl();
			if(act_url.equals(exp_url)) {
				System.out.println("Test is passed");
				Excelreadandwrite.setCellData(file, "Sheet1",  r, 2,"pass"); 
				Excelreadandwrite.fillGreenColor(file, "Sheet1", r, 2);
				driver.findElement(By.className("oxd-userdropdown-name")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			}else {
				System.out.println("Test is failed");
				Excelreadandwrite.setCellData(file, "Sheet1", r, 2, "fail");
				Excelreadandwrite.fillRedColor(file, "Sheet1", r, 2);
			}
			
		}
 }
		@AfterClass
		void close() {
		driver.close();
		}
 }


