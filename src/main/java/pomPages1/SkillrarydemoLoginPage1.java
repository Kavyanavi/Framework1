package pomPages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarydemoLoginPage1 {

	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	@FindBy(name="addresstype")
	private WebElement dropdown;
	
	

	public SkillrarydemoLoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getCoursebtn() {
		return coursebtn;
	}
	
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}

	public WebElement getDropdown() {
		return dropdown;
	}
	
}
