package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
public class dashBoardPage {

	
@FindBy(xpath="//a[text()='More ￬']") private WebElement more;	
	
	public dashBoardPage (WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	public void clickOnMore() throws InterruptedException {
		
		more.click();
		Thread.sleep(8500);
		
		Reporter.log("click on More ", true);
	}
	
	
	
	
	
	
}
