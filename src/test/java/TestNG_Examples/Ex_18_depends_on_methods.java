package TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_18_depends_on_methods {
    @Test
    public void server_stack(){
        System.out.println("I will execute first");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "server_stack")
    public void method1(){
        System.out.println("Method1");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "server_stack")
    public void method2(){
        System.out.println("Method2");
        Assert.assertTrue(true);
    }

}
