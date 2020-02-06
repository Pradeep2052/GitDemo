import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.id("checkBoxOption1")).click();
		 String getText=driver.findElement(By.id("checkBoxOption1")).getAttribute("Value");
		 System.out.println(getText); 
		 
		 WebElement dropdown=driver.findElement(By.cssSelector("select#dropdown-class-example"));
		 int count=driver.findElements(By.tagName("option")).size();
		 System.out.println(count);
         
		 Select select =new Select(dropdown); 
		 select.selectByVisibleText(getText);
		 driver.findElement(By.name("enter-name")).sendKeys(getText);
	     driver.findElement(By.id("alertbtn")).click();
	     
	     String text=  driver.switchTo().alert().getText();
	     if(text.contains(getText)) {
         System.out.println("Pass");
	     } else
	     System.out.println("Fail");
	     }
	}
	
