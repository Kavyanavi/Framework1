package pomPages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage2 {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoappbtn;
	
	public SkillraryLoginPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gears() {
		gearsbtn.click();
	}
	public void demoapp() {
		demoappbtn.click();
	}
}
