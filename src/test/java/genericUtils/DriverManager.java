package genericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DriverManager {

	private static final Logger logger = LogManager.getLogger(DriverManager.class);
	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			logger.info("Initializing the ChromeDriver");
			System.getProperty("webdriver.chrome.driver",
					"/Java_Selenium_BDD_Framework/src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			logger.info("Browser launched and maximized");
		}
		return driver;
	}

	public static void quitDriver() {
		logger.info("Closing and quitting the browser");
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
		logger.info("Browser closed and quit");
	}
}
