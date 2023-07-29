package pomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ageInfoPage {

	
	@FindBy(xpath="//select[@id='Self']") private WebElement self;
	
	
	
	public ageInfoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnSelfAge() throws InterruptedException {
		
		Select s= new Select(self);
		
		boolean mul = s.isMultiple();
		
		Assert.assertFalse(mul);
		//Assert.fail();
		
//		List<WebElement> opt = s.getOptions();
//		
//		for (WebElement o:opt) {
//			
//			Thread.sleep(200);
//			//o.getText()
//			System.out.println(	o.getText());
//			
//			Thread.sleep(800);
//			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

