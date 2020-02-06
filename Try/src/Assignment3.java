import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
		 driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		 
         driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		 WebDriverWait wait =new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("div[@id='results']")));
		 System.out.println(driver.findElement(By.xpath("div[@id='results']")).getText());

	}

}
