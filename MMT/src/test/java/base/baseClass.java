package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
public 	WebDriver driver;
	public void launchTheBrowser() {
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions c= new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
	driver= new ChromeDriver(c);
		
		
		driver.get("https://www.practo.com/");
		
		
		
		
		
	}
	
}
