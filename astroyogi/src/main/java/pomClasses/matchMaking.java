package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
public class matchMaking {
 
@FindBy(xpath="//a[@id='matchmakingtopmenu']")	private WebElement mm;
	
public matchMaking (WebDriver driver) {
	PageFactory.initElements( driver, this);
}
	
	public void clickOnMatchMaking() throws InterruptedException {
		
		
		mm.click();
		Thread.sleep(2000);
		Reporter.log("click On Match Making", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
