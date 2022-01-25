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
public class CheckOutStepTwoPage extends Utility
{
    private static final Logger log = LogManager.getLogger(CheckOutStepTwoPage.class.getName());

    public CheckOutStepTwoPage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishBtn;
    public void clickFinishBtn()
    {
        clickOnElement(finishBtn);
        log.info("Click on finish button:- "+finishBtn);
    }
}

