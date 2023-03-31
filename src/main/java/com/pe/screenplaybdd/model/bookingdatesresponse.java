package com.pe.screenplaybdd.model;

public class bookingdatesresponse {

    private String checkin;
    private String checkout;

    public bookingdatesresponse(){}

    public bookingdatesresponse(String checkin, String checkout) {
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
