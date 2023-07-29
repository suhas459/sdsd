package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class dashBoardPage {

@FindBy(xpath="//span[text()='Best Insurance']")private WebElement logo;
@FindBy(xpath="(//div[@class='shadowHandlerBox'])[2]")private WebElement health;	

public dashBoardPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	
public void gettextofLogo(WebDriver driver) throws InterruptedException {
	
	System.out.println(logo.getText());
	Reporter.log("get text of logo", true);

	
	String st1 = logo.getText();
	
	String st2 = "Best Insurance";
	
	Assert.assertEquals(st1,st2, "if not same our test case is failed");
	
	Thread.sleep(3500);
	
	health.click();
	
	Thread.sleep(3500);
	Reporter.log("click on health insurance", true);
	Thread.sleep(3500);
	
}
	
	
}
