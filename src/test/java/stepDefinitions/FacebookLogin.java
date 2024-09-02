package stepDefinitions;

import io.cucumber.java.en.*;

public class FacebookLogin {
	
	@Given("browser is open")
	public void browser_is_open() {
	   System.out.println("Browser opening");
	}

	@And("Facebook page should be open")
	public void facebook_page_should_be_open() {
		 System.out.println("Browser opened");
		 }

	@When("Enter email and password")
	public void enter_email_and_password() {
		 System.out.println("Entering credentials");
	}

	@And("Hit login")
	public void hit_login() {
		 System.out.println("Click");
	}

	@Then("Validate facebook home page")
	public void validate_facebook_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
