package testng.parametrization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

    WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod

    public void beforeMethodForCase(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please select the correct browser");
        }
    }

    @Parameters({"courseName", "cityName"})
    @Test()
    public void verifyParameterizationCases(String courseName, String cityName) throws InterruptedException {

        //WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));

        searchTextBox.sendKeys(courseName + " " + cityName);
        Thread.sleep(3000);

        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        driver.close();
    }
}

