package com.test.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_PO {
	
	
    private static LoginPage_PO logininstance;

    private LoginPage_PO(){
    	System.out.println("Instance Constructor");
    }
	
	
	
	@FindBy(xpath="//input[@id='user-name']")
	public static WebElement userNameInputField;
	
	
	@FindBy(xpath="//input[@id='password']")
	public static WebElement passwordInputField;
	
	
	@FindBy(xpath="//input[@id='login-button']")
	public static WebElement loginBTN;
	
	
	@FindBy(xpath="//div[@id='login_credentials']")
	public static WebElement loginCredentialsSection;
	
	
	@FindBy(xpath="//div[@class='login_password']")
	public static WebElement loginPasswordSection;
	
	
	
}
