package Day1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath_locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("latha");
driver.findElement(By.xpath("//input[@maxlength=15]")).sendKeys("R");
driver.findElement(By.xpath("//input[3][@type=\"text\"]")).sendKeys("latha@12gmail.com");
driver.findElement(By.xpath("//input[1][@type=\"password\"]")).sendKeys("latha@123");
driver.findElement(By.xpath("//input[4][@type=\"password\"]")).sendKeys("latha@123");
//driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[2]/div[1]/div[1]/div/div[1]/article/div/div/form/div[1]/div[3]/button[1]")).click();
//driver.findElement(By.xpath("//button[2][@class=\"btn\"]")).click();
//driver.findElement(By.xpath("//button[3][@type=\"reset\"]")).click();
//driver.findElement(By.xpath("//input[@name=\"refreshbtn\"]")).click();

	}

}
