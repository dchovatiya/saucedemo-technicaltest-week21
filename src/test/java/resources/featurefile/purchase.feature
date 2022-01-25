Feature: Search functionality
  As a user I want to purchase cheapest and the costliest product from the sauce demo after sorting the products by
  Highest to Low filter.

  Scenario: User navigates sauce demo page and completes the item purchase
    Given I am on sauce demo page
    When I login with credential username "standard_user" and password "secret_sauce"
    And  click on Login button
    And  filter the products by "Price (high to low)"
    And  select the cheapest & costliest products and add to the basket
    And  open shopping cart
    And  go to checkout
    And  enter details firstname "Stephen", lastName "Hawkins" and zipPostalCode "CA6 9UR"
    And  click on continue button
    And  click on finish button
    Then I should be able to see message order confirmation message


