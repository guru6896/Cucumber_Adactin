package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	
	public static WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement fname;

	@FindBy(id = "last_name")
	private WebElement lname;

	@FindBy(id = "address")
	private WebElement billingAddress;

	@FindBy(id = "cc_num")
	private WebElement cardno;

	@FindBy(id = "cc_type")
	private WebElement cardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	@FindBy(id = "cc_exp_year")
	private WebElement year;

	@FindBy(id = "cc_cvv")
	private WebElement ccvno;

	@FindBy(id = "book_now")
	private WebElement hotelbook;

	public Payment_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcvno() {
		return ccvno;
	}

	public WebElement getHotelbook() {
		return hotelbook;
	}


}
