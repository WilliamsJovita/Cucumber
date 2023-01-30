package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	private static WebElement element;
	
	//BrowserLaunch
	public static WebDriver launchbrowser(String browsername) {
    if (browsername.equalsIgnoreCase("Chrome")) {
    	
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
		
	}
	
    
    else if (browsername.equalsIgnoreCase("firefox")) {
    	
    	WebDriverManager.firefoxdriver().setup();
    	driver= new FirefoxDriver();
    	
		
	}
    driver.manage().window().maximize();
    return driver;
	}
	//2 get
	
	public static  WebDriver launchUrl(String url) {
		driver.get(url);
		return driver;
		
		

	}
	
	//6 send keys
	public static void passinput(WebElement element, String input) {
		element.sendKeys(input);

	}
	
	//Click

	public static void Clickonelement(WebElement element) {
		element.click();
	

	}
	public static void  deloleinpt (WebElement elemenet ) {
		element.clear();
		
		
		

	}
}
