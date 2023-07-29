package cricPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScoreCrdPage {

	@FindBy(xpath="(//div[text()='57'])[1]") private WebElement score;
	

	public ScoreCrdPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public String matchScore() {
		
		
		//String act = score.getText();
		return  score.getText();
		
	}
	
	
	
	
	
}
