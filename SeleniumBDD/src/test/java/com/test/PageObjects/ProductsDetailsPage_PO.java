package com.test.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsDetailsPage_PO {
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	public static WebElement addCartBTNInProductsDetailsPage;

	@FindBy(xpath="//div[@class='inventory_details_price']")
	public static WebElement productPriceInProductsDetailsPage;
	
	@FindBy(xpath="//div[@class='inventory_details_desc']")
	public static WebElement productDescriptionInProductsDetailsPage;

	@FindBy(xpath="//div[@class='inventory_details_name']")
	public static WebElement productNameInProductsDetailsPage;
	
	@FindBy(xpath="//div/button[@class='inventory_details_back_button']")
	public static WebElement backBTNInProductsDetailsPage;

	@FindBy(xpath="//button[text()='REMOVE']")
	public static WebElement removeBTNInProductsDetailsPage;
	
	
	
}
