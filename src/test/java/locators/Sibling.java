package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling {

	// if the parent and second child(sibling of first child-static) is dynamic,
	// then we use following-sibling concept to get the second li
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/interview.php");

		List<WebElement> links = driver.findElements(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li"));
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());

		}
	}

}
