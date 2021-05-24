package E2E_seleniumActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_MultiSelect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement Dropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));

		Select s = new Select(Dropdown);
		s.selectByIndex(0);
		s.selectByValue("AED");
		s.selectByVisibleText("USD");

		Thread.sleep(3000);

		// returns all the values from dropdown
		List<WebElement> dropdownOptions = s.getOptions();

		for (int i = 0; i < dropdownOptions.size(); i++) {

			System.out.println("All dropdownOptions are =" + dropdownOptions.get(i).getText());

		}
		Thread.sleep(3000);
		// returns first selected element from dropdown
		System.out.println("First Selected Option are =" + s.getFirstSelectedOption().getText());
		s.deselectByIndex(0); // deselect works only for multiselect dropdowns, so script is failing here
		Thread.sleep(3000);
		// returns all the selected values from dropdown
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : selectedOptions) {

			System.out.println("Selected Options are =" + webElement.getText());

		}

	}

}

/*
 * List<String> expectedValues = Arrays.asList(options);
 * System.out.println("Expected values are:" + expectedValues);
 * 
 * 
 * String[] actual = { "Select", "INR", "AED", "USD" };
 * 
 * List<String> actualValues = Arrays.asList(actual);
 * System.out.println("Actual values are:" + actualValues);
 * 
 * Assert.assertEquals(currencies.get(i).getText(), actualValues);
 */