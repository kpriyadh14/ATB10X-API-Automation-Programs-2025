package priya.API.testing;

import io.restassured.RestAssured;

public class Ex01_RA_Basics {
    public static void main(String[] args) {
            // Gherkin syntax
            // Given= URL, headers, auth
            // When = http method, get,put ,post, delete
            // Then = validation = 200 ok

            // Full URL - https://api.zippopotam.us/IN/560016

            RestAssured.
                    given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/560016").
                    when()
                    .get()
                    .then().log().all().statusCode(200);
    }
}
