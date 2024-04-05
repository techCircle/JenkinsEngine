package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class SplashPage {
	
	
	
	public SplashPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	

	@FindBy(name="username")
	public WebElement userNameInputBox;
	
	@FindBy(name="password")
	public WebElement passwordInputBox;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginButton;
	
	
	

}
