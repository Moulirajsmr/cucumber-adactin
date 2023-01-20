package com.Adactin.cucu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
public WebDriver driver;
	
	@FindBy(xpath ="//select[@id='location']" )
	private WebElement location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath ="//select[@id='room_nos']" )
	private WebElement no_of_room;
	
	@FindBy(xpath ="//input[@id='datepick_in']" )
	private WebElement check_in;
	
	@FindBy(xpath ="//input[@id='datepick_out']" )
	private WebElement check_out;
	
	@FindBy(xpath ="//select[@id='adult_room']" )
	private WebElement adult_room;
	
	@FindBy(xpath ="//select[@id='child_room']" )
	private WebElement child_room;
	
	@FindBy(id = "Submit")
	private WebElement search_btn;
	
	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_room() {
		return no_of_room;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

}
