import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");  
		 
		WebElement table = driver.findElement(By.id("product")); 
		int rowCount=driver.findElements(By.cssSelector("table#product tbody tr")).size();
		System.out.println(rowCount); //print rows 

		int columnCount=driver.findElements(By.cssSelector("table#product tbody tr th")).size();
		System.out.println(columnCount); // print coloumns 
		
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
	}

}
