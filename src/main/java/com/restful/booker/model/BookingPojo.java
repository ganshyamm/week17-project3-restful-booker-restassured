package com.restful.booker.model;

import java.util.HashMap;
import java.util.List;

public class BookingPojo {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private Integer totalPrice;
    private boolean depositPaid;
    private List<String> bookingDates;
    private String additionalNeeds;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDepositPaid() {
        return depositPaid;
    }

    public void setDepositPaid(boolean depositPaid) {
        this.depositPaid = depositPaid;
    }


    public List<String> getBookingdates(List<String> bookingdate) {
        return bookingdate;
    }

    public void setBookingdates(List<String> bookingdates) {
        this.bookingDates = bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalNeeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalNeeds = additionalneeds;
    }
}
