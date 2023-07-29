package testClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.baseClass;
import pomClasses.ageInfoPage;
import pomClasses.dashBoardPage;
import pomClasses.familyInfoPage;
import pomClasses.howoldEachMember;

public class NewTest extends baseClass {
	dashBoardPage d;
	 familyInfoPage fp;
	 ageInfoPage ap;
	 howoldEachMember hem;
	@BeforeMethod
	public void stepsToImplement() {
		browserLaunch();
		//dashBoardPage dp= new dashBoardPage(driver);		
	 d= new dashBoardPage(driver);
	 fp= new familyInfoPage(driver);
	 ap= new ageInfoPage(driver);
	 hem=new howoldEachMember(driver);
	 
	}
	
	@Test
  public void f() throws InterruptedException {
		
		d.gettextofLogo(driver);
		fp.clickOnSpouse();
		fp.clickOnDaughter();
		fp.clickOnContinue();
		ap.clickOnSelfAge();
		hem.eachMemberInfo();
		
		Thread.sleep(6000);
	driver.close();
	Thread.sleep(6000);
		
  }
}
