package testngbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {

    public WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethodExample() {
            driver.close();
        }

    @Test
    public void verifyOpenTCSUrl() {
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyopenAmazonUrl() {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }
    @Test
    public void verifyopenCampusCoffeeUrl() {
        driver.get("https://camposcoffee.com/");
        driver.manage().window().maximize();
    }
}
