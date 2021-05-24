package TestNG_Framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalEnvVarsDrive {

	public static void main(String[] args) throws IOException {
//Properties class in java helps to scan & retrieves values from any .properties files
		Properties prop = new Properties();
		// this line is to read the properties file path
		FileInputStream fis = new FileInputStream(
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\src\\test\\java\\TestNG_Framework\\GlobalVariables.properties");
		prop.load(fis);// with Properties object loading file path object, load method will load the
						// file in reading mode
		String browserType = prop.getProperty("browser"); // here browser is a String
		System.out.println(browserType);
		String url = prop.getProperty("url");
		System.out.println(url);

		prop.setProperty("browser", "firefox");// writing data to file, it will print in console, but it wont change in
												// properties file as we need to create class for writing like below
		System.out.println(prop.getProperty("browser"));

		FileOutputStream fos = new FileOutputStream(
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\src\\test\\java\\TestNG_Framework\\GlobalVariables.properties");

		prop.store(fos, null); // store method will use the file to write mode
	}

}
