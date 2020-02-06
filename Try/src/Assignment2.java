import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
		 driver.get("https://www.cleartrip.com/");
		
		
		driver.findElement(By.id("DepartDate")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		
		driver.findElement(By.id("Adults")).click();
		Select select = new Select(driver.findElement(By.id("Adults")));
		select.selectByIndex(3);
		
		driver.findElement(By.id("Childrens")).click();
		select = new Select(driver.findElement(By.id("Childrens")));
		select.selectByIndex(4);
		
		driver.findElement(By.id("Infants")).click();
		select = new Select(driver.findElement(By.id("Infants")));
		select.selectByIndex(2);
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Pradeep Bhandari");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		}
	}

