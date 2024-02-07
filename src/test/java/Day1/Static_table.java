package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://Seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("num of row in table:"+rows);
		int colums=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println("no of colums:"+colums);
		
		//retreive UK value
		String value=driver.findElement(By.xpath("//table[@id='customers']//tr[6]//td[4]")).getText();
		System.out.println(value);
		
		//click on checkbox if the company name is Amazon
		
		List<WebElement>tabledata=driver.findElements(By.xpath("//table[@id='customers']//tr[3]//td[2]"));
		
		for(WebElement options:tabledata) {
			String values=options.getText();
			if(values.equals("Amazon")) {
				driver.findElement(By.xpath("//td[text()='Amazon']//preceding-sibling::td//input")).click();
				driver.findElement(By.xpath("//td[text()='UK']//following-sibling::td//a")).click();
			}
		}
		

	}

}
