import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); 
		 
		 driver.findElement(By.id("autocomplete")).sendKeys("nep");
		 driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN); 
		 driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN); 
		 System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
	}

}
