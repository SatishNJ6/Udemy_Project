package E2E_seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class E2E_Actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://spicejet.com"); // URL in the browser

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

			System.out.println("its disabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

		WebElement Adult = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));

		Select adult = new Select(Adult);
		adult.selectByValue("2");

		Thread.sleep(2000L);

		/*
		 * WebElement Child = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		 * Select child = new Select(Child); child.selectByIndex(1);
		 */

		WebElement Infant = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		Select infant = new Select(Infant);
		infant.selectByVisibleText("1");

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "2 Adult, 1 Infant");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		WebElement currencyDD = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select s = new Select(currencyDD);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByValue("INR");

		driver.findElement(By.cssSelector("input[value='Search']")).click();

	}

}
