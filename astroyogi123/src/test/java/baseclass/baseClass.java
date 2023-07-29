package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
public 	WebDriver driver;
	
	public void launchTheBrowser() {
		
		
	WebDriverManager.chromedriver().setup();
	
 driver= new ChromeDriver();
		
	driver.navigate().to("https://www.astroyogi.com/kundli/kundli-matching");
		
		Reporter.log("navigate to astroyogi page", true);
		
		driver.manage().window().maximize();
		
	}
	
	
}
