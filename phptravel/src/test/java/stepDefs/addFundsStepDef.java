package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.addFunds;


public class addFundsStepDef{
	public WebDriver driver;
	private addFunds objaddFunds = new addFunds();
	
	
	@And("User navigates to Add Funds")
	public void navigateAddFunds() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		objaddFunds.navigateAddFunds();
	}


	@And("User chooses the Payment Method {string}")
	public void selectPaymentMethod(String PaymentMethod) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		objaddFunds.selectPaymentMethod(PaymentMethod);
	}
	
	@Then("User completes the payment using {string} sucessfully")
	public void completePayment(String PaymentMethod) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		objaddFunds.completePayment(PaymentMethod);
	}
	
	

}
