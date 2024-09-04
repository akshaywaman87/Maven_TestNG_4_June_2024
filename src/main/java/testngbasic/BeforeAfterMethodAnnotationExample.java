package testngbasic;

import org.testng.annotations.*;

public class BeforeAfterMethodAnnotationExample {

    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before Class Example");
    }
    @AfterClass
    public void afterClassExample(){
        System.out.println("After Class Example");
    }
    @BeforeMethod
    public void beforeMethodDemo(){
        System.out.println("Before Method Demo");
    }
    @AfterMethod
    public void afterMethodDemo(){
        System.out.println("After Method Demo");
    }
    @Test(enabled = false)
    public void verifyMethod_1(){
        System.out.println("Verify Method 1");
    }
    @Test
    public void verifyMethod_2(){
        System.out.println("Verify Method 2");
    }
    @Test
    public void verifyMethod_3(){
        System.out.println("Verify Method 3");
    }
}
