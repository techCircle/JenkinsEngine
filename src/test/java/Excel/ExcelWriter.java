package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) {

		// get file location
		String filePath = "/Users/techcircle/git/workspace-cohort17/OurFirstTestNGFramework/src/test/resources/excelFiles/Cohort17.xlsx";

//		Object[][] data2 = { { "F_Name", "L_Name", "Phone", "Email", "Age", "is Employed" } };
//		writeMethod(filePath, "Students", data2);

		Object[][] data1 = { { "F_Name", "L_Name", "Phone", "Email", "Age", "is Employed" },
				{ "Roman", "Panas", "1234567890", "fonaryk@oz.com", 32, true },
				{ "Sabat", "Mahmoud", "3216549870", "sabat@techcirclesolutions.org", 30, true },
				{ "Dave", "Macfarlane", "5648971230", "dave@techcirclesolutions.org", 33, true },
				{ "Hendri", "Sumiyono", "4897561823", "Hendri@techcirclesolutions.org", 33, true } };
		writeExcelFile(filePath, "Students", data1);

	}

	// TODO add logic to write data into specific rowNumber
	public static void writeMethod(String filePath, String sheetName, Object[][] data) {
		try {
			// open connection to the file
			FileInputStream fs = new FileInputStream(filePath);

			// gets a workbook open
			XSSFWorkbook workbook = new XSSFWorkbook(fs);

			// get spreadsheet open
			XSSFSheet sheet = workbook.getSheet(sheetName);

			// for each row in a sheet
			for (int i = 0; i < data.length; i++) {
				Row row = sheet.createRow(i);
				// for each column/cell in a sheet
				for (int j = 0; j < data[i].length; j++) {
					Cell cell = row.createCell(j);
					if (data[i][j] instanceof String) {
						cell.setCellValue((String) data[i][j]);
					} else if (data[i][j] instanceof Integer) {
						cell.setCellValue((Integer) data[i][j]);
					} else if (data[i][j] instanceof Double) {
						cell.setCellValue((Double) data[i][j]);
					} else if (data[i][j] instanceof Boolean) {
						cell.setCellValue((Boolean) data[i][j]);
					} else {
						cell.setCellValue((String) null);
					}
				}
			}
			FileOutputStream fos = new FileOutputStream(filePath);
			workbook.write(fos);
			workbook.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	public static void writeExcelFile(String fileName, String sheetName, Object[][] data) {

		try {
			Workbook workbook = WorkbookFactory.create(true);
			Sheet sheet = workbook.createSheet(sheetName);

			// for each row in a sheet
			for (int i = 0; i < data.length; i++) {
				Row row = sheet.createRow(i);
				// for each column/cell in a sheet
				for (int j = 0; j < data[i].length; j++) {
					Cell cell = row.createCell(j);
					if (data[i][j] instanceof String) {
						cell.setCellValue((String) data[i][j]);
					} else if (data[i][j] instanceof Integer) {
						cell.setCellValue((Integer) data[i][j]);
					} else if (data[i][j] instanceof Double) {
						cell.setCellValue((Double) data[i][j]);
					} else if (data[i][j] instanceof Boolean) {
						cell.setCellValue((Boolean) data[i][j]);
					} else {
						cell.setCellValue((String) null);
					}
				}
			}
			FileOutputStream fos = new FileOutputStream(fileName);
			workbook.write(fos);
			workbook.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeExcelFile(String fileName, String sheetName) {
		Object[][] data = null;
		try {
			Workbook workbook = new XSSFWorkbook();
			FileOutputStream fos = new FileOutputStream(fileName);
			Sheet sheet = workbook.createSheet(sheetName);

			// for each row in a sheet
			for (int i = 0; i < data.length; i++) {
				Row row = sheet.createRow(i);
				// for each column/cell in a sheet
				for (int j = 0; j < data[i].length; j++) {
					Cell cell = row.createCell(j);
					if (data[i][j] instanceof String) {
						cell.setCellValue((String) data[i][j]);
					} else if (data[i][j] instanceof Integer) {
						cell.setCellValue((Integer) data[i][j]);
					} else if (data[i][j] instanceof Double) {
						cell.setCellValue((Double) data[i][j]);
					} else if (data[i][j] instanceof Boolean) {
						cell.setCellValue((Boolean) data[i][j]);
					} else {
						cell.setCellValue((String) null);
					}
				}
			}
			workbook.write(fos);
			workbook.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
