package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public static WebDriver driver;

    @BeforeSuite
    public void launchBrowser(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

    }

    @AfterSuite
    public void closingBrowser(){
        driver.close();

    }
}
