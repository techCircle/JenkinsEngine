package TestNG_Review;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Test {
	
	@Test
	public void testCase1() {
		System.out.println("1st test case");
	}
	
	@Test
	public void testCase2() {
		System.out.println("2nd test case");
	}
	
	@Test
	public void testCase3() {
		System.out.println("3rd test case");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Will be executed before every method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Will be executed after every method");
	}
	
	@BeforeClass
	 public void beforeClass() {
	   System.out.println("This will execute before the Class");
	 }
	 
	 @AfterClass
	 public void afterClass() {
	   System.out.println("This will execute after the Class");
	 }
	 
	 @BeforeTest
	 public void beforeTest() {
	   System.out.println("This will execute before the Test");
	 }
	 
	 @AfterTest
	 public void afterTest() {
	   System.out.println("This will execute after the Test");
	 }
	 
	 @BeforeSuite
	 public void beforeSuite() {
	   System.out.println("This will execute before the Test Suite");
	 }
	 
	 @AfterSuite
	 public void afterSuite() {
	   System.out.println("This will execute after the Test Suite");
	 }

}
