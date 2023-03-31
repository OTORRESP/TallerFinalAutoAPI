package com.pe.screenplaybdd.model;

public class BookResponse {

    private int bookingid;

    private bookingresponse Bookingresponse;

    private bookingdates Bookingdates;

    public BookResponse(){}

    public BookResponse(int bookingid, bookingresponse bookingresponse, bookingdates bookingdates) {
        this.bookingid = bookingid;
        Bookingresponse = bookingresponse;
        Bookingdates = bookingdates;
    }

    public int getBookingid() {
        return bookingid;
    }

    public bookingresponse getBookingresponse() {
        return Bookingresponse;
    }

    public bookingdates getBookingdates() {
        return Bookingdates;
    }
}
