package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
 
 
if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) 
{	
	driver.findElement(By.xpath("//button[@class='btn-close']")).click();
}
driver.findElement(By.xpath("/html/body/div[1]/nav/ul/li[6]/a")).click();
driver.findElement(By.xpath("//a[text()='Customers']")).click();

//find no of pages in table
String pages=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
System.out.println(pages);

int totalpages=Integer.parseInt(pages.substring(pages.indexOf("(")+1,pages.indexOf("pages")-1));
System.out.println("no of pages in table:"+totalpages);

for(int p=1;p<=4;p++)                                  //no of pages in a table

{
	WebElement activepages=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()='"+p+"']"));
	System.out.println(activepages.getText());
	if(totalpages>1)
	{
		WebElement activepage=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()='"+p+"']"));
		System.out.println(activepage.getText());	
	}

	
	int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tr")).size();
	System.out.println("no of row in activepage:"+rows);                //no of rows in the active pages

	for (int r=1;r<=rows;r++) 
	{
		String C3=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tr["+r+"]//td[3]")).getText();
		System.out.println(C3);
	}
	
      }

	}
}



