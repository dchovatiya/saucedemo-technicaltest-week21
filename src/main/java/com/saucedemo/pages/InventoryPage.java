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
public class InventoryPage extends Utility
{
    //Locators filter the records, select cheapest and costliest items
    private static final Logger log = LogManager.getLogger(InventoryPage.class.getName());

    public InventoryPage()
    {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement filterData;
    @CacheLookup
    @FindBy(linkText = "Sauce Labs Onesie")
    WebElement cheapestItem;
    @CacheLookup
    @FindBy(linkText = "Sauce Labs Fleece Jacket")
    //@FindBy(xpath = "//a[@id='item_5_title_link']")
    WebElement expensiveItem;


    public void selectFromDropDn(String pickHighToLow)
    {
        clickOnElement(filterData);
        selectByVisibleTextFromDropDown(filterData, pickHighToLow);
        log.info("Select from the drop down menu:- "+ pickHighToLow);
    }
    public void selectCheapestItem()
    {
        clickOnElement(cheapestItem);
        log.info("Select the cheapest item:- "+ cheapestItem.toString());
    }
    public void selectCostliestItem()
    {
        clickOnElement(expensiveItem);
        log.info("Select the costliest item:- "+ expensiveItem.toString());
    }

}
