package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class girlKundliMatch {

	@FindBy(xpath="(//input[@class='kundli_form_input'])[2]") private WebElement name;
	@FindBy(xpath="//select[@id='Kund_F_Date']") private WebElement date;
	@FindBy(xpath="//select[@id='Kund_F_Month']")private WebElement month;
	@FindBy(xpath="//select[@id='Kund_F_Year']")private WebElement year;
	
	
	@FindBy(xpath="//select[@id='Kund_F_BirthPlace_Hour']")private WebElement hour;
	@FindBy(xpath="//select[@id='Kund_F_BirthPlace_Minute']")private WebElement min;
	@FindBy(xpath="Kund_F_BirthPlace_AM")private WebElement am;
	
	
	@FindBy(xpath="//input[@id='Kund_F_BirthPlace']") private WebElement namePlace;
	
	@FindBy(xpath="//button[text()='Match Your Kundli']") private WebElement myk;
	
	
	public girlKundliMatch (WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	
public void enterNameOfgirl() throws InterruptedException {
		
		
		name.sendKeys("shweta powar");
		Thread.sleep(3500);
		Reporter.log(" entering name of girl is shweta powar", true);
	}
	
	
public void enterDOBOfgirl() throws InterruptedException {
	Select s= new Select(date);
	Select s1= new Select(month);
	Select s2= new Select(year);
	
	
	date.click();
	Reporter.log("", true);
	Thread.sleep(2000);
	
	
	month.click();
	Reporter.log("", true);
	s.selectByVisibleText("31");
	Reporter.log("", true);
	Thread.sleep(2000);
	
	year.click();
	Reporter.log("", true);
	s1.selectByVisibleText("12");
	Reporter.log("", true);
	Thread.sleep(2000);
	s2.selectByVisibleText("1996");
	Reporter.log("", true);
	Thread.sleep(3000);
	
}

public void enterTime() throws InterruptedException {
	Select t= new Select(hour);
	Select t1= new Select(min);
	Select t2= new Select(am);
	Thread.sleep(3000);
	
	hour.click();
	Reporter.log("click on hour", true);
	Thread.sleep(2000);
	
	t.selectByVisibleText("10");
	Reporter.log("enter hour is 10", true);
	Thread.sleep(2000);
	
	min.click();
	Reporter.log("click on minute", true);
	Thread.sleep(2000);
	t1.selectByVisibleText("50");
	Reporter.log("entering min is 50", true);
	Thread.sleep(2000);
	
	am.click();
	Reporter.log("click on timestamp", true);
	Thread.sleep(2000);
	t2.selectByVisibleText("AM");
	Reporter.log("time stamp is AM", true);
	Thread.sleep(2000);
}

public void enterBirthPlace() {
	
	
	
	namePlace.sendKeys("japan");
	Reporter.log(" enter birth place of girl is japan", true);
}


public void matchYourKundli() {
	myk.click();
	Reporter.log(" click on match your kundli", true);
}







}
