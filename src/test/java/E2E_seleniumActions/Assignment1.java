package E2E_seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.cleartrip.com/");
		WebElement adults = driver.findElement(By.id("Adults"));

		Select selectAdult = new Select(adults);
		selectAdult.selectByVisibleText("2");

		WebElement childs = driver.findElement(By.id("Childrens"));

		Select selectChild = new Select(childs);
		selectChild.selectByValue("1");

		WebElement infants = driver.findElement(By.id("Childrens"));

		Select selectinfant = new Select(infants);
		selectinfant.selectByIndex(1);

		driver.findElement(By.cssSelector(".depart_date.keyValue")).click();
		driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over")).click();

		driver.findElement(By.cssSelector("a#MoreOptionsLink")).click();

		driver.findElement(By.cssSelector("input#AirlineAutocomplete")).sendKeys("indigo");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='IndiGo (6E)']")).click();
		driver.findElement(By.id("SearchBtn")).click();
		String expectedErrorMsg = driver.findElement(By.cssSelector("div#homeErrorMessage")).getText();
		System.out.println(expectedErrorMsg);
		String actualErrorMsg = "Sorry, but we can't continue until you fix everything that's marked in RED";
		Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
	}

}
