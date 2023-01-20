package com.Adactin.cucu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement slect_btn;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement confirm_btn;
	
	
	public Select_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSlect_btn() {
		return slect_btn;
	}


	public WebElement getConfirm_btn() {
		return confirm_btn;
	}

}
