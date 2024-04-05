package TestNG_Review;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListenersTestNG.class)
public class Listeners_Test {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/testng/testng-listeners/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void test1() {
		String expectedTitle = "TestNG Listeners In Selenium Webdriver For Automated Testing";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle, "Titles mismatch");
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2() {
		String expectedTitle = "TechCircle School";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle, "Titles mismatch");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		Reporter.log("Driver closed after testing");
	}

}
