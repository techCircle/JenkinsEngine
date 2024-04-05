package introToTestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTestWithDataProvider {

	@DataProvider(name = "Salalala")
	public Object[][] createAdditionTestData() {
		return new Object[][] { 
			{ 2, 3, 5, "Dave" }, 
			{ 4, 5, 9, "Paola" }, 
			{ 6, 7, 13, "Sabat" } };
	}

	@DataProvider(name = "Yolo")
	public String[][] thisISAnotherDataProvider() {
		return new String[][] { 
			{ "Dave" }, 
			{ "Paola" }, 
			{ "Sabat" } };
	}

	@DataProvider(name = "PrimeTestSets")
	public Object[][] primeNumbers() {
		return new Object[][] { 
			{ 2, true }, 
			{ 6, false }, 
			{ 19, true }, 
			{ 22, false }, 
			{ 23, true }, };
	}

	@Test(dataProvider = "PrimeTestSets")
	public void testPrimeChecker(Integer inputNumber, Boolean expectedResult) {
		System.out.println(inputNumber + " " + expectedResult);
		AssertJUnit.assertEquals(PrimeNumberChecker(inputNumber), expectedResult);
	}

	@Test(dataProvider = "Salalala")
	public void testAddition(int a, int b, int expctedResult, String name) {
		int result = a + b;
		AssertJUnit.assertEquals(result, expctedResult);

		System.out.println("My name is " + name);

	}

	public Boolean PrimeNumberChecker(final Integer primeNumber) {
		for (int i = 2; i < (primeNumber / 2); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}

}
