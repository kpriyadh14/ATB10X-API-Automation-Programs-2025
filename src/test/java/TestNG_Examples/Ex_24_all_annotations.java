package TestNG_Examples;

import org.testng.annotations.*;

public class Ex_24_all_annotations {
    @BeforeSuite
    void demo1()
    {
        System.out.println("read the data from Mysql");
    }

    @BeforeTest
    void demo2(){
        System.out.println("Data in Matrix, testcase before");
    }

    @BeforeClass
    void demo3(){
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void demo4(){
        System.out.println("BeforeMethod");
    }

    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterMethod
    void demo6(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    void demo7(){
        System.out.println("AfterClass");
    }

    @AfterTest
    void demo8(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    void demo9(){
        System.out.println("AfterSuite");
        System.out.println("Close everything, delete temp files");
    }
}
