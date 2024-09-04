package testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HardAssertExample {

    @Test
    public void verifyHardAssertCase(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        String text = driver.findElement(By.xpath("//td[text() = 'Create a Rediffmail account']")).getText();
        Assert.assertEquals(text, "create a Rediffmail account", "Text should be matched");
        System.out.println("Welcome!");
        driver.close();

    }
}
