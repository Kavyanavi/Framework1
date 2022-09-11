package pomPages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage1 {

	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniuntraining;
	
	@FindBy(id="cartArea")
	private WebElement carttab;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	public WebElement facebookicon;
	
	public TestingPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void facebookIcon() {
		facebookicon.click();
	}

	

	public WebElement getSeleniuntraining() {
		return seleniuntraining;
	}
	public WebElement getCarttab() {
		return carttab;
	}
	
}
