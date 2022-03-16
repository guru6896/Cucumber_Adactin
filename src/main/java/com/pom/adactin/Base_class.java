package com.pom.adactin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_class {

	public static WebDriver driver; // null driver

	public static WebDriver getBrowser(String browserType) {

		if (browserType.equalsIgnoreCase("CHrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\USER\\eclipse-workspace\\Adactin_Project\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();

		}

		else if (browserType.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();

			driver.manage().window().maximize();
		}

		return driver;

	}

	public static void clickonElement(WebElement element) {
		element.click();
	}

	public static void inputText(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void geturl(String url) {
		driver.get(url);

	}

	public static void close() {
		driver.close();

	}

	public static void Sleepmode(long ms) throws InterruptedException {
		Thread.sleep(ms);

	}

	public static void Timeoutimplicit(int w) {
		driver.manage().timeouts().implicitlyWait(w, TimeUnit.SECONDS);

	}

	public static void Dropdown(WebElement element, String type, String V) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(V);
		}

		else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(V);

		} else if (type.equalsIgnoreCase("byindex")) {
			int index = Integer.parseInt(V);
			s.selectByIndex(index);

		}

	}

	public static void TakesScreenshot(String pathname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(pathname);

		FileHandler.copy(source, destination);

	
	
	}
	
}
