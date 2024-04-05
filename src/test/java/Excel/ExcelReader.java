package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) {
		// get file location
		String filePath = "/Users/techcircle/git/workspace-cohort17/OurFirstTestNGFramework/src/test/resources/excelFiles/Book1.xlsx";

//		readExcel(filePath, "Sheet1");
//		readExcelRow(filePath, "Sheet1", 0);
//		System.out.println();
//		readExcelRow(filePath, "Sheet1", 1);
//		System.out.println();
//		readExcelRow(filePath, "Sheet1", 2);
		
		printExcelData(filePath);
	}

	public static void printExcelData(String filePath) {
		Object[][] data = readExcelFile(filePath, "Sheet1");
		
		// for each row
		for (int i = 0; i < data.length; i++) {
			// for each column
			for (int j = 0; j < data.length; j++) {
				System.out.println(data[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void readExcel(String filePath, String sheetName) {
		try {
			// open a connection to a file
			FileInputStream fs = new FileInputStream(filePath);
			// open a workbook 
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			// open a spreadsheet
			XSSFSheet sheet = workbook.getSheet(sheetName);

//		Row row = sheet.getRow(2);
//		Cell cell = row.getCell(2);
//		System.out.println(cell);

			for (Row row : sheet) {
				System.out.println();
				for (Cell cell : row) {
//				System.out.println(cell.getStringCellValue());
					switch (cell.getCellType()) {
					case BOOLEAN:
						System.out.println(cell.getBooleanCellValue());
						break;
					case NUMERIC:
						System.out.println(cell.getNumericCellValue());
						break;
					case STRING:
						System.out.println(cell.getStringCellValue());
						break;
					case FORMULA:
						System.out.println(cell.getCellFormula());
						break;
					}
				}
			}

			workbook.close();
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readExcelRow(String filePath, String sheetName, int rowNumber) {
		try {
			FileInputStream fs = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(sheetName);

			if (rowNumber >= 0 && rowNumber <= sheet.getLastRowNum()) {
				Row row = sheet.getRow(rowNumber);
				if (row != null) { // Make sure the row is not null
					for (Cell cell : row) {
						// Convert column index to Excel-style column name
						String columnName = columnIndexToName(cell.getColumnIndex());
						System.out.print(columnName + ": ");
						switch (cell.getCellType()) {
						case BOOLEAN:
							System.out.println(cell.getBooleanCellValue());
							break;
						case NUMERIC:
							System.out.println(cell.getNumericCellValue());
							break;
						case STRING:
							System.out.println(cell.getStringCellValue());
							break;
						case FORMULA:
							System.out.println(cell.getCellFormula());
							break;
						default:
							System.out.println("Unknown Type");
							break;
						}
					}
				} else {
					System.out.println("Row " + rowNumber + " is empty or does not exist.");
				}
			} else {
				System.out.println("Row number " + rowNumber + " is out of the sheet's range.");
			}

			workbook.close();
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String columnIndexToName(int column) {
		StringBuilder columnName = new StringBuilder();
		while (column >= 0) {
			int remainder = column % 26;
			columnName.insert(0, (char) ('A' + remainder));
			column = (column / 26) - 1;
		}
		return columnName.toString();
	}

	public static Object[][] readExcelFile(String fileName, String sheetName) {
		Object[][] data = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook workbook = WorkbookFactory.create(fs);
			Sheet sheet = workbook.getSheet(sheetName);

			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
			int colCount = sheet.getRow(0).getLastCellNum();

			data = new Object[rowCount][colCount];
			// for each row
			for (int i = 0; i < rowCount; i++) {
				Row row = sheet.getRow(i);
				// for each column
				for (int j = 0; j < colCount; j++) {
					Cell cell = row.getCell(j);
					switch (cell.getCellType()) {
					case BOOLEAN:
//                        System.out.println(cell.getBooleanCellValue());
						data[i][j] = cell.getBooleanCellValue();
						break;
					case NUMERIC:
//                        System.out.println(cell.getNumericCellValue());
						data[i][j] = cell.getNumericCellValue();
						break;
					case STRING:
//                        System.out.println(cell.getStringCellValue());
						data[i][j] = cell.getStringCellValue();
						break;
					case FORMULA:
//                        System.out.println(cell.getCellFormula());
						data[i][j] = cell.getCellFormula();
						break;
					default:
						System.out.println("Unknown Type");
						data[i][j] = null;
						break;
					}
				}
				workbook.close();
				fs.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;
	}
}
