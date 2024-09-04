package testngbasic;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void testCaseZ(){
        System.out.println("Test Case Z");
    }

    @Test(priority = 2)
    public void testCaseM(){
        System.out.println("Test Case M");
    }

    @Test(priority = 3)
    public void testCaseH(){
        System.out.println("Test Case H");
    }

    @Test(priority = 4)
    public void testCaseA(){
        System.out.println("Test Case A");
    }

    @Test(priority = 5)
    public void testCaseN(){
        System.out.println("Test Case N");
    }
    @Test(priority = 6)
    public void testCaseP(){
        System.out.println("Test Case P");
    }
    @Test(priority = 7)
    public void testCaseR(){
        System.out.println("Test Case R");
    }
}
