package Day1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cal_notstoredate {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();

		//14/09/2025 or 14/sep/2025 or 14/september/2025
		//dd/MM/yyyy or dd/MMM/yyyy or dd/MMM/yyyy
		Calendar calendar=Calendar.getInstance();       //this is used to separete the target date
		String targetdate="32/sep/2021";
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/MMM/yyyy");
		try {
		dateformat.setLenient(false);           //this will validate the date
		Date formatteddate=dateformat.parse(targetdate);
		calendar.setTime(formatteddate);
		 int targetday=calendar.get(calendar.DAY_OF_MONTH);  //32
		 int targetMonth=calendar.get(calendar.MONTH);   //sep
		 int targetYear=calendar.get(calendar.YEAR);      //2021
		 
		 driver.findElement(By.id("first_date_picker")).click();
		 String currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();
		 calendar.setTime(new SimpleDateFormat("MMMyyyy").parse(currentdate));
		 int currentmonth=calendar.get(calendar.MONTH);    //dec
		 int currentyear=calendar.get(calendar.YEAR);      //2023
		 //select prev date
		 while(targetMonth<currentmonth||targetYear<currentyear) {
			 driver.findElement(By.className("ui-datepicker-prev")).click();
			 currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();
			 
			 calendar.setTime(new SimpleDateFormat("MMMyyyy").parse(currentdate));
			 currentmonth=calendar.get(calendar.MONTH);  //november
			 currentyear=calendar.get(calendar.YEAR);   //2022
		 }
		 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='"+targetday+"']")).click();
			 
		} catch (Exception e) {
			
			throw new Exception("The tagetdate is invalid, plz check");
		}
	}

}
