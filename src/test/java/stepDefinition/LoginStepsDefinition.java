package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginStepsDefinition {

	String browser = "Firefox";
	WebDriver driver;
	LoginPage lp = new LoginPage();
	
	@Given("^user is alredy on Login Page$")
	public void user_is_alredy_on_Login_Page() throws Throwable {
		System.out.println("Step 1 : User is alredy on Login Page");
		lp.openBrowser();
		lp.openLoginPage();
	}

	@When("^title of Login Page is \"([^\"]*)\"$")
	public void title_of_Login_Page_is(String title) throws Throwable {
		System.out.println("Step 2 : Title of Login Page is Best Buy");
		String expectedTitle = title;
		String actualTitle = lp.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String password) throws Throwable {
		System.out.println("Step 3 : User enters email id and Password");
		lp.enterEmailandPasswword(email, password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		System.out.println("Step 4 : User clicks on login button");
		lp.clickOnLoginPage();
	}

	@Then("^user get error message$")
	public void user_get_error_message() throws Throwable {
		System.out.println("Step 5 : User get error message");
		String expectedErr = "Please enter an email address.";
		String actualErr = lp.readError();
		Assert.assertEquals(expectedErr, actualErr);
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
		System.out.println("Step 6 : User quit");
		   lp.closeBrowser();
	}
	
}
