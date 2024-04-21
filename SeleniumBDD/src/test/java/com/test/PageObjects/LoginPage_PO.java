package com.test.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_PO extends BasePage_PO {
	
	
    private static LoginPage_PO logininstance;
    
    private LoginPage_PO(){
    	System.out.println("Instance Constructor");
    }
    
    
    public static LoginPage_PO getInstance()
    {
        if (logininstance == null)
        	logininstance = new LoginPage_PO();
        return logininstance;
    }
	
	
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement userNameInputField;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordInputField;
	
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginBTN;
	
	
	@FindBy(xpath="//div[@id='login_credentials']")
	private WebElement loginCredentialsSection;
	
	
	@FindBy(xpath="//div[@class='login_password']")
	private WebElement loginPasswordSection;
	
	
	
	public void enterCredentails(String userName, String passWord) {
		this.checkLoginInputFieldsIsDisplayed();
		this.enterText(userNameInputField, userName);
		this.enterText(passwordInputField, passWord);
	}
	
	public void selectLoginBTN() {
		this.clickElement(loginBTN);
	}
	
	public void checkCurrentURL(String expectedURL) {
		this.validateCurrentURL(expectedURL);
	}
	
	
	public void checkLoginInputFieldsIsDisplayed() {
		this.checkVisibility(userNameInputField);
		this.checkVisibility(passwordInputField);
		this.checkVisibility(loginBTN);
	}
	
	

	public void checkLoginCredentialsSectionIsDisplayed() {
		this.checkVisibility(loginCredentialsSection);
		this.checkVisibility(loginPasswordSection);	
	}
	
	
	public void checkloginBTNColor(String expectedColor) {
		this.getBackgroundColor(loginBTN, expectedColor);
	}
	
	
	
	
	
}
