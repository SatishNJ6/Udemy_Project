package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class CssSelector {
//cssSelector is 10 times faster than xpath, it will be helpfull to find obj for class under class

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=eu");

		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Nihit");

		driver.findElement(By.cssSelector(".password")).sendKeys("Reddy");

		driver.findElement(By.cssSelector("[id='Login']")).click();
		// System.out.println(text.getText());

		String actualText = driver.findElement(By.cssSelector("div.loginError")).getText();
		System.out.println(actualText);

		String expectedText = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

		Assert.assertEquals(expectedText, actualText);
	}

}
