package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cal_drpdwn4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,250)","");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
int date=30;
driver.findElement(By.id("fourth_date_picker")).click();
Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
month.selectByVisibleText("Oct");
Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
year.selectByVisibleText("2024");
driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month' ))]//a[text()='30']")).click();

	}

}




