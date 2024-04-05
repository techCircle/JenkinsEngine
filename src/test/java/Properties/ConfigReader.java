package Properties;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class ConfigReader {

	// declare properties file
	private static Properties configFile;

	// get 1stConfigFile.properties
	
	static {
		try {
		
			// config reader function
			String filePath = "/Users/techcircle/git/workspace-cohort17/OurFirstTestNGFramework/src/test/resources/propertiesFiles/1stConfigFile.properties";
			// open a connection to a file
			FileInputStream inputStream = new FileInputStream(filePath);
			
			// initializing config file to a Properties data type
			configFile = new Properties();
		
			// load config file
			configFile.load(inputStream);
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}
	

}
