package com.test.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsDetailsPage_PO {

	private static ProductsDetailsPage_PO productsDetailPageInstance;

	private ProductsDetailsPage_PO() {
		System.out.println("Private Constructor for Products Details Page PO");
	}

	public static ProductsDetailsPage_PO getInstance() {
		if (productsDetailPageInstance == null) {
			productsDetailPageInstance = new ProductsDetailsPage_PO();
		}

		return productsDetailPageInstance;

	}

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addCartBTNInProductsDetailsPage;

	@FindBy(xpath = "//div[@class='inventory_details_price']")
	private WebElement productPriceInProductsDetailsPage;

	@FindBy(xpath = "//div[@class='inventory_details_desc']")
	private WebElement productDescriptionInProductsDetailsPage;

	@FindBy(xpath = "//div[@class='inventory_details_name']")
	private WebElement productNameInProductsDetailsPage;

	@FindBy(xpath = "//div/button[@class='inventory_details_back_button']")
	private WebElement backBTNInProductsDetailsPage;

	@FindBy(xpath = "//button[text()='REMOVE']")
	private WebElement removeBTNInProductsDetailsPage;
	
	
	
	
	
	
	
	

}
