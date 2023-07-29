package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class howoldEachMember {

	@FindBy(xpath="//select[@id='Self']")private WebElement self;
	@FindBy(xpath="//select[@id='Spouse']")private WebElement spouse;
    @FindBy(xpath="//select[@id='Firstdaughter']")private WebElement fdaughter;
	@FindBy(xpath="//select[@id='Seconddaughter']")private WebElement sdaughter;
	@FindBy(xpath="//input[@id='submitButton']")private WebElement submit;
	@FindBy(xpath="//input[@id='txtcity']")private WebElement city;
	
	
	public howoldEachMember(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void eachMemberInfo() throws InterruptedException {
		Select s=new Select(self);
		Select s1=new Select(spouse);
		Select s2=new Select(fdaughter);
		Select s3=new Select(sdaughter);
		
		
		boolean a = s.isMultiple();
		boolean b = s1.isMultiple();
		boolean c = s2.isMultiple();
		boolean d = s3.isMultiple();
		
		Assert.assertFalse(a, "if multiple then tc is failed");
		Assert.assertFalse(b, "if multiple then tc is failed");
		Assert.assertFalse(c, "if multiple then tc is failed");
		Assert.assertFalse(d, "if multiple then tc is failed");
		
		
		Thread.sleep(1200);
		s.selectByVisibleText("28 yr");
		Thread.sleep(1200);
		s1.selectByVisibleText("25 yr");
		Thread.sleep(1200);
		s2.selectByVisibleText("3-12 Months");
		Thread.sleep(1200);
		s3.selectByVisibleText("17-90 Days");
		Thread.sleep(1200);
		
		
		submit.click();
		Thread.sleep(4200);
		
		city.sendKeys("Pune");
		//Assert.fail();
		
	}
	
	
}
