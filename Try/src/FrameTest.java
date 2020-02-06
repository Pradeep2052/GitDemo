import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://jqueryui.com/droppable/");
		 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		 
		 Actions action = new Actions( driver);
		 
		 WebElement source = driver.findElement(By.id("draggable"));
		 WebElement target = driver.findElement(By.id("droppable"));
		 
		 action.dragAndDrop(source, target).build().perform();
		 driver.switchTo().defaultContent(); 
	}

}
