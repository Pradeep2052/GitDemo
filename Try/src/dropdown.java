import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
		 
		 driver.get("https://www.expedia.com/");
		 driver.findElement(By.xpath(" //*[@id=\'tab-flight-tab-hp\']/span[2] ")).click(); //click flight 
		// driver.findElement(By.xpath(" //*[@id='traveler-selector-hp-flight']/div/ul/li/button")).click(); //click on adult section 
		 
for (int i=1;i<5;i++) 
		
		{ 
	    // driver.findElement(By.xpath("//*[@id=\'traveler-selector-hp-flight\']/div/ul/li/div/div/div/div[1]/div[4]/button/span[1]/svg")).click();
		  
		  }
		  
		 // driver.findElement(By.xpath(" //*[@id=\'traveler-selector-hp-flight\']/div/ul/li/div/footer/div/div[2]/button "));

      driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("KTM");
	}

}
