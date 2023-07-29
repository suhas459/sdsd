package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
public class familyInfoPage {

	@FindBy(xpath="//p[text()='Spouse ']") private WebElement spouse;
	@FindBy(xpath="//p[text()='Daughter ']") private WebElement daughter;
	@FindBy(xpath="//*[@id=\"membersForm\"]/div[2]/label[4]/p/span/i[2]")  private WebElement countPlus;
	@FindBy(tagName = "(//i)[8]")private WebElement tag;
	@FindBy(xpath="//input[@id='submitButton']") private WebElement cont;
	
	public familyInfoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickOnSpouse() throws InterruptedException {
		spouse.click();
		Thread.sleep(1500);
		Reporter.log("click on spouse", true);
	}
	
	public void clickOnDaughter() throws InterruptedException {
		Thread.sleep(1500);
		daughter.click();
		Thread.sleep(3500);
		
		countPlus.click();
		Thread.sleep(3500);
		//countPlus.click();
		Reporter.log("click on daughter", true);
	}
	
	public void clickOnContinue() throws InterruptedException {
		cont.click();
		Thread.sleep(1500);
		Reporter.log("click on cont", true);
		//Assert.fail();
	}
	

	
}
