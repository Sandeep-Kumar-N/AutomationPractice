package stepDefinition;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageStepDefinition extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    @Before
    public void before(Scenario scenario) {
        System.out.println("------------------------------");
        System.out.println("Starting - " + scenario.getName());
        System.out.println("------------------------------");
        Initialization();

    }

    @After
    public void after(Scenario scenario) {
        TearDown();
        System.out.println("------------------------------");
        System.out.println("Ending - " + scenario.getName());
        System.out.println("------------------------------");
    }


    @Given("^User is in Login Page$")
    public void user_is_in_Login_Page(){
        loginPage = new LoginPage();
        String pageTitle = loginPage.PageTitle();
        System.out.println("Login Page title is :" + pageTitle);
    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password(){
        homePage = loginPage.Login();
    }

    @Then("^User Navigates to Home Page$")
    public void user_Navigates_to_Home_Page(){
        String pageTitle = homePage.PageTitle();
        System.out.println("Home Page title is :" + pageTitle);
    }
}
