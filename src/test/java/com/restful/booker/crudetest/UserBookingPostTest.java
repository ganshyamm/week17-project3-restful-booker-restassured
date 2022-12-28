package com.restful.booker.crudetest;


import com.restful.booker.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

;import static io.restassured.RestAssured.given;

public class UserBookingPostTest extends TestBase {
    @Test
    public void postBooking() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RestAssured.basePath = "/auth";
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(payload)
                .post();
                //.post("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }


    }
