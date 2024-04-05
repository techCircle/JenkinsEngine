package TestNG_Review;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	@Parameters("browser")
	public void browserTest(String value) {
		System.out.println(value + " browser has been opened");
	}
	
	@Test
	@Parameters("carModel")
	public void carTest(String value) {
		System.out.println("I'm driving on " + value);
	}

}
