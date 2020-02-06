import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\Documents\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize(); //maximize my window 
		 driver.manage().deleteAllCookies();
		 
		 driver.get("http://google.com");
			
			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\16824\\screenshot.png"));
	}

}
