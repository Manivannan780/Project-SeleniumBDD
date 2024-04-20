package com.test.CommonOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.checkerframework.common.reflection.qual.GetClass;
import org.openqa.selenium.support.PageFactory;

import com.test.ConstantValues.Constants;
import com.test.PageObjects.LoginPage_PO;
import com.test.PageObjects.ProductsDetailsPage_PO;
import com.test.PageObjects.ProductsPage_PO;
import com.test.WebdriverManager.DriverManager;

public class CommonUtils {
	

	public void loadConfigProperties() {
		
		Properties properties=new Properties();
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));  //The config file place in the Resources folder
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Assigning the property values
		Constants.App_URL=properties.getProperty("Application_URL");
		Constants.BrowserName=properties.getProperty("Browser_Name");
		Constants.LoginUserName=properties.getProperty("Login_UserName");
		Constants.LoginPassword=properties.getProperty("Login_Password");
		Constants.ChromeDriverLocation=properties.getProperty("ChromeDriver_Location");
			
	}
	
	
	public void initElements() {
		PageFactory.initElements(DriverManager.getDriver(), LoginPage_PO.class);
		PageFactory.initElements(DriverManager.getDriver(), ProductsPage_PO.class);
		PageFactory.initElements(DriverManager.getDriver(), ProductsDetailsPage_PO.class);
	}
	
	

}
