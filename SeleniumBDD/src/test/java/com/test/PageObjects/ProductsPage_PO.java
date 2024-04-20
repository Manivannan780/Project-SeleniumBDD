package com.test.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage_PO {
	
	
	
	@FindBy(xpath="//div[@class='bm-burger-button']/button")
	public static WebElement hamburgerBTNInProductsPage;
	
	
	@FindBy(xpath="//div[@id='inventory_container']//div[@class='inventory_item_name']")
	public static WebElement productNamesInProductsPage;
	
	
	@FindBy(xpath="//div[@id='inventory_container']//div[@class='inventory_item_desc']")
	public static WebElement productDescriptionInProductsPage;
	
	
	@FindBy(xpath="//div[@id='inventory_container']//div[@class='pricebar']")
	public static WebElement productPriceInProductsPage;
	
	
	
	@FindBy(xpath="//div[@class='inventory_item_name'][text()='Sauce Labs Backpack']")
	public static WebElement productName;
	
	
	@FindBy(css="nav a[id='logout_sidebar_link']")
	public static WebElement logoutBTN;
	
	
		
}
