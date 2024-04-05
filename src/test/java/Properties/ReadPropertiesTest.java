package Properties;

public class ReadPropertiesTest {
	
	public static void main(String[] args) {
		System.out.println("Browser :: " + ConfigReader.getProperty("browser"));
		System.out.println("URL :: " + ConfigReader.getProperty("url"));
		System.out.println("Username :: " + ConfigReader.getProperty("userName"));
		System.out.println("Password :: " + ConfigReader.getProperty("password"));
	}

}
