package Day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Fur {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
int day=28;
String month="September 2027";

//calender 1 select future date
driver.findElement(By.id("first_date_picker")).click();
while(true) {
 String currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();
if(currentdate.equals(month)) {
	break;
}else {
	driver.findElement(By.className("ui-datepicker-next")).click();         //click on nxt btn upto expt date	
}
	}
driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//a[text()='"+day+"']")).click(); //select the date
 }
}
