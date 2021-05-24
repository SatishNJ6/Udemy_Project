package selenium4_newFeatures;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturePartialScreesnshot {

	// Capture WebElement Screenshot using Selenium
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys("My Name is Satish");
		File file = name.getScreenshotAs(OutputType.FILE);

		// FileUtils.copyFile(file, new File("Name_InoutField.png"));
	}

}
