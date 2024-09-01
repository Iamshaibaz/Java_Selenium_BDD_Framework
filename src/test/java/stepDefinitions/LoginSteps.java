package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside login step");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside username and password step");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside click login step");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Inside navigation step");
	}

}
