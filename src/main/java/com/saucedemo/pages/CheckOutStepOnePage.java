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
public class CheckOutStepOnePage extends Utility
{
    private static final Logger log = LogManager.getLogger(CheckOutStepOnePage.class.getName());

    public CheckOutStepOnePage()
    {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(css="#first-name")
    WebElement firstName;
    @CacheLookup
    @FindBy(css="#last-name")
    WebElement lastName;
    @CacheLookup
    @FindBy(css="#postal-code")
    WebElement postalCd;
    @CacheLookup
    @FindBy(xpath="//input[@id='continue']")
    WebElement continueBtn;

    public void setFirstName(String firstNm)
    {
        sendTextToElement(firstName,firstNm);
        log.info("Send first name:- "+firstName.toString());

    }
    public void setLastName(String lastNm)
    {
        sendTextToElement(lastName,lastNm);
        log.info("Send last name:- "+lastName.toString());

    }
    public void setPostalCd(String postalCode)
    {
        sendTextToElement(postalCd,postalCode);
        log.info("Send last name:- "+postalCd.toString());

    }
    public void setContinueBtn()
    {
        clickOnElement(continueBtn);
        log.info("Click on continue button:- "+continueBtn.toString());

    }
}
