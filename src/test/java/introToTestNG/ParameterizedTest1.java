package introToTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {
	
	
		@Test(groups="smokeTest")
		@Parameters("WhateverName")
		public void parameterTest(String myName) {
				System.out.println("Parameterized value is : " + myName);
		}


}
