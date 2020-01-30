package testcucum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NewDrivers {
	public static WebDriver getDriver(String browser)
	{
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_h2a.09.22\\Desktop\\selenium browsers\\chromedriver.exe");
		return new ChromeDriver();
	
	}
	else if(browser.equalsIgnoreCase("ff")) {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\Training_h2a.09.22\\Desktop\\selenium browsers\\gecko.exe");
		
		return new FirefoxDriver();
		
	}
	else if(browser.equalsIgnoreCase("ie")) {
		//System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Training_h2a.09.22\\Desktop\\selenium browsers\\IEDriverServer.exe");
		
		return new InternetExplorerDriver();}
	else {
		return null;
	}
		

}}
