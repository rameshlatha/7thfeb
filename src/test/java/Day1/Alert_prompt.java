package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_prompt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
Thread.sleep(2000);
WebElement element = driver.findElement(By.xpath("//button[@id='promptBox']"));
driver.switchTo().alert();
JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].scrollIntoView();", element);
js.executeScript("window.scrollBy(0,100)","");
element.click();

//String sr=driver.switchTo().alert().getText();
driver.switchTo().alert().sendKeys("lithi");
driver.switchTo().alert().accept();

	}

}
