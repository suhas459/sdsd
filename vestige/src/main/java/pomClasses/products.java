package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class products {

	
@FindBy(xpath="//a[text()='Health Supplements']") private WebElement prop;
@FindBy(xpath="//h2[text()='Heal with Nature']")private WebElement nature;
@FindBy(xpath="(//i[@class='allIcon viewIcon'])[1]") private WebElement eye;



public products (WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	
}
	
	public void product(WebDriver driver) {
		
		
		boolean show = prop.isDisplayed();
		boolean clickable = prop.isEnabled();
		
		
		Assert.assertTrue( show ,"products is not displayed");
		Reporter.log("click on that products");
		Assert.assertTrue(clickable,"this products is not clickable");
		
		Actions a= new Actions(driver);
		a.clickAndHold(prop).build().perform();
		a.click(prop).build().perform();
		Reporter.log("Click On products ");
		
		
	boolean showOff = nature.isDisplayed();
		Assert.assertTrue(showOff,"it is not display");
		
	}
	
	public void viewIcon(WebDriver driver) throws InterruptedException {
		
		Actions a= new Actions (driver);
		a.moveToElement(eye).build().perform();
		
		Thread.sleep(1000);
		boolean view = eye.isDisplayed();
		Assert.assertTrue(view,"it is not visible");
		
	}
	
	
	
	
	
	
	
		
}
