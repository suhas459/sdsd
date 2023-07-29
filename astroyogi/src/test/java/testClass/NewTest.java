package testClass;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.baseClass;
import pomClasses.boysKundliMatch;
import pomClasses.dashBoardPage;
import pomClasses.girlKundliMatch;
import pomClasses.matchMaking;

public class NewTest  extends baseClass{
  
	dashBoardPage dp;
	matchMaking m;
	boysKundliMatch bkm;
	 girlKundliMatch gm;
	
	 @BeforeMethod
	public void stepsToLaunch() {
		launchTheBrowser();
		 dp= new dashBoardPage(driver);
		 m= new matchMaking(driver);
	 bkm= new boysKundliMatch(driver);

		
	gm=new girlKundliMatch(driver);
	 
	}
	
	
	@Test
  public void f() throws InterruptedException {
		dp.clickOnMore();
		m.clickOnMatchMaking();
		bkm.enterNameOfBOy();
		bkm.enterDOBOfBoy();
		bkm.enterTime();
		bkm.enterBirthPlace();
		
		
		gm.enterNameOfgirl();
		gm.enterDOBOfgirl();
		gm.enterTime();
		gm.enterBirthPlace();
		gm.matchYourKundli();
		
		
		
		
		
		
		
		
		
		
		driver.close();
		Thread.sleep(8000);
		
  }
	
	
	
	
}
