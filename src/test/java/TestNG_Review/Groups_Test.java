package TestNG_Review;

import org.testng.annotations.Test;

public class Groups_Test {
	
	@Test (groups = {"Review"}, priority=-1)
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test (groups = {"Review3"}, priority=0)
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test (groups = {"Review"}, priority=1)
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test (groups = {"Review2"})
	public void test4() {
		System.out.println("Test 4");
	}
	
	@Test (groups = {"Review"})
	public void test5() {
		System.out.println("Test 5");
	}

}
