package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtilities;

import java.sql.Driver;
import java.util.List;

public class TShirtPage extends TestBase {

    @FindBy(xpath = "//*[@id='center_column']/ul//li")
    List<WebElement> itemsList;

    @FindBy(xpath = "//label/a[text()='S']/parent::label/preceding-sibling::div/span/input")
    WebElement sizeSmall;

    @FindBy(xpath = "//label/a[text()='M']/parent::label/preceding-sibling::div/span/input")
    WebElement sizeMedium;

    @FindBy(xpath = "//label/a[text()='L']/parent::label/preceding-sibling::div/span/input")
    WebElement sizeLarge;

    @FindBy(xpath = "//label/a[text()='Orange']/parent::label/preceding-sibling::input")
    WebElement colorOrange;

    @FindBy(xpath = "//label/a[text()='Blue']/parent::label/preceding-sibling::input")
    WebElement colorBlue;

    @FindBy(xpath = "//label/a[text()='Cotton']/parent::label/preceding-sibling::div/span/input")
    WebElement compositionsCotton;

    @FindBy(xpath = "//label/a[text()='Casual']/parent::label/preceding-sibling::div/span/input")
    WebElement style_Casual;

    @FindBy(xpath = "//label/a[text()='Short Sleeve']/parent::label/preceding-sibling::div/span/input")
    WebElement short_Sleeves;

    @FindBy(xpath = "//label/a[text()='In stock']/parent::label/preceding-sibling::div/span/input")
    WebElement inStock;

    @FindBy(xpath = "//label/a[text()='Fashion Manufacturer']/parent::label/preceding-sibling::div/span/input")
    WebElement fashion_Manufacturer;

    @FindBy(xpath = "//label/a[text()='New']/parent::label/preceding-sibling::div/span/input")
    WebElement condition_New;

    @FindBy(id="selectProductSort")
    WebElement productSort;

    @FindBy(xpath = "//span[text()='Add to cart']")
     WebElement addToCart;

    @FindBy(xpath = "//span[@title='Continue shopping']")
    WebElement continueShopping;


    TShirtPage (){
        PageFactory.initElements(driver,this);
    }

    public String PageTitle(){
        return driver.getTitle();
    }

    public void Update_Catalog(String size, String color, String composition, String style, String properties,
                               String availability, String manufacturer, String condition){

        if (size.equalsIgnoreCase("S")){
            TestUtilities.Select_CheckBox(sizeSmall);
        }else {
            TestUtilities.Un_Select_CheckBox(sizeSmall);
        }
        if (size.equalsIgnoreCase("M")){
            TestUtilities.Select_CheckBox(sizeMedium);
        }else {
            TestUtilities.Un_Select_CheckBox(sizeMedium);
        }
        if (size.equalsIgnoreCase("L")){
            TestUtilities.Select_CheckBox(sizeLarge);
        }else {
            TestUtilities.Un_Select_CheckBox(sizeLarge);
        }

        String xpath = "//label/a[text()='" +color+ "']/parent::label/preceding-sibling::input";
        WebElement colorElement = driver.findElement(By.xpath(xpath));
        TestUtilities.Select_CheckBox(colorElement);

        if (composition.equalsIgnoreCase("Cotton")) {
            TestUtilities.Select_CheckBox(compositionsCotton);
        }

        if (style.equalsIgnoreCase("Casual")){
            TestUtilities.Select_CheckBox(style_Casual);
        }

        if (properties.equalsIgnoreCase("Short Sleeve")){
            TestUtilities.Select_CheckBox(short_Sleeves);
        }

        if (availability.equalsIgnoreCase("In Stock")) {
            TestUtilities.Select_CheckBox(inStock);
        }

        if (manufacturer.equalsIgnoreCase("Fashion Manufacturer")){
            TestUtilities.Select_CheckBox(fashion_Manufacturer);
        }

        if (condition.equalsIgnoreCase("New")) {
            TestUtilities.Select_CheckBox(condition_New);
        }

    }

    public void Add_All_Items_To_Cart(){
        int itemCount = itemsList.size();

        for (int i=1; i< itemCount; i++){
            TestUtilities.MouseHover(itemsList.get(i));
            TestUtilities.Wait_And_Click(addToCart);
            TestUtilities.Wait_And_Click(continueShopping);
        }
    }



}
