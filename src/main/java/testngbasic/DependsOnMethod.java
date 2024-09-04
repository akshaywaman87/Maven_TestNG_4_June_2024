package testngbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test
    public void verifyLogin(){                  //parent method
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }
    @Test(dependsOnMethods = {"verifyLogin"}, alwaysRun = true)   //child method
    public void verifyHomePage(){
        System.out.println("Verify HomePage");
    }
    @Test
    public void verifySignup(){
        System.out.println("Verify SignUp");
    }
}
