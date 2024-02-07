package Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sele1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");                 //open url
		
		String title=driver.getTitle();                             //title of webpage
		System.out.println(title);
		
		String currenturl=driver.getCurrentUrl();                     //  web page current url 
		System.out.println(currenturl);
		
		driver.navigate().to("https://demo.opencart.com/");                 //navigate to next url
		
		String title2=driver.getTitle();
		System.out.println(title2);
		
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	
     	driver.navigate().back();                                  //back of webpage
		driver.navigate().forward();                                 //forward web page
		driver.navigate().refresh();                                 //reload or refresh webpage
		//driver.close();

	}

}
