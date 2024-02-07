package Day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_ex {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	 //method1
		
/*TakesScreenshot ss=(TakesScreenshot)driver;
File source=ss.getScreenshotAs(OutputType.FILE);
File destination=new File("D:\\latha\\amazon.jpg");
FileUtils.copyFile(source,destination);*/
		
	//method 2
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source =ss.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\Screenshots\\amazon"+".png";
		FileUtils.copyFile(source,new File(destination));

	}

}
