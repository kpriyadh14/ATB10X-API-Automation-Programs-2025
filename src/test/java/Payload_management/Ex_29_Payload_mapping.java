package Payload_management;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex_29_Payload_mapping {

    //RequestSpecification requestSpecification;
    //ValidatableResponse validatableResponse;
   // Response response;
    String token;
    Integer bookingId;
    @Test
    public void Test1(){
        //        String payload_POST = "{\n" +
//                "        \"checkin\" : \"2024-01-01\",\n" +
//                "        \"checkout\" : \"2024-01-01
//                "    \"firstname\" : \"Pramod\",\n" +
//                "    \"lastname\"  : {\n" +: \"Dutta\",\n" +
////                "    \"totalprice\" : 111,\n" +
////                "    \"depositpaid\" : false,\n" +
////                "    \"bookingdates\"\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Lunch\"\n" +
//                "}";

        Map<String,Object> jsonBodyusingMap= new LinkedHashMap<>();
        jsonBodyusingMap.put("firstname","Pramod");
        jsonBodyusingMap.put("lastname","Dutta");
        jsonBodyusingMap.put("totalprice", 123);
        jsonBodyusingMap.put("depositpaid", false);

        Map<String,Object> bookingdatesmap = new LinkedHashMap<>();
        bookingdatesmap.put("checkin","2018-01-01");
        bookingdatesmap.put("checkout","2019-01-01");

        jsonBodyusingMap.put("bookingdates",bookingdatesmap);
        jsonBodyusingMap.put("additionalneeds", "Breakfast");
        System.out.println( jsonBodyusingMap);


    }
}
