import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		  
		 // get the count of link 
		 System.out.println(driver.findElements(By.tagName("a")).size()); 
		 
		 //get the  count link of footer
		WebElement footer=  driver.findElement(By.id("gf-BIG")); 
		System.out.println(footer.findElements(By.tagName("a")).size()); 
		
		//links of first coloum in footer 
		WebElement ColoumnDriver= footer.findElement(By.xpath("//table/t"
				+ "body/tr/td[1]/ul"));
		System.out.println(ColoumnDriver.findElements(By.tagName("a")).size());
		
		//click on each links in the coloumn 
		for (int i=1; i<ColoumnDriver.findElements(By.tagName("a")).size();i++)
         {   
			String clickControl = Keys.chord(Keys.CONTROL,Keys.ENTER); 
			ColoumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickControl);
         }
		
			Set<String> setUp= driver.getWindowHandles();
			Iterator<String> Id= setUp.iterator(); 
			while(Id.hasNext()) 
			    {  
				driver.switchTo().window(Id.next()); 
				System.out.println(driver.getTitle()); 
			    }
          
			
  }
		 
	}


