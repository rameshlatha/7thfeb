package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_tastmaketrip {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/bus-tickets/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='travelDate']")).click();
		int day=28;
		String month="July 2024";

while(true) {
	String Currentdate=driver.findElement(By.xpath("//div[@class='DayPicker-Month']")).getText();
	if(Currentdate.equals(month)) {
		break;
}else {
	driver.findElement(By.className("DayPicker-NavButton DayPicker-NavButton--next")).click();
	
}
	}
//driver.findElement(By.xpath("//div[@class='DayPicker-Body']//div[@class='DayPicker-Week']//tr(contains(@aria-label,'Fri Dec 08 2023'))]"));
}
}


