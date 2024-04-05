package TestNG_Review;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependOnMethod_Test {
	
	@Test
	public void test1() {
		System.out.println("Test 1");
		Assert.assertTrue(true);
	}
	
	@Test (dependsOnMethods = "test1")
	public void test2() {
		System.out.println("Test 2");
		Assert.assertTrue(false);
	}
	
	@Test (dependsOnMethods = "test2")
	public void test3() {
		System.out.println("Test 3");
	}

}
