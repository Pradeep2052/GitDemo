import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
		
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement web = driver.findElement(By.id("checkBoxOption1"));
         web.click();
		 System.out.println(web.isSelected());
		 web.click();
		 System.out.println(web.isSelected());

		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}