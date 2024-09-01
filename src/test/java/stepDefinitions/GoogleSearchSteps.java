package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {
		// System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver",
				"/Java_Selenium_BDD_Framework/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com");
	}

	@When("user enter text in google search field")
	public void user_enter_text_in_google_search_field() {
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("roadmap.sh");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ENTER);
	}

	@Then("Search result should be displayed")
	public void search_result_should_be_displayed() {
		driver.getPageSource().contains("Developer Roadmaps - roadmap.sh");
		driver.close();
		driver.quit();
	}

}
