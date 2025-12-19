package POST_REQUEST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Ex_11_POST_request_NON_BDD {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Test
    public void Testcase1(){
        String paylod  =  "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        System.out.println("Part1");

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(paylod).log().all();

        System.out.println("Part2");
        response = r.when().log().all().post();

        System.out.println("Part 3");
        vr = response.then().log().all().statusCode(200);


    }
}
