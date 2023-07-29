package cricPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashBoardPage {

	
	@FindBy(xpath="(//div[text()='Match drawn'])[1]") private WebElement draw;
	
	
	public dashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public String match() {
		
		
		String exp = draw.getText();
		
		return exp;
		
		
	}
	
	public void ClickOnDrwan() {
		
		draw.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
