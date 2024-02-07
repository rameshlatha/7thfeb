package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cal_exe2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.className("hasDatepicker")).click();
		
driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='4']")).click();

	}

}
