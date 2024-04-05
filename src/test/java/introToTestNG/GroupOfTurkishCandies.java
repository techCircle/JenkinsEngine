package introToTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupOfTurkishCandies {
	
	
	@Test(groups="smokeTest")
	public void testPrintMessage() {
		System.out.println("Smoke test cases 1");
	}
	
	@Test
	public void testPrintMessage2() {
		System.out.println("Smoke test cases 2");
	}
	
	@Test
	public void testPrintMessage3() {
		System.out.println("Smoke test cases 3");
	}
	
	
	
	
	
	
	
	
	

}
