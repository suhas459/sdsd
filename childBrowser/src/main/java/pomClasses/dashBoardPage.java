package pomClasses;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashBoardPage {

	
	@FindBy(xpath="//button[text()='New Window']") private WebElement wd;
	//@FindBy(xpath="//h1[@id='sampleHeading']") private String newss;
	@FindBy(xpath="//h1[text()='This is a sample page']")  private WebElement  n;
	
 public dashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void childWindowHandle(WebDriver driver) throws InterruptedException {
		Thread.sleep(1200);
		wd.click();
		Thread.sleep(1200);
		
		//driver.switchTo().window("sampleHeading");
		//System.out.println(n.getText());
		
	//	wd.click();
		
		Set<String> aw = driver.getWindowHandles();
		
		System.out.println(aw);
		
		Iterator<String> it = aw.iterator();
		
		
		String first = it.next();
		String second = it.next();
		
		driver.switchTo().window(second);
		System.out.println(n.getText());
	}
	
	
}
