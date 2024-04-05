package TestNG_Review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import pages.SplashPage;
import pages.commonLocatorsPage;

public class openingBrowserUsingBaseClassTesting {
	
	
	SplashPage sp = new SplashPage();
	commonLocatorsPage cLp = new commonLocatorsPage();
	
	@Test
	public void loginTest() throws InterruptedException {
	
		sp.userNameInputBox.sendKeys("Admin");
		sp.passwordInputBox.sendKeys("admin123");
		sp.loginButton.click();
		Thread.sleep(3000);	
		cLp.userDropDownMenu("Logout");	
	}
	
	
	
	
	
	
	

}
