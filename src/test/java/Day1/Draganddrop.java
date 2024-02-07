package Day1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Draganddrop {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
//WebElement from=driver.findElement(By.xpath("//li[@id='credit2']"));      //bank
// WebElement to=driver.findElement(By.xpath("//ol[@id='bank']"));
 
 //WebElement from1=driver.findElement(By.xpath("//li[@id='fourth']"));         //amount
  //WebElement to1=driver.findElement(By.xpath("//*[@id='amt7']"));
  
WebElement from2=driver.findElement(By.xpath("//*[@id='credit1']"));            //sales
  WebElement to2=driver.findElement(By.xpath("//*[@id='loan']"));
  
WebElement from3=driver.findElement(By.xpath("//li[@id='fourth']"));             //amount
   WebElement to3=driver.findElement(By.xpath("//ol[@id='amt7']"));

  Actions act=new Actions(driver);
 //act.dragAndDrop(from, to).perform();
//act.dragAndDrop(from1, to1).perform();
act.dragAndDrop(from2, to2).perform();
act.dragAndDrop(from3, to3).perform();
	}

}
