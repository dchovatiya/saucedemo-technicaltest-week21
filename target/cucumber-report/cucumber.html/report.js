$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and the costliest product from the sauce demo after sorting the products by\r\nHighest to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6375424600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigates sauce demo page and completes the item purchase",
  "description": "",
  "id": "search-functionality;user-navigates-sauce-demo-page-and-completes-the-item-purchase",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on sauce demo page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "filter the products by \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select the cheapest \u0026 costliest products and add to the basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter details firstname \"Stephen\", lastName \"Hawkins\" and zipPostalCode \"CA6 9UR\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see message order confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseSteps.iAmOnSauceDemoPage()"
});
formatter.result({
  "duration": 278842700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "PurchaseSteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 435897700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickOnLoginButton()"
});
formatter.result({
  "duration": 239586800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 24
    }
  ],
  "location": "PurchaseSteps.filterTheProductsBy(String)"
});
formatter.result({
  "duration": 700937800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.selectTheCheapestCostliestProductsAndAddToTheBasket()"
});
formatter.result({
  "duration": 1130091100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.openShoppingCart()"
});
formatter.result({
  "duration": 86381300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.goToCheckout()"
});
formatter.result({
  "duration": 81363400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Stephen",
      "offset": 25
    },
    {
      "val": "Hawkins",
      "offset": 45
    },
    {
      "val": "CA6 9UR",
      "offset": 73
    }
  ],
  "location": "PurchaseSteps.enterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 399292300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickOnContinueButton()"
});
formatter.result({
  "duration": 116788100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickOnFinishButton()"
});
formatter.result({
  "duration": 105601800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iShouldBeAbleToSeeMessageOrderConfirmationMessage()"
});
formatter.result({
  "duration": 78615100,
  "status": "passed"
});
formatter.after({
  "duration": 2129594900,
  "status": "passed"
});
});