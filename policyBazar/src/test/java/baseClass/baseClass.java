package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
public 	WebDriver driver;
	public void browserLaunch() {
	
		
	WebDriverManager.chromedriver().setup();
//	ChromeOptions c= new ChromeOptions();
//	c.addArguments("--remote-allow-origins=*");
	
	
 driver= new ChromeDriver();
		
		driver.navigate().to("https://www.policybazaar.com/?pb");
		
		Reporter.log("launch the browser", true);
		
		
		
		
		
	}
	}
