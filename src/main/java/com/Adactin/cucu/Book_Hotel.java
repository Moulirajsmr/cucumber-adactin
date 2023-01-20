package com.Adactin.cucu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement credit_card;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement card_type;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expiry_month;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expiry_year;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv_number;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book_btn;

	public WebDriver driver;
	
	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit_card() {
		return credit_card;
	}

	public WebElement getCard_type() {
		return card_type;
	}

	public WebElement getExpiry_month() {
		return expiry_month;
	}

	public WebElement getExpiry_year() {
		return expiry_year;
	}

	public WebElement getCvv_number() {
		return cvv_number;
	}

	public WebElement getBook_btn() {
		return book_btn;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
