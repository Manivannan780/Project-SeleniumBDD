package com.test.Stepdefinitions;

import com.test.ConstantValues.Constants;
import com.test.PageObjects.LoginPage_PO;
import com.test.PageObjects.ProductsPage_PO;
import com.test.WebdriverManager.DriverManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProductsPage_Steps {
	
	
	@Given("Launch the application and Check login page is displayed")
	public void launch_the_application_and_check_login_page_is_displayed() {
		DriverManager.getDriver().get(Constants.App_URL);
		System.out.println("Browser Launched");
		
		
	}
	
	
	@And("Enter the username and password and login")
	public void enter_the_username_and_password_and_login() {
		
		LoginPage_PO.userNameInputField.sendKeys(Constants.LoginUserName);
		LoginPage_PO.passwordInputField.sendKeys(Constants.LoginPassword);
		LoginPage_PO.loginBTN.click();	
		String currentURL=DriverManager.getDriver().getCurrentUrl();
		if(currentURL.contains("/inventory.html")) {
			System.out.println("User in Home page");
		}else {
			System.out.println("User is not in Home page");
		}
		
	}
	
	
	@Then("Check the Products title are displayed")
	public void check_the_products_title_are_displayed() {
		String expectedProductName="Sauce Labs Backpack";
		String productName=ProductsPage_PO.productName.getText();
		if(productName.equals(expectedProductName)) {
			System.out.println("Product Name is  matched");
		}
		else {
			System.out.println("Product Name is not matched");
		}
		
	}
	@Then("Check the Products Names are displayed")
	public void check_the_products_names_are_displayed() {
		
		  
	}
	
	
	@Then("Check the Page title and other elements are displayed")
	public void check_the_page_title_and_other_elements_are_displayed() {
	
		
	}
	@And("Logout the Application")
	public void logout_the_application() {
	    
		ProductsPage_PO.hamburgerBTNInProductsPage.click();
		ProductsPage_PO.logoutBTN.click();
		Boolean userName=LoginPage_PO.userNameInputField.isDisplayed();
		if(userName) {
			System.out.println("Login Page");
		}else {
			System.out.println("User not in Login Page");
		}
		System.out.println("Closing the Browser");
		DriverManager.getDriver().close();
		System.out.println("Browser Closed");
		
	}

}
