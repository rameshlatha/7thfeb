package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Not_Selectuse {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	//dropdown without select class
	 List<WebElement>options=driver.findElements(By.xpath("//select [@id='ide']"));
System.out.println(options);
	}

}
