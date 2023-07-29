package testClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.baseClass;
import pomClasses.dashBoardPage;

public class NewTest extends baseClass{
	dashBoardPage dp;
	
	
	
	@BeforeMethod
	public void stepsToLaunch() {
		launchThebrowser();
	 dp= new dashBoardPage(driver);
	}
	
	@Test
  public void f() {
		dp.entermail();
		
  }
}
