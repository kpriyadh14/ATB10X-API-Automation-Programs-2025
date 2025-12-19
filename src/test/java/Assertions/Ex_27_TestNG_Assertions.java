package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ex_27_TestNG_Assertions {
    @Test
    public void hard_assertions(){
        System.out.println("Start the program");
        Assert.assertEquals("priya","Priya");
        System.out.println("End of the program");
    }
   @Test
   public void soft_assertions(){
       SoftAssert softAssert = new SoftAssert();
       softAssert.assertTrue(false);
       System.out.println("Continue the program");
       softAssert.assertAll();

   }
}
