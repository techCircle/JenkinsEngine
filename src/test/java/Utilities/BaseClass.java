package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Properties.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// singleton class

	private static WebDriver driver;

	
	@BeforeTest
	public static WebDriver getDriver() {

		if (driver == null) {
			switch (ConfigReader.getProperty("browser")) {

			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "safari":

				if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
					throw new WebDriverException("Your OS doesn't support Safari");
				}

				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			case "edge":

				if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
					throw new WebDriverException("Your OS doesn't support Edge");
				}

				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			}
			driver.get(ConfigReader.getProperty("automationURL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		return driver;
	}
	
	
	@AfterTest
	public static void teardDown() {
			if(driver != null) {
				driver.close();
				driver.quit();
				driver = null;
			}
	}
	
	

}
