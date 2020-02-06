import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.findElement(By.xpath("//*[@id='content']/ul/li[33]/a")).click();
		 driver.findElement(By.cssSelector("a[href*='windows']")).click(); 
		 
		 Set<String> ID= driver.getWindowHandles(); 
		 Iterator<String> IDs= ID.iterator(); 
		 String PW = IDs.next();
		 String CW = IDs.next();
		 driver.switchTo().window(IDs.next()); 
		 System.out.println(driver.findElement(By.xpath("//div/h3")).getText()); 
		 driver.switchTo().window(PW); 
		 System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText()); 
		 
		 
		 
	}

}
