package testng.parametrization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DataProviderWithExcel {

    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun() throws InterruptedException, IOException {

        Object[][] arrObj = getExcelData("C:\\Users\\dell\\Desktop\\DataProvider.xlsx", "testCase1");
        return arrObj;
    }

    public String[][] getExcelData(String filePath, String sheetName) throws InterruptedException, IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = wb.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfColumns = row.getLastCellNum();
        Cell cell;

        String[][] data = new String[noOfRows-1][noOfColumns];

        for (int i = 1; i<noOfRows; i++){
            for (int j = 0; j<noOfColumns; j++){

                row=sheet.getRow(i);
                cell =row.getCell(j);

                data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }

    @Test(dataProvider = "test-data")
    public void verifyDataProviderWithExcel (String courseName, String cityName) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
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

