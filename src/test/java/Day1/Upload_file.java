package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/upload/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.className("upload_txt")).sendKeys("C:\\Users\\latharamesh\\OneDrive\\Documents");


	}

}
