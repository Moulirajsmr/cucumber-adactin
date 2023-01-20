package com.step.defenition;

import org.openqa.selenium.WebDriver;

import com.Adactin.cucu.Book_Hotel;
import com.Adactin.cucu.Login_Page;
import com.Adactin.cucu.Search_Hotel;
import com.Adactin.cucu.Select_Hotel;
import com.base.cucu.Base_Cucu;
import com.cucu.runner.Runner_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Defenition extends Base_Cucu{
	
	public static WebDriver driver= Runner_Class.driver;
	
	@Given("User Launch The Adactin Url {string}")
	public void user_launch_the_adactin_url(String string) {
	    url(driver, string);
	}

	public static Login_Page login = new Login_Page(driver);
	
	@When("user Enter The Username {string}In The Username Field")
	public void user_enter_the_username_in_the_username_field(String string) {
	   send_keys(login.getUser_name(), string);
	}

	@When("user Enter The Password {string} In The Password Field")
	public void user_enter_the_password_in_the_password_field(String string) {
	   send_keys(login.getPwd(), string);
	}

	@Then("user Click The Login button And It Navigate To Search Hotel Page")
	public void user_click_the_login_button_and_it_navigate_to_search_hotel_page() {
	    click(login.getLogin_btn());
	}
	
	public static Search_Hotel search = new Search_Hotel(driver);

	@When("user Select The Location {string} In the Location Dropdown")
	public void user_select_the_location_in_the_location_dropdown(String string) {
	    select_vtext(search.getLocation(), string);
	}

	@When("user Select The Hotel {string} In the Hotels Dropdown")
	public void user_select_the_hotel_in_the_hotels_dropdown(String string) {
	    select_vtext(search.getHotels(), string);
	}

	@When("user Select The Roomtype {string} In the Roomtype Dropdown")
	public void user_select_the_roomtype_in_the_roomtype_dropdown(String string) {
	   select_vtext(search.getRoomtype(), string);
	}

	@When("user Select The No Of Rooms {string} In the No Of Rooms Dropdown")
	public void user_select_the_no_of_rooms_in_the_no_of_rooms_dropdown(String string) {
	    select_value(search.getNo_of_room(), string);
	}

	@When("user Enter The Check In Date {string} In The Check In Date Field")
	public void user_enter_the_check_in_date_in_the_check_in_date_field(String string) {
	    search.getCheck_in().click();
	    send_keys(search.getCheck_in(), string);
	}

	@When("user Enter The Check Out Date {string} In The Check Out Date Field")
	public void user_enter_the_check_out_date_in_the_check_out_date_field(String string) {
	   search.getCheck_out().click();
	   send_keys(search.getCheck_out(), string);
	}

	@When("user Select The Adults Per Rooms {string} In The Adults Per Rooms Dropdown")
	public void user_select_the_adults_per_rooms_in_the_adults_per_rooms_dropdown(String string) {
	    select_value(search.getAdult_room(), string);
	}

	@When("user Select The Childrens Per Rooms {string} In The Childrens Per Room Dropdown")
	public void user_select_the_childrens_per_rooms_in_the_childrens_per_room_dropdown(String string) {
	    select_value(search.getChild_room(), string);
	}

	@Then("user Click The Search button And It Navigate To Select Hotel Page")
	public void user_click_the_search_button_and_it_navigate_to_select_hotel_page() {
	    click(search.getSearch_btn());
	}
	
	public static Select_Hotel hotel = new Select_Hotel(driver);

	@When("user Click The Select In The Select Radio button")
	public void user_click_the_select_in_the_select_radio_button() {
	    click(hotel.getSlect_btn());
	}

	@Then("user Click The Continue button an It Navigate Book A Hotel Page")
	public void user_click_the_continue_button_an_it_navigate_book_a_hotel_page() {
	   click(hotel.getConfirm_btn());
	}
	
	public static Book_Hotel book = new Book_Hotel(driver);

	@When("user Enter The Firstname {string} In The Firstname Field")
	public void user_enter_the_firstname_in_the_firstname_field(String string) {
	    send_keys(book.getFirstname(), string);
	}

	@When("user Enter The Lastname {string} In The Lastname Field")
	public void user_enter_the_lastname_in_the_lastname_field(String string) {
	    send_keys(book.getLastname(), string);
	}

	@When("user Enter The Billing Address {string} In The Billing Address Field")
	public void user_enter_the_billing_address_in_the_billing_address_field(String string) {
	    send_keys(book.getAddress(), string);
	}

	@When("user Enter The Credit Card No {string} In The Credit Card No Field")
	public void user_enter_the_credit_card_no_in_the_credit_card_no_field(String string) {
	    send_keys(book.getCredit_card(), string);
	}

	@When("user Select The Credit Card Type {string} In The Credit Card Type Dropdown")
	public void user_select_the_credit_card_type_in_the_credit_card_type_dropdown(String string) {
	    select_vtext(book.getCard_type(), string);
	}

	@When("user Select The Expriy Date Month {string} In The select Month Dropdown")
	public void user_select_the_expriy_date_month_in_the_select_month_dropdown(String string) {
	    select_value(book.getExpiry_month(), string);
	}

	@When("user Select The Expriy Date Year {string} In The Select Year Dropdown")
	public void user_select_the_expriy_date_year_in_the_select_year_dropdown(String string) {
	    select_vtext(book.getExpiry_year(), string);
	}

	@When("user Enter The Cvv Number {string} In The Cvv Number Field")
	public void user_enter_the_cvv_number_in_the_cvv_number_field(String string) {
	    send_keys(book.getCvv_number(), string);
	}

	@Then("User Click The Book Now button And It Navigate To Booking Confirmation Page")
	public void user_click_the_book_now_button_and_it_navigate_to_booking_confirmation_page() {
	    click(book.getBook_btn());
	}

}
