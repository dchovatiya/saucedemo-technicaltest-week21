package com.saucedemo.steps;

import com.saucedemo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;

import static com.saucedemo.drivermanager.ManageDriver.driver;

/**
 * By Dimple Patel
 **/
public class PurchaseSteps {
    @Given("^I am on sauce demo page$")
    public void iAmOnSauceDemoPage()
    {
        //driver.navigate().to("https://www.saucedemo.com/");
        driver.getCurrentUrl();
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String userNm, String passWord)
    {
        new HomePage().enterUserNmAndPassword(userNm,passWord);
    }
    @And("^click on Login button$")
    public void clickOnLoginButton()
    {
        new HomePage().clickOnLoginBtn();
    }
    @And("^filter the products by \"([^\"]*)\"$")
    public void filterTheProductsBy(String HighToLow)
    {
        new InventoryPage().selectFromDropDn(HighToLow);
    }
    @And("^select the cheapest & costliest products and add to the basket$")
    public void selectTheCheapestCostliestProductsAndAddToTheBasket()  {
        new InventoryPage().selectCheapestItem();
        new InventoryItemPage().clickOnAddToCart1();
        new InventoryItemPage().clickOnBackToProducts();
        new InventoryPage().selectFromDropDn("Price (high to low)");
        new InventoryPage().selectCostliestItem();
        new InventoryItemPage().clickOnAddToCart2();
    }
    @And("^open shopping cart$")
    public void openShoppingCart()
    {
        new InventoryItemPage().clickOnShoppingCart();
    }
    @And("^go to checkout$")
    public void goToCheckout()
    {
        new CartPage().clickOnChkOutBtn();
    }

    @And("^enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void enterDetailsFirstnameLastNameAndZipPostalCode(String firstName, String lastName, String postalCode)
    {
        new CheckOutStepOnePage().setFirstName(firstName);
        new CheckOutStepOnePage().setLastName(lastName);
        new CheckOutStepOnePage().setPostalCd(postalCode);
    }
    @And("^click on continue button$")
    public void clickOnContinueButton()
    {
        new CheckOutStepOnePage().setContinueBtn();
    }
    @And("^click on finish button$")
    public void clickOnFinishButton()
    {
        new CheckOutStepTwoPage().clickFinishBtn();
    }
    @Then("^I should be able to see message order confirmation message$")
    public void iShouldBeAbleToSeeMessageOrderConfirmationMessage()
    {
        String expectedMessage="THANK YOU FOR YOUR ORDER";
        String actualMessage=new CheckOutCompletePage().verifyOrderConfirmation();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
