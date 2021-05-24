package E2E_seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class StaticDropdown {
//how to find static dropdowns - static dropdowns has tagname as 'Select' in HTML DOM
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();

		WebElement currencyDD = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select s = new Select(currencyDD);
		s.selectByIndex(1);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByValue("INR");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByVisibleText("USD");
		System.out.println(s.getFirstSelectedOption().getText());

		WebElement passengers = driver.findElement(By.id("divpaxinfo"));
		passengers.click();

		Thread.sleep(2000L);

		/*
		 * int i=1;
		 * 
		 * while(i<5)
		 * 
		 * {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click();//4 times
		 * 
		 * i++;
		 * 
		 * }
		 */

		System.out.println(passengers.getText());

		for (int i = 1; i < 5; i++)

		{

			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(passengers.getText(), "5 Adult");

		System.out.println(passengers.getText());
	}
}
