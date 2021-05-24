package selenium4_newFeatures;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindows_Tabs {

	// Scenario: 1) Navigate to https://rahulshettyacademy.com/angularpractice/
	// 2) fill the "Name" field with the first course name available at
	// https://rahulshettyacademy.com/
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> allWindows = driver.getWindowHandles();

		Iterator<String> it = allWindows.iterator();

		String parentWindowd = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		driver.navigate().to("https://rahulshettyacademy.com/");

		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))

				.get(1).getText();
		System.out.println(courseName);

		driver.switchTo().window(parentWindowd);

		driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);

	}

}
