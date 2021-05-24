package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child {
	// traversing from parent to child - we use this if child object is dynamic
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/interview.php");

		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.xpath("//ul[@class='responsive-tabs__list']/li"));

		for (int i = 0; i < links.size(); i++) {
			// System.out.println(links.get(i).getText());
			links.get(i).click();
		}

	}

}
