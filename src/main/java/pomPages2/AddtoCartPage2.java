package pomPages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage2 {

	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusbtn;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocartbtn;
	
	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}

	public AddtoCartPage2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getPlusbtn() {
		return plusbtn;
	}
	
	
}
