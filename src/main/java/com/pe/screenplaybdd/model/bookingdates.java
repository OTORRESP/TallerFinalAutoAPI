package com.pe.screenplaybdd.model;

public class bookingdates {

    private String checkin;
    private String checkout;

    public bookingdates(){}

    public bookingdates(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }
}
