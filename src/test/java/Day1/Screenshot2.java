package Day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {
     
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Screenshot();
	}

public static void Screenshot() {
	/*TakesScreenshot ss =(TakesScreenshot)driver;
	File source =ss.getScreenshotAs(OutputType.FILE);
	String destination=System.getProperty("user.dir")+"\\Screenshot\\amazon"+".png";
	FileUtils.copyFile(source,new File(destination));*/


	
	}

}
