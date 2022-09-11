package scripts1;

import org.testng.annotations.Test;

import genericLib1.BaseClass1;
import pomPages1.AddtoCartPage1;
import pomPages1.SkillraryLoginPage1;
import pomPages1.SkillrarydemoLoginPage1;

public class Testcase11 extends BaseClass1 {

	@Test
	public void tc1() {
		
		SkillraryLoginPage1 lp=new SkillraryLoginPage1(driver);
		lp.gearsbutton();
		lp.skillrarydemoApplication();
		
		SkillrarydemoLoginPage1 dl=new SkillrarydemoLoginPage1(driver);
	    driverutilities.switchtabs(driver);
	    driverutilities.mouseHover(driver, dl.getCoursebtn());
	    dl.seleniumtrainingtab();
	    
	    AddtoCartPage1 ac=new AddtoCartPage1(driver);
	    driverutilities.doubleclick(driver, ac.getAddbtn());
	    ac.addtocartbtn();
	    
	    driverutilities.alertpopup(driver);
		
	}
	
}
