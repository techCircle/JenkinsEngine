package introToTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParallel {

	WebDriver driver;

	@Test
	public void method1() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(); // instantiating
		driver.get("https://www.techcircleschool.com/");
	}

	@Test
	public void method2() {

		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver(); // instantiating
		driver.get("https://www.techcircleschool.com/");
	}
	
	@Test
	public void method3() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // instantiating
		driver.get("https://www.techcircleschool.com/");
	}

}
