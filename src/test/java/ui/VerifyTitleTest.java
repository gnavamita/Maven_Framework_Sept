package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleTest extends CommonDataSetup {

    @Test
    public void titleTest() {
        SoftAssert softassert = new SoftAssert();
        String expectedtitle = "xyzElectronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedtext = "Searchxyz";
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.com/");
        String actualtile = driver.getTitle();
        System.out.println("verifying title ");
        softassert.assertEquals(actualtile,expectedtitle);
        String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]")).getAttribute("value");

        softassert.assertEquals(expectedtext, actualtext, "text verification failed");
        System.out.println("closing browser");
        driver.close();
        softassert.assertAll();
    }
}
