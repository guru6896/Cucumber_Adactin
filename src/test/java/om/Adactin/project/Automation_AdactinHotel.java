package om.Adactin.project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pom.adactin.Base_class;
import com.pom.adactin.Page_Object_Model;

public class Automation_AdactinHotel extends Base_class {

	public static WebDriver driver = Base_class.getBrowser("Chrome");

	public static Page_Object_Model pom = new Page_Object_Model(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		geturl("https://adactinhotelapp.com/");

		Timeoutimplicit(30);

		// LOGIN PAGE

		// LoginPage lp = new LoginPage(driver);

		inputText(pom.getInstancelp().getUsername(), "GajendiranElumalai");

		inputText(pom.getInstancelp().getPassword(), "CX499Y");

		TakesScreenshot("C:\\Users\\USER\\eclipse-workspace\\Adactin_Project\\Screenshot\\login.png");

		clickonElement(pom.getInstancelp().getLogin());

		// SEARCH HOTEL PAGE

		// SearchHotel_Page sh = new SearchHotel_Page(driver);

		Dropdown(pom.getInstancesh().getLocation(), "byvalue", "New York");

		Dropdown(pom.getInstancesh().getHotels(), "byvalue", "Hotel Sunshine");

		Dropdown(pom.getInstancesh().getRoomtype(), "byvalue", "Super Deluxe");

		Dropdown(pom.getInstancesh().getNoroom(), "byvlaue", "1");

		inputText(pom.getInstancesh().getCheckin(), "14/03/2022");

		inputText(pom.getInstancesh().getCheckout(), "15/03/2022");

		Dropdown(pom.getInstancesh().getAdultroom(), "byvalue", "2");

		Dropdown(pom.getInstancesh().getChildroom(), "byindex", "0");

		TakesScreenshot("C:\\Users\\USER\\eclipse-workspace\\Adactin_Project\\Screenshot\\Searchpage.png");

		clickonElement(pom.getInstancesh().getSearch());

		// SELECT HOTEL PAGE

		// SelectHotel_Page shp = new SelectHotel_Page(driver);

		clickonElement(pom.getInstanceshp().getSelect());

		TakesScreenshot("C:\\Users\\USER\\eclipse-workspace\\Adactin_Project\\Screenshot\\SelectHotel.png");

		clickonElement(pom.getInstanceshp().getContinuebutton());

		// PAYMENT PAGE

		// Payment_Page pp = new Payment_Page(driver);

		inputText(pom.getInstancepp().getFname(), "Gajendiran");

		inputText(pom.getInstancepp().getLname(), "E");

		inputText(pom.getInstancepp().getBillingAddress(), "Kannagi nagar,velachari");

		inputText(pom.getInstancepp().getCardno(), "2334567891236543");

		Dropdown(pom.getInstancepp().getCardtype(), "byvalue", "VISA");

		Dropdown(pom.getInstancepp().getMonth(), "byvisibletext", "July");

		Dropdown(pom.getInstancepp().getYear(), "byvisibletext", "2022");

		inputText(pom.getInstancepp().getCcvno(), "455");

		TakesScreenshot("C:\\Users\\USER\\eclipse-workspace\\Adactin_Project\\Screenshot\\Payment.png");

		clickonElement(pom.getInstancepp().getHotelbook());

		// BOOKED ITINERAY PAGE

		// BookedItineray_Page bp = new BookedItineray_Page(driver);

		clickonElement(pom.getInstancebp().getMyitinerary());

		TakesScreenshot("C:\\Users\\USER\\eclipse-workspace\\Adactin_Project\\Screenshot\\BookHotel.png");

		// LOGOUT PAGE

		// LogoutPage lop = new LogoutPage(driver);

		clickonElement(pom.getInstancelop().getLogout());

		TakesScreenshot("C:\\Users\\USER\\eclipse-workspace\\Adactin_Project\\Screenshot\\Logout.png");

		close();

	}
}
