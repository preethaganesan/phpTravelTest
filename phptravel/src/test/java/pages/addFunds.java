package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addFunds {
	public WebDriver driver = driverInit.getInstance().getDriver();
	private utilPhp objPhp = new utilPhp();
	

	public addFunds() {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(@href,'add_funds')]")
	WebElement LK_addFunds;
	
	@FindBy(id="gateway_paypal")
	WebElement RD_paypal;
	
	@FindBy(xpath="//button[contains(text(),'Pay Now')]")
	WebElement BT_payNow;
	
	@FindBy(id="paypal-button")
	WebElement BT_payPal;
	
	@FindBy(id="email")
	WebElement ED_email;
	
	@FindBy(id="btnNext")
	WebElement ED_next;	
	
	@FindBy(id="password")
	WebElement ED_password;
	
	@FindBy(id="btnLogin")
	WebElement BT_login;
	
	//@FindBy(id="payment-submit-btn")
	@FindBy(xpath="//button[@id='payment-submit-btn']")
	WebElement BT_payNowFinal;
	
	@FindBy(xpath="//p[contains(.,'Payment successfull')]")
	WebElement BT_paymentSucess;	
	
	
	public void navigateAddFunds() throws Exception {		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", LK_addFunds);
		System.out.println("Click Add funds");
	
	}

	

}
