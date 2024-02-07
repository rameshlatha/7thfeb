package Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handforloop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
     	driver.findElement(By.id("newWindowsBtn")).click();	
	Thread.sleep(2000);

Set<String> windows=driver.getWindowHandles();           
List<String> ids=new ArrayList(windows);
String parent=ids.get(0);
String child1=ids.get(1);
//String child2=ids.get(2);
//parent to child
for(String values:windows) 
{
	driver.switchTo().window(child1);
	
}

	}

}
