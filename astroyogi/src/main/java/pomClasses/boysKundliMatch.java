package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class boysKundliMatch {

	@FindBy(xpath="(//input[@class='kundli_form_input'])[1]") private WebElement name;
	@FindBy(xpath="//select[@id='Kund_M_Date']") private WebElement date;
	@FindBy(xpath="//select[@id='Kund_M_Month']")private WebElement month;
	@FindBy(xpath="//select[@id='Kund_M_Year']")private WebElement year;
	
	//select[@id='Kund_M_BirthPlace_Hour']
	@FindBy(xpath="//*[@id=\"Kund_M_BirthPlace_Hour\"]")private WebElement hour;
	@FindBy(xpath="//*[@id=\"Kund_M_BirthPlace_Minute\"]")private WebElement min;
	@FindBy(xpath="//*[@id=\"Kund_M_BirthPlace_AM\"]")private WebElement am;
	
	@FindBy(xpath="//input[@id='Kund_M_BirthPlace']") private WebElement namePlace;
	
	public boysKundliMatch (WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	public void enterNameOfBOy() throws InterruptedException {
		
		
		name.sendKeys("suhas powar");
		Thread.sleep(3500);
		Reporter.log("", true);
	}
	
	public void enterDOBOfBoy() throws InterruptedException {
		Select s= new Select(date);
		Select s1= new Select(month);
		Select s2= new Select(year);
		
		
		date.click();
		Thread.sleep(2000);
		Reporter.log("click on date", true);
		
		month.click();
		s.selectByVisibleText("31");
		Thread.sleep(2000);
		Reporter.log(" date enter is 31", true);
		
		year.click();
		s1.selectByVisibleText("12");
		Reporter.log("select month is 12", true);
		
		Thread.sleep(2000);
		s2.selectByVisibleText("1996");
		Reporter.log(" select year is 1996", true);
		Thread.sleep(6000);
		
	}
	
	public void enterTime() throws InterruptedException {
		Select s= new Select(hour);
		Select s1= new Select(min);
		Select s2= new Select(am);
		//Thread.sleep(3000);
		
		hour.click();
		Thread.sleep(2000);
		
		Reporter.log("click on hour", true);
		s.selectByVisibleText("11");
		Thread.sleep(2000);
		Reporter.log("enter hour is 10 ", true);
		
		
		min.click();
		Thread.sleep(2000);
		s1.selectByVisibleText("50");
		Thread.sleep(2000);
		Reporter.log("enter time is 50", true);
		
		am.click();
		Thread.sleep(2000);
		
		
		s2.selectByVisibleText("AM");
		Reporter.log("select time is AM", true);
		Thread.sleep(2000);
	
	}
	
	public void enterBirthPlace() {
		
		
		
		namePlace.sendKeys("tokiyo");
		
		Reporter.log(" enter birth Place is tokiyo", true);
	}
	
	
	
	
	
	
	
}
