package pomPages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage1 {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skiillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchfield;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement corejavabtn;
	
	public SkillraryLoginPage1(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void corejavabtnclick() {
		corejavabtn.click();
	}
	public void searchbtnclick() {
		searchbtn.click();
	}
	public void gearsbutton() {
		gearsbtn.click();
	}
	public void skillrarydemoApplication() {
		skiillrarydemoapp.click();
	}
	public void searchField() {
		searchfield.sendKeys("core java for selenium");
	}
	
	
}
