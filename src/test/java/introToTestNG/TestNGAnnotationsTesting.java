package introToTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsTesting {
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This comes after each Suite");
	}
	
	@Test
	public void testMethod() {
		System.out.println("This is coming from TestMethod");
	}
	
	@Test(groups="smokeTest")
	public void testMethod2() {
		System.out.println("This is coming from TestMethod2");
	}
	
	
	@BeforeMethod
	public void beforeEachMethod() {
		System.out.println("This comes once every method");

	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This comes before class");

	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This comes before test");

	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This comes before suite");

	}
	
	//task
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This comes after each method");

	}	
	
	@AfterClass
	public void afterClass() {
		System.out.println("This comes after each class");
	}
	
	
	
	
	
	

}
