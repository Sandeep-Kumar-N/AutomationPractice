package stepDefinition;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import pages.TShirtPage;

public class TShirtPageStepDefinition extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    TShirtPage tShirtPage;


    @Then("^User Adds Items to Cart$")
    public void user_Adds_Items_to_Cart(){
//        loginPage = new LoginPage();
//        homePage=loginPage.Login();
        homePage = new HomePage();
        tShirtPage = homePage.Navigate_To_TShirt_Page();
        tShirtPage.Add_All_Items_To_Cart();
    }

    @Given("^User Adds Items to Cart1$")
    public void user_Adds_Items_to_Cart1(){
//        loginPage = new LoginPage();
//        homePage=loginPage.Login();
        homePage = new HomePage();
        tShirtPage = homePage.Navigate_To_TShirt_Page();
        tShirtPage.Add_All_Items_To_Cart();
    }
}
