package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
         
		 WebDriver driver =new ChromeDriver(); 
		 
		/* driver.get("https:\\www.google.com");	
		 System.out.println(driver.getTitle()); // page tittle is correct 
		System.out.println( driver.getCurrentUrl()); // this will hit URL in the browser 
		//System.out.println( driver.getPageSource());
		driver.get("https:\\gmail.com");
		driver.navigate().back();
		driver.get("https:\\facebook.com");
		driver.findElement(By.id(("email"))).sendKeys("Pradeepbhandari2053@gmail.com");
		driver.findElement(By.name(("Password"))).sendKeys("Namaste");
		*/
	}

}
