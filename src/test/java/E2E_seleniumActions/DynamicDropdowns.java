package E2E_seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropdowns {

	// Dynamic dropdowns are loaded based on user actions. it will be keep on
	// changing - eg: From & To dates in spicejet site for flight booking - To
	// dropdown appears on only selection of From dd, DD's doesnt have select
	// tagname
	// dd's are handled with indexes

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Udemy_Training\\Udemy_Classes\\Udemy_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// //a[@value='MAA'] - Xpath for chennai

		// //a[@value='BLR'] - Xpath for bangalore

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@value='BOM'])[2]")));

		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); - this is not
		// recomended sometimes

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click(); // parent-child relation - recomended

	}
}
