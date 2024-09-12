package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.LoginPage;
import genericUtils.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HeroKuAppStepDefWithBaseClass {

    private static final Logger logger = LogManager.getLogger(HeroKuAppStepDefWithBaseClass.class);
    private LoginPage loginPage;

    @Before
    public void setUp() {
        logger.info("Setting up the test environment");
        DriverManager.getDriver();
        loginPage = new LoginPage(DriverManager.getDriver());
    }

    @After
    public void tearDown() {
        logger.info("Tearing down the test environment");
        DriverManager.quitDriver();
    }

    @Given("Open the browser now")
    public void open_the_browser_now() {
        logger.info("WebDriver is initialized");
    }

    @And("Navigate to the Login Page")
    public void navigate_to_the_login_page() {
        logger.info("Navigating to Login Page");
        DriverManager.getDriver().navigate().to("https://the-internet.herokuapp.com/login");
        logger.info("Navigated to Login Page");
    }

    @When("Enter the (.*) and (.*)$")
    public void enter_the_username_and_password(String email, String password) {
        logger.info("Entering credentials: Email - {} and Password - {}", email, password);
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @And("Hit Login Button")
    public void hit_login_button() {
        logger.info("Clicking the Login button");
        loginPage.getLoginBtn().click();
        logger.info("Login button clicked");
    }

    @Then("User is on Home page")
    public void user_is_on_home_page() throws InterruptedException {
        logger.info("Verifying user is on Home page");
        if (DriverManager.getDriver().getPageSource().contains("You logged into a secure area!")) {
            logger.info("Successfully logged in and user is on the Home page");
        } else {
            logger.error("Login failed or user is not on the Home page");
        }
        Thread.sleep(2000);
    }
}
