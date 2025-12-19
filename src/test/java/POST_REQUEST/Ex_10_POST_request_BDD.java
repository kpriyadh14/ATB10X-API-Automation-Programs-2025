package POST_REQUEST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Ex_10_POST_request_BDD {

    @Test
    public void Testcase1(){
        String paylod  =  "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured.given()
        .baseUri("https://restful-booker.herokuapp.com")
        .basePath("/auth")
        .contentType(ContentType.JSON)
        .log().all().body(paylod)
         .when().log().all().post()
                .then().log().all().statusCode(200);


    }
}
