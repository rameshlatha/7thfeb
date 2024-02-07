package datadriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReadwriteEx {
	WebDriver driver;
	@BeforeClass
 public  void openurl() {
	 driver=new ChromeDriver();
	 driver.get("https://e2e.cloudtesla.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	@Test
 void login() throws IOException {
	 String file=System.getProperty("user.dir"+"\\Data\\testdata.xlsx");
	 int rows=Excelreadandwrite.getRowCount(file, "Sheet1");
	 for(int r=1;r<=rows;r++) {
		String username=Excelreadandwrite.getCellData(file, "Sheet1", r, 0);
		String pwd=Excelreadandwrite.getCellData(file, "Sheet1", r, 1);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);       //pass the values
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd); 
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		String exp_url=""; 
		String act_url=driver.getCurrentUrl();
		if(exp_url.equals(act_url)) {
			System.out.println("test is passed");
			Excelreadandwrite.setCellData(file, "Sheet1", r, 1, "pass");
			Excelreadandwrite.fillGreenColor(file, "Sheet1", r, 1);
		}
		else {
			System.out.println("test is failed");
			Excelreadandwrite.setCellData(file, "Sheet1", r, 2, "fail");
			Excelreadandwrite.fillRedColor(file, "Sheet1", r, 2);
			
		}

	 }
	 
 }
	@AfterClass()
	void close(){
	driver.close();	
	}
}
