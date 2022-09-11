package pomPages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage1 {

	//declaration
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addcart;
	
	//initialization
	public  AddtoCartPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getAddbtn() {
		return addbtn;
	}
	
	public void addtocartbtn() {
		addcart.click();
	}
}
