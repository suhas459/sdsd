package testClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.baseClass;
import pomClasses.kundliMatch;

public class NewTest extends baseClass {
 
	kundliMatch km;
	
	
	@BeforeMethod
	public void stepsToLaunch() {
		launchTheBrowser();
		 km= new kundliMatch(driver);
		
		
	}
	
	
	@Test
  public void f() throws InterruptedException {
		
		km.enterBirthTime();
		
		
		
		
		
		
		
		
		
		
		driver.close();
		Thread.sleep(1500);
  }
}
