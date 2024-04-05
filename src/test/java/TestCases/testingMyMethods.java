package TestCases;

import org.openqa.selenium.By;

import Utilities.BaseClass;
import Utilities.commonMethods;

public class testingMyMethods {

	public static void main(String[] args) {

	commonMethods.sendKey(BaseClass.getDriver().findElement(By.xpath("")), "Admin");
	
	commonMethods.paolaWait(3);
	
	commonMethods.switchToIFrameByIndext(0);
	
	
	
	commonMethods.switchToChildWindow(BaseClass.getDriver().getWindowHandle());
	
	commonMethods.waitForClickability(BaseClass.getDriver().findElement(By.xpath(""))).click();;
	
	
	commonMethods.click(BaseClass.getDriver().findElement(By.xpath("")));
	
	commonMethods.hoverOverMouse(BaseClass.getDriver().findElement(By.xpath("")));
	}

}
