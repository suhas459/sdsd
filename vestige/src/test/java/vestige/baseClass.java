package vestige;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
public	WebDriver driver;
	
	public void launchTheBrowser() {
		
		
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions c= new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		c.addArguments("--start-maximized");
		
	 driver= new ChromeDriver(c);
		
		
		driver.navigate().to("https://www.myvestige.com/");
		
		Reporter.log("launch the Browser");
		
		
		
		
		
		
	}
	
}
