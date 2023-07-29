package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public WebDriver driver;
	public void launchThebrowser() {
	
		
		
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions c= new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
driver= new ChromeDriver(c);
		
		driver.navigate().to("https://ndcdyn.interactivebrokers.com/Universal/Application?pa=T");
		
		driver.manage().window().maximize();
		
		
	}
	
	
	
}
