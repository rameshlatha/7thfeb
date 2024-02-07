package Day1;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_ex {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.asos.com/au/men/");
		driver.manage().window().maximize();
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		String des=System.getProperty("user.dir")+"\\Screenshot\\Asos.png";
	     FileUtils.copyFile(source, new File (des));

	}

}
