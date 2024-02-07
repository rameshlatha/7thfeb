package Day1;
import java.util.Date;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class calendar {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
driver.manage().window().maximize();
int day=27;
//cal-6 
driver.findElement(By.id("sixth_date_picker")).sendKeys("19/12/2023");

//cal-1 
driver.findElement(By.id("first_date_picker")).click();
driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='21']")).click();

//cal-2
driver.findElement(By.id("second_date_picker")).click();
driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]//a[text()="+day+"]")).click();

	}
	
	}


