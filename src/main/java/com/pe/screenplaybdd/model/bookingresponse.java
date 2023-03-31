package com.pe.screenplaybdd.model;

public class bookingresponse {

    private String firstname;
    private String lastname;
    private String totalprice;
    private String depositpaid;

    public bookingresponse(){}

    public bookingresponse(String firstname, String lastname, String totalprice, String depositpaid) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
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
}
