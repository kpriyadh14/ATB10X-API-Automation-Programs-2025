package TestNG_Examples;

import org.testng.annotations.Test;

public class Ex_16_priority {
    @Test(priority = 1)
    public void Test1(){

    }
    @Test(priority = 3)
    public void Test2(){

    }
    @Test(priority = 2)
    public void Test3(){

    }
    @Test(priority = 4)
    public void Test4(){

    }
}
