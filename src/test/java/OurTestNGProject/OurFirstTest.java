package OurTestNGProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OurFirstTest {
	
	
	@Test
	public void test1() {
			System.out.println("Hello");
			
			AssertJUnit.assertEquals(false, null);
	}
	
	
	
}
