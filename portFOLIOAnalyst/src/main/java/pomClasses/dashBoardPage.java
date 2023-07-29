package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashBoardPage {

@FindBy(xpath="//*[@id=\"emailAddress\"]")	private WebElement email;
@FindBy(xpath="//*[@id=\"username\"]")	private WebElement userName;
@FindBy(xpath="//*[@id=\"password\"]")	private WebElement pass;
@FindBy(xpath="//*[@id=\"password2\"]")	private WebElement cpass;

@FindBy(xpath="//*[@id=\"firstName\"]")	private WebElement fname;
@FindBy(xpath="//*[@id=\"lastName\"]")	private WebElement lname ;

@FindBy(xpath="//*[@id=\"countryResidentialResidence_chosen\"]")	private WebElement country;
@FindBy(xpath="//*[@id=\"date\"]")	private WebElement dob;

@FindBy(xpath="//*[@id=\"question0\"]")	private WebElement s1;
@FindBy(xpath="//*[@id=\"answer0\"]")	private WebElement a1;

@FindBy(xpath="//*[@id=\"question1\"]")	private WebElement s2 ;
@FindBy(xpath="//*[@id=\"answer1\"]")	private WebElement a2;

@FindBy(xpath="//*[@id=\"question2\"]")	private WebElement s3;
@FindBy(xpath="//*[@id=\"answer2\"]")	private WebElement a3;

@FindBy(xpath="//*[@id=\"paAgreement_positive\"]")	private WebElement agree;
@FindBy(xpath="//*[@id=\"accountCreationButton\"]")	private WebElement click;




public dashBoardPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	
	
	public void entermail() {
		
		email.sendKeys("s@gmail.com");
		
		//return mail;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
