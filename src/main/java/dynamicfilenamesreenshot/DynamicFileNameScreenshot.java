package dynamicfilenamesreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DynamicFileNameScreenshot {


    public static void main(String[] args) throws IOException {
       /* ChromeOptions options =new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);*/

            WebDriver driver = new ChromeDriver();   //UpCasting  //created object of child class and refering parent class
            driver.get("https://www.zudio.com/collections/men");
            driver.manage().window().maximize();

            File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Takes screenshot
           // FileHandler.copy(f, new File("C:\\Users\\dell\\Desktop\\Screenshot 2024-08-26 162825.png"));
            File dest = new File("C:\\Users\\dell\\Desktop\\Screenshot 2024-08-26 1628252024-22-27 17-22-58"+ timesstamp()+".png ");
            FileUtils.copyFile(f, dest);   //Copy the screenshot at specified locations

            driver.close();
        }
        public static String timesstamp (){
            return new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
        }
    }
