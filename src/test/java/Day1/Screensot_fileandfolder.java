package Day1;
import java.io.File;
import java.io.OutputStream;
import java.nio.file.Files;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screensot_fileandfolder {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//covert webdriver object to take screenshot
	TakesScreenshot ss=(TakesScreenshot)driver;   //method1 store screenshot in local folder
	//call getscreenshot method to take screen shot
	File source=ss.getScreenshotAs(OutputType.FILE);
	//create new folder
	File destination =new File("D:\\latha\\amazon.jpg");
	//copy screenshot from source,destination
	//FileUtils.copyfile(source,destination);
	
File ss1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(ss1,new File("D:\\latha\\amazon.jpg"));

//method2
TakesScreenshot ss2=(TakesScreenshot)driver;
File source1=ss2.getScreenshotAs(OutputType.FILE);
String destination2=System.getProperty("user.dir")+"\\latha\\amazn"+".png";
//FileUtils.copyFile(source1, new File(destination2));



	}

}
