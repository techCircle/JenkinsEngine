package TestNG_Review;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzer_Test {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}
	
}
