import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get(" https://rahulshettyacademy.com/seleniumPractise/#/offers");
		 List<WebElement> list = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		 ArrayList<String> aList = new ArrayList(); 
		 
		 for(int i=0; i<list.size();i++) { 
			String a=  list.get(i).getText(); 
		    System.out.println(a); 
		 }
	}

}
