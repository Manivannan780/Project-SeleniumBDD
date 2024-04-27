package com.test.Stepdefinitions;

import java.util.List;

import com.test.ConstantValues.Constants;
import com.test.PageObjects.LoginPage_PO;
import com.test.PageObjects.ProductsPage_PO;
import com.test.WebdriverManager.DriverManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsPage_Steps {

	@Given("Launch the application")
	public void launch_the_application() {
		DriverManager.getDriver().get(Constants.App_URL);
		System.out.println("Browser Launched");
	}

	@Then("User checks if the login page contents are displayed properly")
	public void user_checks_if_the_login_page_contents_are_displayed_properly() {
		LoginPage_PO.getInstance().checkLoginInputFieldsIsDisplayed();
		LoginPage_PO.getInstance().checkLoginCredentialsSectionIsDisplayed();
		LoginPage_PO.getInstance().checkloginBTNColor("rgb(226, 35, 26)");
	}

	@When("Enter the username and password and click login")
	public void enter_the_username_and_password_and_login() {

		LoginPage_PO.getInstance().enterCredentails(Constants.LoginUserName, Constants.LoginPassword);
		LoginPage_PO.getInstance().selectLoginBTN();
		LoginPage_PO.getInstance().checkCurrentURL("/inventory.html");

	}

	@Then("Check the Products title are displayed")
	public void check_the_products_title_are_displayed() {
		String expectedProductName = "Sauce Labs Backpack";
		ProductsPage_PO.getInstance().checkProductNameText(expectedProductName);
	}

	@Then("Check the Products Names are displayed correctly")
	public void check_the_products_names_are_displayed_correctly(io.cucumber.datatable.DataTable dataTable) {

		List<String> expectedProductNames = dataTable.asList();
		System.out.println(expectedProductNames);
		ProductsPage_PO.getInstance().checkProductNamesTextIsDisplayed(expectedProductNames);

	}

	@Then("Check the Page title and other elements are displayed")
	public void check_the_page_title_and_other_elements_are_displayed() {
		ProductsPage_PO.getInstance().validateCurrentURL("/inventory.html");
		ProductsPage_PO.getInstance().checkProductsPageElementsState();
	}

	@And("Logout the Application")
	public void logout_the_application() {

		ProductsPage_PO.getInstance().logoutApplication();
		LoginPage_PO.getInstance().checkLoginInputFieldsIsDisplayed();
		LoginPage_PO.getInstance().checkLoginCredentialsSectionIsDisplayed();
		LoginPage_PO.getInstance().checkloginBTNColor("rgb(226, 35, 26)");
	}

}
