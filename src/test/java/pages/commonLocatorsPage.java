package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class commonLocatorsPage {
	

			
	
		public commonLocatorsPage() {
			PageFactory.initElements(BaseClass.getDriver(), this);
		}
		
	
		@FindBy(xpath= "//*[@class='oxd-userdropdown-name']")
		public WebElement userDropDownIcon;
		
		
		@FindBy(xpath="//*[@class='oxd-dropdown-menu']/li")
		public List<WebElement> userDropdownMenuOptions; 
		
		
		public void userDropDownMenu(String menuOption) {
			userDropDownIcon.click();
			for(WebElement eachMenuButton : userDropdownMenuOptions ) {
				if(eachMenuButton.getText().contains(menuOption)) {
					eachMenuButton.click();
					break;
				}
			}
		}
		
		
		
		
		
		
		

}
