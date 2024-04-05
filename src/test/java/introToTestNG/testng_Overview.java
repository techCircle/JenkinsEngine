package introToTestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testng_Overview {
	

	@Test(enabled=true)
	public void testMethod() {
		System.out.println("This is a test Method");
	}
	
	
	@Test(groups="smokeTest")
	public void testMethod2() {
		AssertJUnit.assertEquals(false, true);
		AssertJUnit.assertEquals(false, null);
		AssertJUnit.assertTrue(false);
		AssertJUnit.assertFalse(false);

	}
	
	
	
	
	

}
