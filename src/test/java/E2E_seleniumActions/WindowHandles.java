package E2E_seleniumActions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());

		Iterator<String> it = windows.iterator();

		String parentWindow = it.next();

		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		String childWindowOriginalText = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();

		System.out.println(childWindowOriginalText);

		String emailID = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim()
				.split(" ")[0];
		System.out.println(emailID);

		driver.switchTo().window(parentWindow);

		driver.findElement(By.cssSelector("#username")).sendKeys(emailID);
	}

}
