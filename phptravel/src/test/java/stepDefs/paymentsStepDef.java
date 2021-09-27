package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.addFunds;
import pages.payments;

public class paymentsStepDef {
	
	private payments objpayments = new payments();
	
	@And("User chooses the Payment Method {string}")
	public void selectPaymentMethod(String PaymentMethod) throws Exception {
		objpayments.selectPaymentMethod(PaymentMethod);
	}
	
	@Then("User completes the payment using {string} sucessfully")
	public void completePayment(String PaymentMethod) throws Exception {
		objpayments.completePayment(PaymentMethod);
	}
	



}
