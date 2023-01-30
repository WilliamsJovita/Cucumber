package com.AdactinCucumber.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AdactinCucumber.Runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepDefinition1 {
	
	public static WebDriver driver=RunnerClass.driver; //RunnerClass driver
	
	@Given("^user Launch The Adacitin Appilication$")
	public void user_Launch_The_Adacitin_Appilication() throws Throwable {
		driver.get("https://adactinhotelapp.com/");

	    	}

	@When("^user Enter the user Name$")
	public void user_Enter_the_user_Name() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("williamsjovita");

	
	}

	@When("^user Enter The Password$")
	public void user_Enter_The_Password() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("68JIJ9");	 

	    	}
	

	@Then("^user click Login Button Its Navigate TO Login Page$")
	public void user_click_Login_Button_Its_Navigate_TO_Login_Page() throws Throwable {
		driver.findElement(By.id("login")).click();
    	System.out.println("Sucess");
    	

	}

	@Given("^user Have To Fill The Given Field And Search The Hotel$")
	public void user_Have_To_Fill_The_Given_Field_And_Search_The_Hotel() throws Throwable {
	    	}

	@When("^user Choose The Location$")
	public void user_Choose_The_Location() throws Throwable {
		WebElement loca = driver.findElement(By.id("location"));
		Select s= new Select(loca);
		s.selectByValue("Sydney");
		
		}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		WebElement sh = driver.findElement(By.id("hotels"));
		Select s1= new Select(sh);
		s1.selectByVisibleText("Hotel Creek");
		
	}

	@When("^User Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		WebElement sr = driver.findElement(By.id("room_type"));
		Select s2= new Select(sr);
		s2.selectByVisibleText("Double");
		
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		WebElement nr = driver.findElement(By.id("room_nos"));
		Select s3= new Select(nr);
		s3.selectByVisibleText("1 - One");
		
	}

	@When("^Choose CheckIn Data$")
	public void choose_CheckIn_Data() throws Throwable {
		
	}

	@When("^Choose CheckOut Data$")
	public void choose_CheckOut_Data() throws Throwable {
	}

	@When("^Select No Of Adults$")
	public void select_No_Of_Adults() throws Throwable {
		WebElement apr = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(apr);
		s5.selectByVisibleText("2 - Two");
		
	}

	@When("^Select No OF Childrens$")
	public void select_No_OF_Childrens() throws Throwable {
		WebElement cpr = driver.findElement(By.id("child_room"));
		Select s6 = new Select(cpr);
		s6.deselectByVisibleText("2 - Two");
		
	}

	@Then("^User Click Search Button$")
	public void user_Click_Search_Button() throws Throwable {
		driver.findElement(By.id("Submit")).click();

	}

	@Given("^Select The Search Hotel And Confirm To Continue$")
	public void select_The_Search_Hotel_And_Confirm_To_Continue() throws Throwable {
	}

	@When("^User select hotel by clicking radio Button$")
	public void user_select_hotel_by_clicking_radio_Button() throws Throwable {
		
	WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
	radiobtn.click();
	}

	@Then("^Click Continue Button$")
	public void click_Continue_Button() throws Throwable {
		driver.findElement(By.id("continue")).click();
	}

	@Given("^Fill Details In Booking Page And Confirm Booking$")
	public void fill_Details_In_Booking_Page_And_Confirm_Booking() throws Throwable {
//		
		
	}

	@When("^user Enter The First_Name And Last_Name$")
	public void user_Enter_The_First_Name_And_Last_Name() throws Throwable {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Jovita");
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Flaviya");
		
	}

	@When("^user Enter The Billing Adress$")
	public void user_Enter_The_Billing_Adress() throws Throwable {
		WebElement Billingadress = driver.findElement(By.id("address"));
		Billingadress.sendKeys("Porur,Chennai-125");
	    	}

	@When("^user Enter The Credit Card_Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		
	}

	@When("^user Enter The Credit Card_Type$")
	public void user_Enter_The_Credit_Card_Type() throws Throwable {
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s7= new Select(cctype);
		s7.selectByVisibleText("American Express");
		
	    	}

	@When("^user Enter Card Expiry Date$")
	public void user_Enter_Card_Expiry_Date() throws Throwable {
		WebElement sm = driver.findElement(By.id("cc_exp_month"));
		Select s8=new Select(sm);
		s8.selectByVisibleText("January");
		WebElement sy = driver.findElement(By.id("cc_exp_year"));
		Select s81=new Select(sy);
		s81.selectByVisibleText("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		
		
		
	    	}

	@Then("^click Book Now Button$")
	public void click_Book_Now_Button() throws Throwable {
		driver.findElement(By.id("book_now")).click();
		
	}

	@Given("^User click the Logout Button and exit$")
	public void user_click_the_Logout_Button_and_exit() throws Throwable {
	    	}

	@When("^User Click Logout Button$")
	public void user_Click_Logout_Button() throws Throwable {
		driver.findElement(By.xpath("//a[@href='Logout.php']")).click();
	    	}

	@Then("^user Logout From The Application$")
	public void user_Logout_From_The_Application() throws Throwable {
	    	}



}
