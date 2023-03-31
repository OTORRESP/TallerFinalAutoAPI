package com.pe.screenplaybdd.endpoints;

public enum BDDEndpoints {
    Create_Token("/auth"),
    Create_Booking("/booking"),
    Update_Booking("/booking/{id}"),
    Delete_Booking("/booking/{id}"),
    Validate_Booking("/booking/{id}");

    private final String path;


    BDDEndpoints(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
