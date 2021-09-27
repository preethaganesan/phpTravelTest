package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverInit {
	
    public WebDriver driver;
    public static driverInit driverInit = null;

    public static driverInit getInstance() {
        if (driverInit == null) {
            driverInit = new driverInit();
        }
        return driverInit;
    }

    public driverInit() {
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //this.driver.get("******");
    }

    public WebDriver getDriver() {
        return this.driver;
    }

}
