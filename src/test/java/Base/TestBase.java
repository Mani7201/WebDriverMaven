package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utilities.ExcelReader;
import Utilities.ExtentManager;

public class TestBase {

	/*
	 * WebDrivers : Properties : Logs - Log4j jar , .log, log4j.properties
	 * ExtendedReports DB Excel Mail ReportNG, ExtentReports Jenkins
	 */
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\Vendor_Screen_test_Data.xlsx");
	public static ExcelReader dentalexcel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\Dental_LOC_Test_Data.xlsx");
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	
	@BeforeSuite
	public void setUp() {

		if (driver == null) {

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (config.getProperty("browser").equals("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (config.getProperty("browser").equals("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
			}

			driver.get(config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
			// TimeUnit.SECONDS);
			wait=new WebDriverWait(driver, 5);

		}

	}

	// is element present method
	public boolean isElementPresent(By by) {
		try {

			driver.findElement(by);
			return true;

		} catch (NoSuchElementException e) {
			return false;
		}

	}

	// type method

	public void type(String locator, String value) {

		driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
		test.log(LogStatus.INFO, "Typing in : " + locator + " entered value as : " + value);

	}

	// click method

	public void click(String locator) {

		driver.findElement(By.xpath(OR.getProperty(locator))).click();
		test.log(LogStatus.INFO, "Clicking on : " + locator);

	}

	// Javascript Click

	
	// verify true method
	public void verifyTrue(String locator) {

		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty(locator))), "Element Not Found");
		
	}

	// verify false method
	public void verifyFalse(String locator) {

		Assert.assertFalse(isElementPresent(By.xpath(OR.getProperty(locator))));

	}

	// wait Until

	public void waitUntil(String locator) {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(OR.getProperty(locator))));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty(locator))));
	}

	// select dropdown values method

	static WebElement dropdown;

	public void select(String locator, String value) {
		dropdown = driver.findElement(By.xpath(OR.getProperty(locator)));
		Select select = new Select(dropdown);
		select.selectByVisibleText(value);
		test.log(LogStatus.INFO, "Selected value from : " + locator + " is :  " + value);

	}

	// select multi choice dropdown value
	public void selectcheckbox(String locator, String value) {
		dropdown = driver.findElement(By.xpath(OR.getProperty(locator)));
		Select select = new Select(dropdown);
		select.selectByValue(value);
		test.log(LogStatus.INFO, "Selected value from : " + locator + " is :  " + value);

	}
	// Reset the fields method

	public void reset(String locator) {

		driver.findElement(By.xpath(OR.getProperty(locator))).clear();

	}

	@AfterSuite
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();

	}

}
