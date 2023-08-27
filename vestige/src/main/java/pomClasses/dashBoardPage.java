package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
public class dashBoardPage {

	@FindBy(xpath="//div[@class='simplePopupClose']") private WebElement popUp;
	
	@FindBy(xpath="//div[@id='onstartmodal']") private WebElement pop;
	
	@FindBy(xpath="//a[text()='products']") private WebElement products ;
	
	//@FindBy(xpath="") private WebElement ;
	
	
	public dashBoardPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void popUpHandle() throws InterruptedException {
		boolean showPopUp = pop.isDisplayed();
		Thread.sleep(1000);
		Assert.assertTrue(showPopUp,"this pop up is not displayed");
		Thread.sleep(1000);
		popUp.click();
		Reporter.log("click on that pop up");
		Thread.sleep(1000);
		
	}
	
	public void traverseWithProducts(WebDriver driver) throws InterruptedException {
		boolean clickable = products.isEnabled();
		boolean show = products.isDisplayed();
		Thread.sleep(1000);
		Assert.assertTrue( show ,"products is not displayed");
		Reporter.log("click on that products");
		Thread.sleep(1000);
		Assert.assertTrue(clickable,"this products is not clickable");
		
		Actions a= new Actions(driver);
		Thread.sleep(1000);
		a.click(products).build().perform();
		Reporter.log("click on that products");
		
	}
	
	
	
	
	
	
}
