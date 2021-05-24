package AutoIT_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class WindowBasedPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		String expectedText = driver.findElement(By.xpath("//div[@class='example']/h3/following::p")).getText();
		System.out.println(expectedText);

		String actualText = "Congratulations! You must have the proper credentials.";

		Assert.assertEquals(expectedText, actualText);

	}
}
