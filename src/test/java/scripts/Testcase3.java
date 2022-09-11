package scripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericLib1.BaseClass1;
import pomPages1.CoreJavaSeleniumTrainingPage1;
import pomPages1.SkillraryLoginPage1;

//got the output
public class Testcase3 extends BaseClass1{

	@Test
	public void tc3() {
		
		SkillraryLoginPage1 s=new SkillraryLoginPage1(driver);
		s.searchField();
		s.searchbtnclick();
		s.corejavabtnclick();
		
		
		
		driverutilities.switchtoframe(driver);
		CoreJavaSeleniumTrainingPage1 cs=new CoreJavaSeleniumTrainingPage1(driver);
		driverutilities.eleClickable(driver,cs.playbtn);
		driverutilities.eleClickable(driver,cs.pausebtn);
		
		//cs.playbtnclick();
		//cs.pausebtnclick();
		
		driverutilities.switchback(driver);
		
		cs.wishlistbtnclick();
		
	}

}
