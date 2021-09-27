package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	
   public WebDriver driver = driverInit.getInstance().getDriver();
   

	public login() {
	PageFactory.initElements(driver, this);
}	
	
	@FindBy(xpath="//header[@class='header-area']//a[contains(@class,'theme-btn') and text()='Login']")
	WebElement BT_login;
	
	@FindBy(name="email")
	WebElement ED_email;
	
	@FindBy(name="password")
	WebElement ED_password;
	
	@FindBy(xpath="//button[@type='submit' and contains(.,'Login')]")
	WebElement BT_loginbtn;
	
	@FindBy(xpath="//span[text()='Welcome Back']")
	WebElement LBL_landingPage;
	
	@FindBy(xpath="//ul[@class='sidebar-menu list-items']//a[contains(@href,'logout')]")
	WebElement LK_logout;	
	
	
	public void launchBrowser() {
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		}
	
	public void logintoPhp() throws Exception {
		//objPhp.getelement("login_BT_login").click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebElement loginButton =driver.findElement(By.xpath("//header[@class='header-area']//a[contains(@class,'theme-btn') and text()='Login']"));
		js.executeScript("arguments[0].click();", BT_login);
		ED_email.sendKeys("user@phptravels.com");
		ED_password.sendKeys("demouser");
		//WebElement objLogin =driver.findElement(By.xpath("//button[@type='submit' and contains(.,'Login')]"));
		js.executeScript("arguments[0].click();", BT_loginbtn);		
	}
	
	public void verifyWelcome() throws Exception {
	
		if(LBL_landingPage.isDisplayed())
		{
			System.out.println("Welcome Page is displayed");
		}
		else
		{
			System.out.println("Welcome Page is not displayed");
		}
			
	}
	
	
	public void logout() throws Exception {
		LK_logout.click();
		driver.close();
		driver.quit();	
	}	
	

}
