package scripts1;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib1.BaseClass1;
import pomPages1.SkillraryLoginPage1;
import pomPages1.SkillrarydemoLoginPage1;
import pomPages1.TestingPage1;

public class Testcase22 extends BaseClass1{

	@Test
	public void tc22() throws IOException {
		
		SkillraryLoginPage1 lp=new SkillraryLoginPage1(driver); 
		lp.gearsbutton();
		lp.skillrarydemoApplication();
		
		
		SkillrarydemoLoginPage1 dp=new SkillrarydemoLoginPage1(driver);
		driverutilities.switchtabs(driver);
		driverutilities.dropDown(dp.getDropdown(),pdata.getPropertyfile1("courses"));
		
		TestingPage1 tp=new TestingPage1(driver);
		driverutilities.draganddrop(driver,tp.getSeleniuntraining(),tp.getCarttab());
		

		driverutilities.scrollbarpaticular(driver, tp.facebookicon);
		tp.facebookIcon();
		
	}
}
