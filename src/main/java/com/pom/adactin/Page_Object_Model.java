package com.pom.adactin;

import org.openqa.selenium.WebDriver;

public class Page_Object_Model {

	
	public static WebDriver driver;

	private Login_Page lp;

	private Search_Hotel_Page sh;

	private Select_Hotel_Page shp;

	private Payment_Page pp;

	private Book_itenary_page bp;

	private Logout_Page lop;

	public Page_Object_Model(WebDriver driver) {
		this.driver = driver;
	}

	public Login_Page getInstancelp() {

		Login_Page lp = new Login_Page(driver);

		return lp;

	}

	public Search_Hotel_Page getInstancesh() {

		Search_Hotel_Page sh = new Search_Hotel_Page(driver);

		return sh;

	}

	public Select_Hotel_Page getInstanceshp() {

		Select_Hotel_Page shp = new Select_Hotel_Page(driver);

		return shp;

	}

	public Payment_Page getInstancepp() {

		Payment_Page pp = new Payment_Page(driver);
		return pp;

	}

	public Book_itenary_page getInstancebp() {

		Book_itenary_page bp = new Book_itenary_page(driver);

		return bp;

	}

	public Logout_Page getInstancelop() {

		Logout_Page lop = new Logout_Page(driver);

		return lop;

	}

}
