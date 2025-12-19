package DELETE_REQUEST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Ex_13_DELETE_request_NON_BDD {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void Testcase1() {
        String token = "9cc9447e730afc3";
        String booking_id = "794";
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + booking_id);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);

        response = r.when().delete();

        vr = response.then().log().all().statusCode(200);
    }
}
