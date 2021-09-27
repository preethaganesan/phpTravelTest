package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.addFunds;
import pages.login;

public class loginStepDef {
	

	private login objlogin = new login();
	
	@Given("that the user is able to open PHP web page")
	public void launchBrowser() throws Exception {
		objlogin.launchBrowser();
	}
	
	@Given("User is able to login to php")
	public void user_is_able_to_login_to_php() throws Exception {
		objlogin.logintoPhp();
	}
	
	@Then("Verify User is able to see the welcome page")
	public void verifyWelcome() throws Exception {
		objlogin.verifyWelcome();

	}
	
	@And("User logs out of php")
	public void logout() throws Exception {
		objlogin.logout();

	}
	

}
