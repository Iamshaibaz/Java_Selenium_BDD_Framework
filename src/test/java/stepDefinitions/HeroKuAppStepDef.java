//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//import pages.LoginPage;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//public class HeroKuAppStepDef {
//
//	WebDriver driver = null;
//
//	@Given("Open the browser now")
//	public void open_the_browser_now() {
//		System.getProperty("webdriver.chrome.driver",
//				"/Java_Selenium_BDD_Framework/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@And("Navigate to the Login Page")
//	public void navigate_to_the_login_page() {
//
//		driver.navigate().to("https://the-internet.herokuapp.com/login");
//
//	}
//
//	@When("Enter the (.*) and (.*)$")
//	public void enter_the_username_and_password(String email, String password) {
//		LoginPage lpg = new LoginPage(driver);
//		lpg.enterEmail(email);
//		lpg.enterPassword(password);
//
//	}
//
//	@And("Hit Login Button")
//	public void hit_login_button() {
//		LoginPage lpg = new LoginPage(driver);
//		lpg.getLoginBtn().click();
//		;
//	}
//
//	@Then("User is on Home page")
//	public void user_is_on_home_page() throws InterruptedException {
//		driver.getPageSource().contains("You logged into a secure area!");
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//	}
//
//}
