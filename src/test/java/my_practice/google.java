package my_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Jayanthi");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys(Keys.ENTER);
		// parent-child xpath

		driver.findElement(By.xpath("//div[contains(@class,'gb_Xd')]/div/div/div[2]/a")).click(); // parent-child xpath
	}

}
