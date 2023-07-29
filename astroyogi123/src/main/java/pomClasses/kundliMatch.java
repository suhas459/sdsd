package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class kundliMatch {

	@FindBy(xpath="//*[@id=\"Kund_M_BirthPlace_Hour\"]") private WebElement hour;
	@FindBy(xpath="(//select[@id='Kund_M_BirthPlace_Hour']/option)[10]") private WebElement h;
	
	public kundliMatch (WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	
	public void enterBirthTime() throws InterruptedException {
		
	Select s= new Select(hour);
	
	
	hour.click();
	Thread.sleep(4500);
	s.selectByVisibleText("06");
		//h.sendKeys("10");
		
		
		
		
		
	}
	
	
}
