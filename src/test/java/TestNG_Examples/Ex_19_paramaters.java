package TestNG_Examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex_19_paramaters {

    @Parameters("browser")
    @Test
    public void demo(String value){
        System.out.println("Demo 1 TC");

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Start the chrome browser");
        }
        if(value.equalsIgnoreCase("firebox")){
            System.out.println("Start the Firebox browser");
        }
    }
}
