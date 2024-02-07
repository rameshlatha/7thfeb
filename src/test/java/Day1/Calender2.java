package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/");
		driver.manage().window().maximize();
		WebElement date=driver.findElement(By.name("bdaytime"));
		date.sendKeys("12212023");
		date.sendKeys(Keys.TAB);
		date.sendKeys("0220AM");
		


	}

}
