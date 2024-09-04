package testng.rerunfailscript;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailScriptExample {

    @Test
    public void testCaseDemo_1(){
        System.out.println("Test Case Demo 1");
    }

    @Test
    public void testCaseDemo_2(){
        Assert.assertTrue(false);
        System.out.println("Test Case Demo 2");
    }

    @Test
    public void testCaseDemo_3(){
        Assert.assertTrue(false);
        System.out.println("Test Case Demo 3");
    }

    @Test
    public void testCaseDemo_4(){
        System.out.println("Test Case Demo 4");
    }

    @Test
    public void testCaseDemo_5(){
        System.out.println("Test Case Demo 5");
    }
}
