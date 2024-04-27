package com.test.PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class ProductsPage_PO extends BasePage_PO {

	private static ProductsPage_PO productsPageinstance;

	private ProductsPage_PO() {
		System.out.println("ProductsPage_PO Instance Constructor");
	}

	public static ProductsPage_PO getInstance() {
		if (productsPageinstance == null) {
			productsPageinstance = new ProductsPage_PO();
		}
		return productsPageinstance;
	}

	@FindBy(xpath = "//div[@class='bm-burger-button']/button")
	private WebElement hamburgerBTNInProductsPage;

	@FindBy(xpath = "//div[@id='inventory_container']//div[@class='inventory_item_name']")
	private WebElement productNamesInProductsPage;

	protected String productsNamesTextInProductsPage = "//div[@id='inventory_container']//div[@class='inventory_item_name']";

	@FindBy(css = "div[id='header_container'] div[class='app_logo']")
	private WebElement applicationLogo;

	@FindBy(xpath = "//div[@id='inventory_container']//div[@class='inventory_item_desc']")
	private WebElement productDescriptionInProductsPage;

	@FindBy(xpath = "//div[@id='inventory_container']//div[@class='pricebar']")
	private WebElement productPriceInProductsPage;

	@FindBy(xpath = "//div[@class='inventory_item_name'][text()='Sauce Labs Backpack']")
	private WebElement singleProductName;

	@FindBy(css = "nav a[id='logout_sidebar_link']")
	private WebElement logoutBTN;

	public void checkProductNameText(String expectedText) {

		String actualText = this.getElementText(singleProductName);
		Assert.assertEquals("Expected text: '" + expectedText + "', Actual text: '" + actualText, expectedText,
				actualText);
	}

	public void checkProductNamesTextIsDisplayed(List<String> expectedProductNames) {

		List<String> productsText = this.getListofElementsText(productsNamesTextInProductsPage, true);
		this.verifyListofElementsText(expectedProductNames, productsText);
	}

	public void checkProductsPageElementsState() {
		this.checkVisibility(applicationLogo);
		this.checkVisibility(singleProductName);
	}

	public void logoutApplication() {
		hamburgerBTNInProductsPage.click();
		this.clickElement(logoutBTN);
	}

}
