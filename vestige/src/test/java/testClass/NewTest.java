package testClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.dashBoardPage;
import pomClasses.products;
import vestige.baseClass;

public class NewTest extends baseClass{
  
	dashBoardPage dp;
	products p;
	
	@BeforeMethod
	public void stepsToNavigate() {
		launchTheBrowser();
		
	dp= new dashBoardPage(driver);
	p= new products(driver);
	}
	
	@Test
  public void f() throws InterruptedException {
		dp.popUpHandle();
		dp.traverseWithProducts(driver);
		p.product(driver);
		p.viewIcon(driver);
		
		
		//driver.close();
  }
}
