package Day1;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Windows_handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.id("newWindowsBtn")).click();	
   Set<String>windows= driver.getWindowHandles();  
Iterator<String> ids=windows.iterator();
String parent=ids.next();
String child1=ids.next();
String child2=ids.next();

System.out.println("id parent"+parent);
System.out.println("child1"+child1);
System.out.println("child2"+child2);
	}

}
