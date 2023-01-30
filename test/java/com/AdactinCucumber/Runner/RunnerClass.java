package com.AdactinCucumber.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(features = "C:\\Users\\flavi\\eclipse-workspace\\Project\\src\\test\\java\\com\\AdactinCucumber\\Feature\\com.AdactinFeatureFile",glue = "com.AdactinCucumber.StepDefinition")
         
public class RunnerClass {
	
       
        public static WebDriver driver; 
        
        
		@BeforeClass
        public static void setup() {
    	
    	WebDriverManager.chromedriver().setup();
    	
    	driver=new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	System.out.println("browser launch success");
    	
   }
    @AfterClass
	public static void teardown() {
		
		driver.close();
		
		
		
		
	}
	

}
