package E2E_seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popups {

	public static void main(String[] args) {
		String name = "Satish";

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.cssSelector("[placeholder='Enter Your Name']")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();

		String alertMsg = driver.switchTo().alert().getText();
		System.out.println(alertMsg);

		// System.out.println(alertMsg.split("Hello")[1].trim().split("Satish"));

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		String confirmMsg = driver.switchTo().alert().getText();
		System.out.println(confirmMsg);

		driver.switchTo().alert().dismiss();
	}

}
