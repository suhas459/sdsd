package cricBaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	protected WebDriver driver;
	
public void launchTheBaseClass() {
	
	
	
	Reporter.log("launch the chrome  browser", true);
	WebDriverManager.chromedriver().setup();
	ChromeOptions c= new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	
 driver= new ChromeDriver(c);

	Reporter.log("navigate to cricbuzz webApps", true);
	driver.navigate().to("https://www.cricbuzz.com/");
	
	driver.manage().window().maximize();
}
}
