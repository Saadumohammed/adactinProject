package com.adactin.stepdefinition;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.adactin.runner.RunnerClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {
	public static WebDriver driver= RunnerClass.driver;
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("mohammedsadiq");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("Mohammedsadiq@123");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel() throws Throwable {
		driver.findElement(By.id("login")).click();
	}

	@When("^user Select The Location From Location DropDown$")
	public void user_Select_The_Location_From_Location_DropDown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Select The Hotel From Hotel DropDown$")
	public void user_Select_The_Hotel_From_Hotel_DropDown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Select The Room Type From Room Type DropDown$")
	public void user_Select_The_Room_Type_From_Room_Type_DropDown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Select The Rooms From Number Of Rooms DropDown$")
	public void user_Select_The_Rooms_From_Number_Of_Rooms_DropDown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Enter The CheckIn Date In The Check In Date Field$")
	public void user_Enter_The_CheckIn_Date_In_The_Check_In_Date_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Enter The CheckOut Date In The Check Out Field$")
	public void user_Enter_The_CheckOut_Date_In_The_Check_Out_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Select The Adults Room In The Adults per Room DropDown$")
	public void user_Select_The_Adults_Room_In_The_Adults_per_Room_DropDown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Select The Children Room In The Children per Room DropDown$")
	public void user_Select_The_Children_Room_In_The_Children_per_Room_DropDown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user Click On Search Button And It Will Navigate to Select Hotel$")
	public void user_Click_On_Search_Button_And_It_Will_Navigate_to_Select_Hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Click on Select Option After Confirming His Requirement$")
	public void user_Click_on_Select_Option_After_Confirming_His_Requirement() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user Click on Continue Button and It Will Navigate to Book A Hotel Page$")
	public void user_Click_on_Continue_Button_and_It_Will_Navigate_to_Book_A_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Enter the First Name in The First Name Field$")
	public void user_Enter_the_First_Name_in_The_First_Name_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Enter The Address In The Billing Address Field$")
	public void user_Enter_The_Address_In_The_Billing_Address_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Enter The Credit Card Number In The Credit Card No Field$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_No_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Select The Credit Card Type From Credit Card Type DropDown$")
	public void user_Select_The_Credit_Card_Type_From_Credit_Card_Type_DropDown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Select The Credit Card Expiry Month & Year$")
	public void user_Select_The_Credit_Card_Expiry_Month_Year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user Enter The CVV Number From CVV Number Field$")
	public void user_Enter_The_CVV_Number_From_CVV_Number_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user Click On Book Now Button and It Will Navigate To Booking Confirmation Page$")
	public void user_Click_On_Book_Now_Button_and_It_Will_Navigate_To_Booking_Confirmation_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user Click on Logout Button$")
	public void user_Click_on_Logout_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
}
