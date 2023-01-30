package com.AdactinCucumber.Runner;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.pom.Login_Page;

public class PomAdactinRunnerClass extends BaseClass{
	
	public static WebDriver driver; //null
	
	Login_Page lp = new Login_Page(driver);
	
	public static void main(String[] args) {
		
		
		driver = launchbrowser("Chrome");
		launchUrl("https://adactinhotelapp.com/");
		Login_Page lp = new Login_Page(driver);
		passinput(lp.getUsername(), "williamsjovita");
		passinput(lp.getPassword(), "68JIJ9");
		Clickonelement(lp.getLoginbtn());
		
		
	}

		
	}
	
	
	
	
	


