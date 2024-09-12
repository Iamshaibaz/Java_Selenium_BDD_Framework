//package stepDefinitions;
//
//import io.cucumber.java.en.*;
//import pages.LoginPage;
//import genericUtils.*;
//
//public class HeroKuAppStepDefWithBaseClass extends BaseClass {
//
//    @Given("Open the browser now")
//    public void open_the_browser_now() {
//        // No need to initialize WebDriver here; it's handled in BaseClass
//        logger.info("WebDriver is already initialized by BaseClass");
//    }
//
//    @And("Navigate to the Login Page")
//    public void navigate_to_the_login_page() {
//        logger.info("Navigating to Login Page");
//        driver.navigate().to("https://the-internet.herokuapp.com/login");
//        logger.info("Navigated to Login Page");
//    }
//
//    @When("Enter the (.*) and (.*)$")
//    public void enter_the_username_and_password(String email, String password) {
//        logger.info("Entering credentials: Email - {} and Password - {}", email, password);
//        LoginPage lpg = new LoginPage(driver);
//        lpg.enterEmail(email);
//        lpg.enterPassword(password);
//    }
//
//    @And("Hit Login Button")
//    public void hit_login_button() {
//        logger.info("Clicking the Login button");
//        LoginPage lpg = new LoginPage(driver);
//        lpg.getLoginBtn().click();
//        logger.info("Login button clicked");
//    }
//
//    @Then("User is on Home page")
//    public void user_is_on_home_page() throws InterruptedException {
//        logger.info("Verifying user is on Home page");
//        if (driver.getPageSource().contains("You logged into a secure area!")) {
//            logger.info("Successfully logged in and user is on the Home page");
//        } else {
//            logger.error("Login failed or user is not on the Home page");
//        }
//        Thread.sleep(2000);
//    }
//}
