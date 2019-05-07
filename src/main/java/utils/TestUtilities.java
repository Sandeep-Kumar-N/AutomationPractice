package utils;

import base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtilities extends TestBase {
    public static int PAGE_LOAD_TIMEOUT=60;
    public static int IMPLICIT_WAIT_TIMEOUT = 30;
    public static int EXPLICIT_VISIBILITY_TIMEOUT = 20;

    public static void MouseHover(WebElement element){

        boolean isElementPresent = WaitFOrElementsVisibility(element);

        if (isElementPresent==true) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
        }

    }

    public static boolean WaitFOrElementsVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,EXPLICIT_VISIBILITY_TIMEOUT);
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }

    public static void Wait_And_Click(WebElement element){
        if(WaitFOrElementsVisibility(element)==true){
            element.click();
        }
    }

    public static void Scroll_Into_View(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        System.out.println("Scrolled into view of :" + element.getText());
    }

    public static void SelectByIndex(WebElement element, int index){
        boolean isElementPresent = WaitFOrElementsVisibility(element);
        if (isElementPresent==true) {
            Select select = new Select(element);
            select.selectByIndex(index);
        }

    }

    public static void SelectByValue(WebElement element, String value){
        boolean isElementPresent = WaitFOrElementsVisibility(element);
        if (isElementPresent==true) {
            Select select = new Select(element);
            select.selectByValue(value);
        }

    }

    public static void SelectByText(WebElement element, String text){
        boolean isElementPresent = WaitFOrElementsVisibility(element);
        if (isElementPresent==true) {
            Select select = new Select(element);
            select.selectByVisibleText(text);
        }

    }

    public static void Select_CheckBox(WebElement element){
        if (element.isEnabled()==true){
            if (element.isSelected()==false){
                element.click();
            }
        }
    }

    public static void Un_Select_CheckBox(WebElement element){
        if (element.isEnabled()==true){
            if (element.isSelected()==true){
                element.click();
            }
        }
    }

}
