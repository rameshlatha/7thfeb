package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cal_drpdwn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
int date=15;
driver.findElement(By.id("third_date_picker")).click();
Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
month.selectByVisibleText("Jan");

Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
year.selectByVisibleText("2031");

driver.findElement(By.xpath("//a[text()='"+date+"']")).click();

	}

}
