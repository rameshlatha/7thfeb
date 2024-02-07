package Day1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class Switch_window {

	public static void main(String[] args) throws InterruptedException {
WebDriver dr=new ChromeDriver();
dr.get("https://demoqa.com/browser-windows");

dr.manage().window().maximize();
//String parent=dr.getWindowHandle();
//System.out.println(parent);*-+
dr.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
Set<String>windows=dr.getWindowHandles();

/*//iterator method
 * 
Iterator<String>ids=windows.iterator();
String parent=ids.next();
String child=ids.next();
System.out.println(parent);
System.out.println(child);

//to move fromparent to child
 * 
String childurl=dr.switchTo().window(child).getCurrentUrl();
System.out.println(childurl);

//to move to parent from child
 * 
Thread.sleep(3000);
String parenturl=dr.switchTo().window(parent).getCurrentUrl();
System.out.println(parenturl);*/

//for loop

/*List<String>ids=new ArrayList(windows);
String parent=ids.get(0);
String child=ids.get(1);
System.out.println(child);
System.out.println(parent);
//parent to child
for(String id:windows) {
	String childurl=dr.switchTo().window(id).getCurrentUrl();
	System.out.println(childurl);
	if(childurl.equals("https:demoqa.com/sample")) {
		String text=dr.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);*/
		
	//}
//}



	}

}
