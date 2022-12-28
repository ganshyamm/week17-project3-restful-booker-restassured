package com.restful.booker.crudetest;


import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class UserBookingGetTest extends TestBase {
    @Test
    public void getAllBookingInfo() {
        Response response = given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }
//    @Test
//    public void getSingleBookingRecordInfo(){
//        Response response = given()
//                .when()
//                .get("/booking/20");
//        response.then().statusCode(200);
//        response.prettyPrint();
//    }

}

