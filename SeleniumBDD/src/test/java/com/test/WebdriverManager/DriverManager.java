package com.test.WebdriverManager;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.test.ConstantValues.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static final Logger LOGGER =LogManager.getLogger(DriverManager.class);
	
	private static WebDriver driver=null;
	
	
	public static WebDriver getDriver() {
		return driver;
	}


	public static void launchBrowser() {

		try {

			switch (Constants.BrowserName) {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				//System.setProperty(Constants.ChromeDriver, Constants.ChromeDriverLocation);
				LOGGER.info("Launching the Browser " + Constants.BrowserName);
				driver = new ChromeDriver();
				break;
			case "FireFox":
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Launching the Browser " + Constants.BrowserName);
				driver=new FirefoxDriver(); 
				break;
			case "Edge":
				WebDriverManager.edgedriver().setup();
				LOGGER.info("Launching the Browser " + Constants.BrowserName);
				driver=new EdgeDriver(); 
				break;
			default:
				WebDriverManager.chromedriver().setup();
				//System.setProperty(Constants.ChromeDriver, Constants.ChromeDriverLocation);
				LOGGER.info("Launching the Browser " + Constants.BrowserName);
				driver = new ChromeDriver();
				break;
			}

		} catch (Exception e) {

		}

	}
	
	
	
	
	
	

}
