package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_selectDrpdown_forloop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://www.bstackdemo.com/");
driver.manage().window().maximize();
List<WebElement> drpdwn =driver.findElements(By.xpath("//select//option"));
for(int i=0;i<=drpdwn.size();i++) {
	if(drpdwn.get(i).getText().equals("Highest to lowest")) {
		drpdwn.get(i).click();
		break;
	}
}
//enhanced for loop
/*for(WebElement ele:drpdwn) {
	if(ele.getText().equals("Highest to lowest")) {
		ele.click();
	}
}*/

	}

}
