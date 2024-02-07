package Day1;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_task {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();	
driver.get("https://ui.vision/demo/webtest/frames/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//frame3
WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
driver.switchTo().frame(frm3);
driver.findElement(By.name("mytext3")).sendKeys("This is frame3");
driver.switchTo().defaultContent();

//frame4
WebElement frm4= driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
driver.switchTo().frame(frm4);
driver.findElement(By.name("mytext4")).sendKeys("this is frame4");

//frame5
driver.switchTo().defaultContent();
WebElement frm5= driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
driver.switchTo().frame(frm5);
driver.findElement(By.name("mytext5")).sendKeys("this is frame5");

	}

}
