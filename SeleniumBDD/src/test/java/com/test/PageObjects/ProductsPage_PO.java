package com.test.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class ProductsPage_PO extends BasePage_PO {
	
	
private static ProductsPage_PO productsPageinstance;
    
    private ProductsPage_PO(){
    	System.out.println("ProductsPage_PO Instance Constructor");
    }
    
    
    public static ProductsPage_PO getInstance()
    {
        if (productsPageinstance == null) {
        	productsPageinstance = new ProductsPage_PO();
        }  	
        return productsPageinstance;
    }
	
	
	@FindBy(xpath="//div[@class='bm-burger-button']/button")
	private WebElement hamburgerBTNInProductsPage;
	
	
	@FindBy(xpath="//div[@id='inventory_container']//div[@class='inventory_item_name']")
	private  WebElement productNamesInProductsPage;
	
	
	@FindBy(xpath="//div[@id='inventory_container']//div[@class='inventory_item_desc']")
	private  WebElement productDescriptionInProductsPage;
	
	
	@FindBy(xpath="//div[@id='inventory_container']//div[@class='pricebar']")
	private  WebElement productPriceInProductsPage;
	
	
	
	@FindBy(xpath="//div[@class='inventory_item_name'][text()='Sauce Labs Backpack']")
	private  WebElement productName;
	
	
	@FindBy(css="nav a[id='logout_sidebar_link']")
	private WebElement logoutBTN;
	
	
	
	
	
	public void checkProductNameText(String expectedText) {
		
		String actualText=this.getElementText(productName);
		 Assert.assertEquals("Expected text: '" + expectedText + "', Actual text: '" + actualText + "'", expectedText, actualText);		
	}
	
	
	
	

	
	public void logoutApplication() {
		this.clickElement(hamburgerBTNInProductsPage);
		this.clickElement(logoutBTN);		
	}
	
	
	
	
		
}
