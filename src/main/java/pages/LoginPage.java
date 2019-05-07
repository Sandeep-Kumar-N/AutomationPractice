package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='email']")
    WebElement UserID;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement Password;

    @FindBy(id="SubmitLogin")
    WebElement SubmitBtn;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public HomePage Login(){
        UserID.sendKeys(properties.getProperty("username"));
        Password.sendKeys(properties.getProperty("password"));
        SubmitBtn.click();
        return new HomePage();
    }

    public String PageTitle(){
        return driver.getTitle();
    }

}
