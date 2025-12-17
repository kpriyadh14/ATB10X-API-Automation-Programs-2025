package GET_REQUEST;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Ex_07_GET_request {
    @Test
    public void Testcase1() {
        String pincode = "560016";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560016")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
