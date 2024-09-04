package testngbasic;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class needOfTestNG {

    @Test
    public void openTCSUrl() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void openAmazonUrl() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void openCampusCoffeeUrl() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://camposcoffee.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
