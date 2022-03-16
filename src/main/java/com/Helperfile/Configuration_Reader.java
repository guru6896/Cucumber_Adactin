package com.Helperfile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File("C:\\Users\\USER\\eclipse-workspace\\Adactin_Project\\src\\main\\java\\com\\configuration\\Configuration.properties");
	
	      FileInputStream fis = new FileInputStream(f);

		  p = new Properties();

		  p.load(fis);

	}

	public String get_Url_Data() {

		String url = p.getProperty("Url");
		return url;

	}
	
	public String get_Username() {
		String username = p.getProperty("username");
		return username;
		

	}
	
	public String get_Password() {
	String password = p.getProperty("password");
	return password;

	}
	
	public String get_Cardnumber(){
		String cardno = p.getProperty("cardnumber");
		return cardno;
	}
	
	
	public String get_Cardtype(){
		String cardtype = p.getProperty("cardtype");
		return cardtype;
	}
	
	public String get_Expmonth() {
		String month = p.getProperty("Expmonth");
		return month;
	}
	
	public String get_Expyear() {
		String year = p.getProperty("Expyear");
		return year;
		
	}
	public String get_cvv( ) {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	
}
