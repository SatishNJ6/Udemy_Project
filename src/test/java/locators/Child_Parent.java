package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Parent {
//traversing from child to Parent - we use this if parent object is dynamic
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/interview.php");

		WebElement text = driver.findElement(By.xpath("//li[@id='tablist1-tab1']/parent::ul"));

		System.out.println(text.getText());

		// text()
		WebElement selenium = driver.findElement(By.xpath("//li[text()=' Selenium ']"));
		System.out.println(selenium.getText());
	}

}
