package cricPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indWIMatchResultPage {

	
	@FindBy(xpath="//*[@id=\"comm_1690226287162\"]/p/b")
	private WebElement rohit;
	
	
	@FindBy(xpath="(//a[text()='Scorecard'])[1]") private WebElement scoreCard;
	
	
	
	public indWIMatchResultPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public String captainNameMatch() {
		
	
		return rohit.getText();
		
	}
	
	public void clickOnScoreCard() throws InterruptedException {
		Thread.sleep(1500);
		scoreCard.click();
		Thread.sleep(1500);
	}
	
}
