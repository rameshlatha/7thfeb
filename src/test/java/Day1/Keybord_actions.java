package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keybord_actions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
driver.findElement(By.xpath("//input [@placeholder='First Name']")).click();
Actions act=new Actions(driver);
act.keyDown(Keys.SHIFT);            // press shift key on keyboard
act.sendKeys("latha");             // enter the data
act.keyUp(Keys.SHIFT);             // release the shift key on keyboard
act.perform();

//select the data
act.keyDown(Keys.CONTROL);
act.sendKeys("a");            //ctrl+A
act.keyUp(Keys.CONTROL);
act.perform();

//copy the data
act.keyDown(Keys.CONTROL);
act.sendKeys("c");             // ctrl+C
act.keyUp(Keys.CONTROL);
act.perform();

// move to next field
act.sendKeys(Keys.TAB);
act.perform();

//paste the data
act.keyDown(Keys.CONTROL);
act.sendKeys("v");       //ctrl+v
act.keyUp(Keys.CONTROL);
act.perform();







	}

}
