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
public class HomePage extends Utility
{
    //Locators username, password and login button
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(id="user-name")
    WebElement userNm;

    @CacheLookup
    @FindBy(id="password")
    WebElement passWrd;

    @CacheLookup
    @FindBy(id="login-button")
    WebElement loginBtn;

    public void enterUserNmAndPassword(String userName,String passWord)
    {
        sendTextToElement(userNm,userName);
        sendTextToElement(passWrd,passWord);
        log.info("Enter user name and password:- "+userName + passWord);
    }
    public void clickOnLoginBtn()
    {
        clickOnElement(loginBtn);
        log.info("Click on login button:- "+loginBtn.toString());
    }
}
