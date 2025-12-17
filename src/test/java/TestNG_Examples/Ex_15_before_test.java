package TestNG_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex_15 {
    // 1. Get token
    // 2. get booking ID
    // 3. test PUT
    // 4. Close all things

    @BeforeTest
    public void get_token(){
        System.out.println("1");
    }
    @BeforeTest
    public void get_booking_id(){
        System.out.println("2");
    }
    @Test
    public void PUT(){
        System.out.println("3");
    }
    @AfterTest
    public void close_all_things(){
        System.out.println("close");
    }
}
