package TestNG_Review;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Excel.ExcelWriter;

public class dataProvider_Test {

//	ExcelWriter excelWriter = new ExcelWriter();

//	@DataProvider(name = "names")
//	public Object[][] dpMethod() {
//		return new Object[][] { { "Hendri" }, { "Izitilla" }, { "Nadia" }, { "Faz" } };
//	}
//
//	@Test(dataProvider = "names")
//	public void myTest(Object value) {
//		System.out.println("The parameter being cast to :: " + value);
//	}
//
//	@DataProvider(name = "person")
//	public Object[][] personData() {
//		return new Object[][] { { "Roman" }, { "Panas" }, { "1234567890" }, { "fonaryk@oz.com" }, { 32 }, { true } };
//	}
//
//	@Test(dataProvider = "person")
//	public void personTest(Object value) {
//		System.out.println("The parameter being cast to :: " + value);
//	}

	@DataProvider
	public Object[][] students() {
		return new Object[][] { { "F_Name", "L_Name", "Phone", "Email", "Age", "is Employed" },
				{ "Roman", "Panas", "1234567890", "fonaryk@oz.com", 32, true },
				{ "Sabat", "Mahmoud", "3216549870", "sabat@techcirclesolutions.org", 30, true },
				{ "Dave", "Macfarlane", "5648971230", "dave@techcirclesolutions.org", 33, true },
				{ "Hendri", "Sumiyono", "4897561823", "Hendri@techcirclesolutions.org", 33, true } };
	}

	@Test(dataProvider = "students")
	public void createStudentsSpreadsheet(Object[][] students) {
		// get file location
		String filePath = "/Users/techcircle/git/workspace-cohort17/OurFirstTestNGFramework/src/test/resources/excelFiles/Students.xlsx";
		ExcelWriter.writeExcelFile(filePath, "students");
	}

}
