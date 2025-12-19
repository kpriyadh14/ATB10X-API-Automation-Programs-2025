package TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_22_innovacation_count {
    @Test(invocationCount = 3)
    public void Test1(){
        Assert.assertTrue(true);
    }
}
