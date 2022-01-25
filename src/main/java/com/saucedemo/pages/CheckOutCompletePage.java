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
public class CheckOutCompletePage extends Utility
{
    private static final Logger log = LogManager.getLogger(CheckOutCompletePage.class.getName());

    public CheckOutCompletePage()
    {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")
    WebElement orderConfirmation;

    public String verifyOrderConfirmation()
    {
        System.out.println(orderConfirmation);
        return orderConfirmation.getText();
    }
}
