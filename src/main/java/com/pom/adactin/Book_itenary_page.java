package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_itenary_page {

	public static WebDriver driver;

	@FindBy(id = "my_itinerary")
	private WebElement myitinerary;

	public Book_itenary_page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}
	
	
	
	
	
	
	
}
