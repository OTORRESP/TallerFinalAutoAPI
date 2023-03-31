package com.pe.screenplaybdd.model;

public class Book {

    private final String firstname;
    private final String lastname;
    private final String totalprice;
    private final String depositpaid;
    private bookingdates Bookingdates;
    private final String additionalneeds;

    public Book(){}

    public Book(String firstname, String lastname, String totalprice, String depositpaid, bookingdates bookingdates, String additionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        Bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public String getDepositpaid() {
        return depositpaid;
    }

    public bookingdates getBookingdates() {
        return Bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }
}
