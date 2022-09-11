package pomPages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaSeleniumTrainingPage1 {

	
	@FindBy(xpath="//div[@class='play-icon']")
	public WebElement playbtn;
	
	@FindBy(id="player")
	private WebElement frame;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	public WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlistbtn;
	
	public CoreJavaSeleniumTrainingPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playbtnclick() {
		playbtn.click();
	}
	public void pausebtnclick() {
		pausebtn.click();
	}
	public void wishlistbtnclick() {
		wishlistbtn.click();
	}
}
