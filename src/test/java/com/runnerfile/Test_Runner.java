package com.runnerfile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pom.adactin.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Adactin\\feature",

		glue = "com.Adactin.stepdef",
		
		monochrome = true,
		
		dryRun = false,
		
		publish = false,
		
		
		plugin = {"html:Reports/Report.html",
				
				//"pretty",
				
				"json:Reports/Cucumber.json",
				
				"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/Report.html"

}
		
		)

public class Test_Runner {
	public static WebDriver driver;


	@BeforeClass
	public static void setup() {
		driver = Base_class.getBrowser("Chrome");

	}

	@AfterClass
	public static void tearDown() {
		driver.close();

}
	
	
	

}
