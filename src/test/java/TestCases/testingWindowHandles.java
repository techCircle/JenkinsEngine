package TestCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import Utilities.BaseClass;
import Utilities.commonMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testingWindowHandles {

	public static void main(String[] args) {

//		WebDriver driver;
//		WebDriverManager.safaridriver().setup();
//		driver = new SafariDriver();
//		driver.get("https://the-internet.herokuapp.com/windows");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		BaseClass.getDriver();

		BaseClass.getDriver().findElement(By.xpath("//a[text() ='Click Here']")).click();

		System.out.println("The title of the page before we switch = " + BaseClass.getDriver().getTitle());

//		Set<String> ids = driver.getWindowHandles();
//		Iterator<String> it = ids.iterator();
//		String parentID = it.next();
//		String childID =  it.next();
//		
//		System.out.println(parentID);
//		System.out.println(childID);
//		driver.switchTo().window(childID);

		commonMethods.switchToChildWindow(BaseClass.getDriver().getWindowHandle());

		System.out.println("The title of the page after we switch = " + BaseClass.getDriver().getTitle());
//		
//		driver.switchTo().window(parentID);
//
//		
//		System.out.println("The title of the page after we switch back to parent window = " + driver.getTitle());

	}

}
