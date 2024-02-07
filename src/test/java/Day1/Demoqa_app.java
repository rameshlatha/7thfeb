package Day1;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_app {

	public static void main(String[] args)  {
		WebDriver d=new ChromeDriver();
d.get("https://demoqa.com/text-box");

d.findElement(By.id("Text Box")).click();
d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
d.findElement(By.id("userName")).sendKeys("latha");
d.findElement(By.id("userEmail")).sendKeys("latha123@gmail.com");
d.findElement(By.id("currentAddress")).sendKeys(" 2/34 ,n.s.k.street.chennai");
d.findElement(By.id("permanentAddress")).sendKeys("2/34 ,n.s.k.street.chennai");
d.findElement(By.id("submit")).click();


	}

}
