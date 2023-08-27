package testNgClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.dashBoardPage;
import vestige.baseClass;

public class NewTest extends baseClass{
	dashBoardPage dp;
	
	@BeforeMethod
	public void stepsToLaunch() {
		launchTheBrowser();
		
		dp= new dashBoardPage(driver);
		
		
	}
	
	
	@Test
  public void f() throws InterruptedException {
		
		dp.childWindowHandle(driver);
		
		
		
		
		
		
		
		
		
		
		
		
  }
}
