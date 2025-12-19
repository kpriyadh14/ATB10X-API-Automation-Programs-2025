package Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
//Need to add this for AssertJ
import static org.assertj.core.api.Assertions.*;

public class Ex_28_AssertJ_Assertions {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String token;
    Integer bookingId;

    @Test
    public void testcase1() {
        String payloadput = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("/booking");
        r.contentType(ContentType.JSON);
        r.body(payloadput).log().all();

        response = r.when().put();

        vr = response.then().log().all().statusCode(200);

//        vr.body("booking.firstname", Matchers.equalTo("Pramod"));
//        vr.body("booking.lastname", Matchers.equalTo("Dutta"));
//        vr.body("booking.depositpaid", Matchers.equalTo(false));
//        vr.body("bookingid", Matchers.notNullValue());

        bookingId= response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        Assert.assertNotNull(bookingId);
        Assert.assertEquals("firstname","Pramod");
        Assert.assertEquals("lastname","Dutta");

        // AssertJ
       assertThat(bookingId).isNotNull().isNotNegative().isPositive();
       assertThat(firstname).isEqualTo("Pramod").isNotNull();


    }
}
