package com.Adactin.stepdef;

import org.openqa.selenium.WebDriver;

import com.Helperfile.File_Read_Manager;
import com.pom.adactin.Base_class;
import com.pom.adactin.Page_Object_Model;
import com.runnerfile.Test_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_class {

	public static WebDriver driver = Test_Runner.driver;

	public static Page_Object_Model pom = new Page_Object_Model(driver);

	@Given("^user Lanuch the Application$")
	public void user_Lanuch_the_Application() throws Throwable {
		String Url = File_Read_Manager.getInstanceFRM().getInstanceCR().get_Url_Data();
		geturl(Url);

	}

//	@When("^user Enter The Username in UserName Field$")
//	public void user_Enter_The_Username_in_UserName_Field() throws Throwable {
	@When("user Enter The {string} in UserName Field")
	public void user_enter_the_in_user_name_field(String username) {
	
		inputText(pom.getInstancelp().getUsername(), username);

	}

//	@When("^user  Enter The Passwpord is Password Field$")
//	public void user_Enter_The_Passwpord_is_Password_Field() throws Throwable {@When("user  Enter The {string} is Password Field")
	@When("user  Enter The {string} is Password Field")
	public void user_enter_the_is_password_field(String password) {
	
		inputText(pom.getInstancelp().getPassword(), password);

	}

	@Then("^click on the Login Button And It Navigates To The Search  Hotel Page$")
	public void click_on_the_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickonElement(pom.getInstancelp().getLogin());

	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		Dropdown(pom.getInstancesh().getLocation(), "byvalue", "New York");

	}

	@When("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		Dropdown(pom.getInstancesh().getHotels(), "byvalue", "Hotel Sunshine");

	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		Dropdown(pom.getInstancesh().getRoomtype(), "byvalue", "Super Deluxe");

	}

	@When("^user Select The Number of Rooms$")
	public void user_Select_The_Number_of_Rooms() throws Throwable {
		Dropdown(pom.getInstancesh().getNoroom(), "byvlaue", "1");

	}

	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		inputText(pom.getInstancesh().getCheckin(), "14/03/2022");

	}

	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
		inputText(pom.getInstancesh().getCheckout(), "15/03/2022");

	}

	@When("^user Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		Dropdown(pom.getInstancesh().getAdultroom(), "byvalue", "2");

	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		Dropdown(pom.getInstancesh().getChildroom(), "byindex", "0");

	}

	@Then("^user click On the Serach Button And It Navigates To The Book Hotel Page$")
	public void user_click_On_the_Serach_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
		clickonElement(pom.getInstancesh().getSearch());

	}

	@When("^user Click On The Select Button$")
	public void user_Click_On_The_Select_Button() throws Throwable {
		clickonElement(pom.getInstanceshp().getSelect());

	}

	@Then("^user Click On The Continue Button And It Navigate To The Book Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigate_To_The_Book_Hotel_Page() throws Throwable {
		clickonElement(pom.getInstanceshp().getContinuebutton());

	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		inputText(pom.getInstancepp().getFname(), "Gajendiran");

	}

	@When("^user Select The Last Name$")
	public void user_Select_The_Last_Name() throws Throwable {
		inputText(pom.getInstancepp().getLname(), "E");

	}

	@When("^user Select The Billing Address$")
	public void user_Select_The_Billing_Address() throws Throwable {
		inputText(pom.getInstancepp().getBillingAddress(), "Kannagi nagar,velachari");

	}

	@When("^user Select The Credit Card Number$")
	public void user_Select_The_Credit_Card_Number() throws Throwable {
		String Cardno = File_Read_Manager.getInstanceFRM().getInstanceCR().get_Cardnumber();
		inputText(pom.getInstancepp().getCardno(), Cardno);

	}

	@When("^user Select The Credit Card type$")
	public void user_Select_The_Credit_Card_type() throws Throwable {
		Dropdown(pom.getInstancepp().getCardtype(), "byvalue", "VISA");

	}

	@When("^user Select The Expiry Date Month$")
	public void user_Select_The_Expiry_Date_Month() throws Throwable {
		 String Expmonth = File_Read_Manager.getInstanceFRM().getInstanceCR().get_Expmonth();
		Dropdown(pom.getInstancepp().getMonth(),"byvisibletext",Expmonth);
		
		String Expyear = File_Read_Manager.getInstanceFRM().getInstanceCR().get_Expyear();
		Dropdown(pom.getInstancepp().getYear(), "byvisibletext",Expyear);

	}

	@When("^user Select The CCV Number$")
	public void user_Select_The_CCV_Number() throws Throwable {
		String cvvno = File_Read_Manager.getInstanceFRM().getInstanceCR().get_cvv();
		inputText(pom.getInstancepp().getCcvno(), cvvno);

	}

	@Then("^user Click On The Book Now Button And It Navigate To The Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigate_To_The_Booking_Confirmation_Page() throws Throwable {
		clickonElement(pom.getInstancepp().getHotelbook());

	}

	@Then("^user Click On The My Itinerary Button And It Navigate To The Booking Itinerary Page$")
	public void user_Click_On_The_My_Itinerary_Button_And_It_Navigate_To_The_Booking_Itinerary_Page() throws Throwable {
		Timeoutimplicit(30);
		clickonElement(pom.getInstancebp().getMyitinerary());

	}

	@Then("^user Click On The Logout Button$")
	public void user_Click_On_The_Logout_Button() throws Throwable {
		clickonElement(pom.getInstancelop().getLogout());

	}

}
