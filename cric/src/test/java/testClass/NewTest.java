package testClass;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import cricBaseClass.baseClass;
import cricPomClasses.ScoreCrdPage;
import cricPomClasses.dashBoardPage;
import cricPomClasses.indWIMatchResultPage;

public class NewTest extends baseClass{
	ScoreCrdPage scp;
	dashBoardPage dp;
	indWIMatchResultPage ip;
	@BeforeMethod
	public void stepsTolaunch() {
		launchTheBaseClass();
		 dp= new dashBoardPage(driver);
		 ip=new indWIMatchResultPage(driver);
	 scp= new ScoreCrdPage(driver);
		
	}
	
	
	@Test (priority = -2,enabled = false)
  public void stringMatch() {
		
		String act = "Match drawn";
		Reporter.log("check dashboard page string match", true);
	Assert.assertEquals(dp.match(), act, "String is not match , then tc is failed");
		
  }
	
	
	@Test (priority = -1,enabled = false)
	public void captainStringMatch() throws InterruptedException {
		dp.ClickOnDrwan();
		String a="Rohit Sharma | India captain:";
		//String e = ip.captainNameMatch();
		Thread.sleep(3000);
		Reporter.log("check captain name matched", true);
		Assert.assertEquals(ip.captainNameMatch(), a, "both are not same tc is failed");
		//ip.clickOnScoreCard();
		
	}
	
	@Test (enabled = true)
	public void ScoreStringMatch() throws InterruptedException {
		Thread.sleep(3500);
		dp.ClickOnDrwan();
		Thread.sleep(1500);
		ip.clickOnScoreCard();
		Thread.sleep(1500);
		
		
		SoftAssert a= new SoftAssert();
		
		String exp="57";
		String actRes=scp.matchScore();
		Reporter.log("check Score name matched", true);
		//Assert.assertNull(actRes,"is null then tc is failed");
	a.assertEquals(exp,actRes,"not same tc is failed");
		Assert.assertNotNull(actRes,"is null then tc is failed");
		Reporter.log("value is present (runs) inside the player name", true);
		a.assertAll();
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void closetheBrowser() throws InterruptedException {
		Thread.sleep(7500);
		Reporter.log("close the browser", true);
		driver.close();
	}
	
}
