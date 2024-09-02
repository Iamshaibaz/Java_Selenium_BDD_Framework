package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement emailTxt;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTxt;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void enterEmail(String email) {

		emailTxt.sendKeys(email);

	}

	public void enterPassword(String password) {

		passwordTxt.sendKeys(password);

	}

}
