package stepDefinition;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.TShirtPage;

public class HomePageStepDefinition extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    TShirtPage tShirtPage;


    @Given("^User is in HomePage$")
    public void user_is_in_HomePage(){
        loginPage = new LoginPage();
        homePage = loginPage.Login();
        System.out.println("Home Page Title =" + homePage.PageTitle());
    }

    @When("^User Navigates to Tshirts Page$")
    public void user_Navigates_to_Tshirts_Page(){
        tShirtPage=homePage.Navigate_To_TShirt_Page();
        System.out.println("TShirt Page title is : " + tShirtPage.PageTitle());
    }


}
