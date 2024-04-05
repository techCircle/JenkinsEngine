package TestNG_Review;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependOnGroups_Test {
	
	@Test (groups = "smokeTest")
	public void test1() {
		System.out.println("test 1");
	}
	
	@Test (dependsOnGroups = "Review")
	public void test2() {
		System.out.println("test 2");
	}
	
	@Test (groups = "Review")
	public void test3() {
		System.out.println("test 3");
		Assert.assertTrue(false);
	}

}
