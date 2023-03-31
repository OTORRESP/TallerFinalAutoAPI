package com.pe.screenplaybdd.questions;

import com.pe.screenplaybdd.endpoints.BDDEndpoints;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.RestQuestionBuilder;

public class TheBooking {
    public static Question<String> theValueidbooking(Integer idbooking) {

        return new RestQuestionBuilder<String>().about("Cash account balance")
                .to(BDDEndpoints.Validate_Booking.getPath())
                .with(request -> request.given().log().all().pathParam("id", idbooking))
                .returning(response -> response.then().log().all().extract().path("firstname"));

    }
}
