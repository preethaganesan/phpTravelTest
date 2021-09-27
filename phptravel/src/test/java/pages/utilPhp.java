package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utilPhp {
	
	WebDriver driver;

	
	public String getelement(String elementName) throws Exception {
		
		Properties prop = new Properties();
		System.out.println(System.getProperty("user.dir")+"/src/test/resources/");
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Test.properties");
		prop.load(ip);
		
		String siV = prop.getProperty(elementName);
		return siV;
	
	}
	
	
	private static utilPhp uPHP;
	
	public static utilPhp get() {
		if(uPHP ==null) {
			uPHP = new utilPhp();
		}
		return uPHP;
	}
	
}
