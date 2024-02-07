package Day1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		//driver.get("");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='promtButton']")).click();
driver.switchTo().alert();
String sr=driver.switchTo().alert().getText();
Thread.sleep(2000);
driver.switchTo().alert().sendKeys("latha");
driver.switchTo().alert().accept();

	}

}
