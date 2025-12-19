package GET_REQUEST;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Ex_08_GET_request_DBB {

    @Test
    public void Testcase1(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560016")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    public void Testcase2(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +"-1")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
