package ExcelDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {

	// 1. first create class for XSSFWorkBook to access the sheet(sheet is
	// collection of rows), this class accepts Fileinputstream obj arguments

	// steps:
	// 1.Identify test cases column by scanning the 1st row
	// 2.once column is identified then scan entire testcase column to identify
	// purchase testcase row
	// 3.after you grab purchase testcase row - pull all the data of that row and
	// feed into test

	public ArrayList<String> getData(String testCaseName) throws IOException {

		ArrayList<String> list = new ArrayList<String>();

		FileInputStream fis = new FileInputStream( // created object for FileInputStream class to get the excel path

				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\src\\test\\java\\testData\\ExcelTest.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);// created object for XSSFWorkbook class and passed file location
														// obj as an argement

		int totalSheets = workbook.getNumberOfSheets();// total sheets in excel
		System.out.println(totalSheets);
		System.out.println(workbook.getSheetName(0));// getting first sheet from excel based on its index

		for (int i = 0; i < totalSheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("TestData")) {// getting sheet from excel

				XSSFSheet sheet = workbook.getSheetAt(i);

				// 1.Identify test cases column by scanning the 1st row

				Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();// row is collection of cells
				int k = 0;
				int coloumn = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();

					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						coloumn = k;

					}

					k++;
				}
				System.out.println(coloumn);

				// 2.once column is identified then scan entire testcase column to identify
				// purchase testcase row

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();
							if (c.getCellTypeEnum() == CellType.STRING) {
								list.add(c.getStringCellValue());// to fetch string value
							} else {
								list.add(NumberToTextConverter.toText(c.getNumericCellValue()));// to convert int to
																								// string value
							}
						}
					}
				}
			}

		}
		return list;
	}

}
