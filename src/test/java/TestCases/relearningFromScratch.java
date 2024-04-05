package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.BaseClass;
import Utilities.commonMethods;

public class relearningFromScratch {

	public static void main(String[] args) {

			BaseClass.getDriver();
			Actions action = new Actions(BaseClass.getDriver());
			//commonMethods.switchToIFrameByIndext(0);	
			
	//		commonMethods.takeScreenShot(BaseClass.getDriver());
			WebElement draggable = BaseClass.getDriver().findElement(By.id("draggable"));
			WebElement droppable = BaseClass.getDriver().findElement(By.id("droppable"));	
			action.dragAndDrop(draggable, droppable).build().perform();
	
	
	
	
	
	
	
	
	
	
	
	}

}
