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

public class payments {
	public WebDriver driver = driverInit.getInstance().getDriver();
	private utilPhp objPhp = new utilPhp();
	
	
	public payments() {
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
	
	

	
	public void selectPaymentMethod(String PaymentMethod) throws Exception {	
		
		switch(PaymentMethod){	
			case "PayPal":
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", RD_paypal);			
			break;
		}
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", BT_payNow);	
	}
	
	
	public void completePayment(String PaymentMethod) throws Exception {
		
		switch(PaymentMethod){	
		case "PayPal":
			BT_payPal.click();
		break;

	}
		String semail = objPhp.getelement("Email");
		String spassword = objPhp.getelement("Password");
		
        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.id("headerText"));
                System.out.println("Heading of child window is " + text.getText());
            }
        }
        
        ED_email.sendKeys(semail);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ED_next);	
		
		ED_password.sendKeys(spassword);
        

		js.executeScript("arguments[0].click();", BT_login);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(BT_payNowFinal)); 
		

		 js.executeScript("arguments[0].scrollIntoView(true);", BT_payNowFinal);
		 
		 js.executeScript("return document.readyState").toString().equals("complete");
		 
		 wait.until(ExpectedConditions.elementToBeClickable(BT_payNowFinal)); 
		 
		 Thread.sleep(1000);
		 
		 js.executeScript("arguments[0].click();", BT_payNowFinal);		 

		 
		 driver.switchTo().window(mainWindowHandle);
		 

		if(BT_paymentSucess.isDisplayed())
		{
			System.out.println("Payment Sucess");
		}
		else
		{
			System.out.println("Payment Failed");
        
		}			
	
	}
	

}
