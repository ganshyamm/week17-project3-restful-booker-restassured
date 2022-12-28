package com.restful.booker.crudetest;


;
import com.restful.booker.model.BookingPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class UserBookingPatchTest extends TestBase {



    @Test
            public void patchRecord(){
        List<String> bookingDates =new ArrayList<>();
        bookingDates.add("2018-01-16");
        bookingDates.add("2019-01-16");
        RestAssured.basePath = "/booking";

        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstName("Prime");
        bookingPojo.setLastName("Testing");
        bookingPojo.setTotalPrice(111);
        bookingPojo.setDepositPaid(true);
        bookingPojo.setAdditionalneeds("Breakfast");
        Response response = given().log().all()
                .header("content-Type", "application/json")
                .when()
                .body(bookingPojo)
                .put();
        response.prettyPrint();
        response.then().log().all().statusCode(200);

    }
}


