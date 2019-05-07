package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtilities;

public class HomePage extends TestBase {

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a[@title='Women']")
    WebElement lnkWomen;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a[@title='Dresses']")
    WebElement lnkDresses;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a[@title='T-shirts']")
    WebElement lnkTshirts;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a[@title='T-shirts']")
    WebElement lnkTopsTshirts;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[2]/a[@title='Blouses']")
    WebElement lnkTopsBlouses;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a[@title='Casual Dresses']")
    WebElement lnkCasualDress;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a[@title='Evening Dresses']")
    WebElement lnkEveningDress;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a[@title='Summer Dresses']")
    WebElement lnkSummerDress;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public BlousesPage Navigate_To_Blouses_Page(){
        TestUtilities.MouseHover(lnkWomen);
        lnkTopsBlouses.click();
        return new BlousesPage();
    }

    public CasualDressPage Navigate_To_CasualDress_Page(){
        TestUtilities.MouseHover(lnkDresses);
        lnkCasualDress.click();
        return new CasualDressPage();
    }

    public EveningDressPage Navigate_To_EveningDress_Page(){
        TestUtilities.MouseHover(lnkDresses);
        lnkEveningDress.click();
        return new EveningDressPage();
    }

    public SummerDressPage Navigate_To_SummerDress_Page(){
        TestUtilities.MouseHover(lnkDresses);
        lnkSummerDress.click();
        return new SummerDressPage();
    }

    public TShirtPage Navigate_To_TShirt_Page(){
        lnkTshirts.click();
        return new TShirtPage();
    }

    public TShirtPage Navigate_To_Women_TShirt_Page(){
        TestUtilities.MouseHover(lnkWomen);
        lnkTopsTshirts.click();
        return new TShirtPage();
    }



    public String PageTitle(){
        return driver.getTitle();
    }
}
