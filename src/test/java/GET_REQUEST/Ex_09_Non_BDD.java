package GET_REQUEST;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Ex_09_Non_BDD {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Test
    public void Testcase1(){
        String pincode ="560016";
         r = RestAssured.given();
         r.baseUri("https://api.zippopotam.us");
         r.basePath("/IN/" +pincode);

         response = r.when().log().all().get();
          vr = response.then().log().all().statusCode(200);
    }
    @Test
    public void Testcase2(){
        String pincode ="-1";
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" +pincode);

        response= r.when().log().all().get();

        vr= response.then().log().all().statusCode(404);
    }
}
