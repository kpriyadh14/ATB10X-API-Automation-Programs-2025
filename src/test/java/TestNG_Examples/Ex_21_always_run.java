package TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_21_always_run {

    @Test(enabled = false)
    public void test1(){
        Assert.assertTrue(true);
    }
    @Test(alwaysRun = true, enabled = false)
    public void test2(){
        Assert.assertTrue(true);
    }
    @Test
    public void test3(){
        Assert.assertTrue(true);
    }
}
