Feature: Login to site and add all items to Cart from TShirts Page

  Scenario: User should be able to Login
    Given User is in Login Page
    When User enters UserName and Password
    Then User Navigates to Home Page

  Scenario: User should select all items from TShirt Page
    Given User is in HomePage
    When User Navigates to Tshirts Page
    Then User Adds Items to Cart