import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePratice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
		
		 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/26862/"
		 		+ "caxi-vs-enga-2nd-unofficial-odi-england-lions-tour-of-australia-2020");

		 
		   WebElement table =  driver.findElement(By.cssSelector("div[class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));
		   int rowCount=   table.findElements(By.cssSelector(" div[class ='cb-col cb-col-100 cb-scrd-itms'] ")).size();
		   int coloumnCount=  table.findElements(By.cssSelector("div[class=' cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		   
		   for(int i=0; i<coloumnCount;i++) {
		   System.out.println(table.findElements(By.cssSelector("div[class=' cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)); 
		   }
		 
	}

}
