package testngbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {

    @Test(groups = {"Smoke"})

    public void verifyAddToCard(){
        Assert.assertTrue(false);
        System.out.println("Verify Add To Card");
    }
    @Test(dependsOnGroups ={"Smoke"})
    public void verifyOrder(){
        System.out.println("Verify Order");
    }
    @Test
    public void verifyPayment(){
        System.out.println("Verify Payment");
    }
}
