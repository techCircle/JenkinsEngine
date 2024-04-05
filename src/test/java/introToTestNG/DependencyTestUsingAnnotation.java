package introToTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {

	@Test(dependsOnMethods = "myMomma", groups = "smokeTest")
	public void testMessage() {
		System.out.println("Hello Faaaaazzzzzz");
	}

	@Test(groups = { "smokeTest", "RegressionTest" })
	public void myMomma() {
		System.out.println("What did you say SAAABAAAAT!!!!!!");
	}

	@Test(dependsOnGroups = "smokeTest", groups = { "RegressionTest" })
	public void myMomma2() {
		System.out.println("What did you say SAAABAAAAT!!!!!!");
	}

}
