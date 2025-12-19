package TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_17_groups {

    //sanity = 1;
    //reg = 3;
    //P1 = 1
    @Test(groups = {"sanity","reg"},priority = 1)

    public void test_sanity(){
        System.out.println("Sanity");
        Assert.assertTrue(true);
    }
    @Test(groups = {"p1","reg"},priority = 2)

    public void test_smoke(){
        System.out.println("Smoke");
        Assert.assertTrue(true);
    }

    @Test(groups = {"p1","reg"}, priority =-1)

    public void test_regression(){
    System.out.println("Regression");
   }

}