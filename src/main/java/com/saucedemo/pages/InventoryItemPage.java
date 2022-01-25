package com.saucedemo.pages;

import com.saucedemo.Utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * By Dimple Patel
 **/
public class InventoryItemPage extends Utility
{
    private static final Logger log = LogManager.getLogger(InventoryItemPage.class.getName());

    public InventoryItemPage()
    {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement addToCartBtn1;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement addToCartBtn2;
    @CacheLookup
    //@FindBy(id = "back-to-products")
    //@FindBy(xpath = "//div[@class='left_component']//button")
    @FindBy(xpath = "//button[@id='back-to-products']")
    //@FindBy(linkText = "Back to products")
    WebElement backToProductsBtn;

    @CacheLookup
    @FindBy(xpath = "//div[@id='shopping_cart_container']//a")
    WebElement shoppingCart;

    public void clickOnAddToCart1()
    {
        clickOnElement(addToCartBtn1);
        log.info("Click on add to cart:- "+ addToCartBtn1.toString());
    }
    public void clickOnAddToCart2()
    {
        clickOnElement(addToCartBtn2);
        log.info("Click on add to cart:- "+ addToCartBtn2.toString());
    }
    public void clickOnBackToProducts()
    {
        if(backToProductsBtn.isDisplayed())
        {
            clickOnElement(backToProductsBtn);
            System.out.println(backToProductsBtn);
        }
        else
        {
            driver.navigate().back();
        }
        log.info("Click on back to products:- "+ backToProductsBtn.toString());
    }
    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCart);
        log.info("Click on shopping cart:- "+ shoppingCart.toString());
    }
}
