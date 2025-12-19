package TestNG_Allure_report;


import io.restassured.RestAssured;

import org.testng.annotations.Test;

public class Ex_06_TestNG {

    @Test
     public void test_GET_positive_TC1(){
         RestAssured
                 .given()
                 .baseUri("https://api.zippopotam.us")
                 .basePath("/IN/110048")
                 .when()
                 .get()
                 .then()
                 .log().all().statusCode(200);
     }

     @Test
    public void test_GET_Negative_TC2(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+"-1")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    public void test_GET_Negative_TC3(){

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+"$")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }


    }

