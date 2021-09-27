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
		objaddFunds.navigateAddFunds();
	}



	
	

}
