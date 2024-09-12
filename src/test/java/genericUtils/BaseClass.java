package genericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {

    protected WebDriver driver;
    protected static final Logger logger = LogManager.getLogger(BaseClass.class);

    @Before
    public void setUp() {
        logger.info("Initializing the ChromeDriver");
        System.getProperty("webdriver.chrome.driver", 
                "/Java_Selenium_BDD_Framework/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        logger.info("Browser launched and maximized");
    }

    @After
    public void tearDown() {
        logger.info("Closing and quitting the browser");
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        logger.info("Browser closed and quit");
    }
}
