package pomPages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage2 {

	@FindBy(id="Selenium Training")
	private WebElement seleniumtrainingimg;
	
	@FindBy(id="cartArea")
	private WebElement carttab;
	
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	public TestingPage2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCarttab() {
		return carttab;
	}

	
	public WebElement getFacebookicon() {
		return facebookicon;
	}

	public WebElement getSeleniumtrainingimg() {
		return seleniumtrainingimg;
	}

	public void facebook() {
		facebookicon.click();
	}
	
}
