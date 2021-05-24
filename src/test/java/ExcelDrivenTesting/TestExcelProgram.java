package ExcelDrivenTesting;

import java.io.IOException;
import java.util.ArrayList;

public class TestExcelProgram {

	public static void main(String[] args) throws IOException {

		DataDrivenTesting ddt = new DataDrivenTesting();

		ArrayList<String> data = ddt.getData("AddProfile");

		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

		// selenium eg - driver.findElement(By.id("profile").ssenKeys(data.get(1)));

	}

}
