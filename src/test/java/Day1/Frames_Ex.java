package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Ex {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html#google_vignette");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 WebElement fram1=driver.findElement(By.xpath("//a[@class='analystic']"));
 driver.switchTo().frame(fram1);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("frame1");

	}

}
