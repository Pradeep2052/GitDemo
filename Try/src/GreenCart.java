import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
		String [] items = {"Cucumber", "Brocolli "}; 
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 List<WebElement> web = driver.findElements(By.cssSelector(".product-name"));
		 
		 for (int i=0; i<web.size();i++) { 
		 String[] name=web.get(i).getText().split("-"); 
		 String formattedname= name[0].trim();
		 
		 List a = Arrays.asList(items);
		 if(a.contains(formattedname))
		 {
		 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); 
		 }
	   }

	}
}
