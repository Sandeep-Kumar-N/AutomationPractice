package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.TestUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties properties;

    public TestBase(){
        try {
            properties = new Properties();
            FileInputStream proppath = new FileInputStream("src/main/java/config/config.properties");
            properties.load(proppath);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void Initialization(){
        String browser = properties.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\sande\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("ff")){
            System.setProperty("webdriver.gecko.driver",
                    "C:\\Users\\sande\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(TestUtilities.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtilities.IMPLICIT_WAIT_TIMEOUT,TimeUnit.SECONDS);
        driver.get(properties.getProperty("url"));
    }

    public void TearDown(){
        driver.close();
    }
}
