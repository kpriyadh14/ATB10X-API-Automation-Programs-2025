package GSON;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


public class Ex_29_RA_GSON {


        RequestSpecification r;
        Response response;
        ValidatableResponse vr;
        @Test
   public void test_Create_Booking_Positive(){
        // GSON - is Google Lib - which will convert your class to JSON
        // JSON to class -
        // JSON - is a plain text in key and value pair to transfer from client to server.

        // Step1 - POST
        // URL -> Base URI + base Path
        // HEADER
        // BODY
        // Auth - NO

        // Step 2
        // prepare the Payload ( Object -> JSON String)
        // send the request

        //Step 3
        // Validate Response ( JSON String -> Object)
        // FirstName,
        // Status Code
        // Time Response

        Booking booking = new Booking();
        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("Breakfast");

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");

        Gson gson = new Gson();
        String jsonstringbooking = gson.toJson(booking);
        System.out.println(jsonstringbooking);

            // {"firstname":"Pramod","lastname":"Dutta","totalprice":112,"depositpaid":true,"bookingdates":{"checkin":"2024-02-01","checkout":"2024-02-01"},"additionalneeds":"Breakfast"}requestSpecification = RestAssured.given();
          r= RestAssured.given(); r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("booking");
        r.contentType(ContentType.JSON);
        r.body(jsonstringbooking).log().all();

            Response response = r.when().post();
            String jsonResponseString  = response.asString();

            vr = response.then().log().all();
        vr.statusCode(200);

        // Case1 - extract() - Direct Extraction
        String firstname1 = response.then().extract().path("booking.firstname");
        System.out.println(firstname1);

        Assert.assertEquals(firstname1,"Pramod");
        Assert.assertEquals(firstname1,"Pramod");

        assertThat(firstname1).isNotNull().isNotEmpty().isNotBlank().isEqualTo("Pramod");

        // Case 2 - jsonPath.getString("")  JSON Path Extraction
            JsonPath jsonPath = new JsonPath(response.asString());
            String bookingid = jsonPath.getString("bookingid");
            String firstname = jsonPath.getString("booking.firstname");
            String checkin =  jsonPath.getString("booking.bookingdates.checkin");
            System.out.println(bookingid);
            System.out.println(firstname);
            System.out.println(checkin);


            String jsonResponseString1  = response.asString();

            // Server - JSONString> Java Object( BookingResponse) - getter to verify
            // Case 3 - DeSer - Extraction
            //  Response - De Ser another Response Class

            Booking_response bookingResponse = gson.fromJson(jsonResponseString1,Booking_response.class);

            System.out.println(bookingResponse.getBookingid());
            System.out.println(bookingResponse.getBooking().getFirstname());
            System.out.println(bookingResponse.getBooking().getLastname());

            assertThat(bookingResponse.getBookingid()).isNotZero().isNotNull();
            assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo("Pramod").isNotNull().isNotEmpty();


        }

}
