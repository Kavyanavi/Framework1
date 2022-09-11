package pomPages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoAppPage2 {

	@FindBy(id="course")
	private WebElement coursebtn;
	
	public WebElement getCourse() {
		return coursebtn;
	}

	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraineebtn;
	
	@FindBy(name="addresstype")
	public WebElement coursedd;
	
	
	public SkillraryDemoAppPage2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void course() {
		coursebtn.click();
	}
	
	public void seleniumtrianee() {
		seleniumtraineebtn.click();
	}
	public WebElement getCoursedd() {
		return coursedd;
	}

	
}
