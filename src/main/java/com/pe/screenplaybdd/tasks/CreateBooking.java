package com.pe.screenplaybdd.tasks;

import com.pe.screenplaybdd.model.Book;
import com.pe.screenplaybdd.model.BookResponse;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;

import static com.pe.screenplaybdd.endpoints.BDDEndpoints.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CreateBooking implements Task {

    private final Book book;
    private final BookResponse bookResponse;

    public CreateBooking(Book book, BookResponse bookResponse) { this.book = book;
        this.bookResponse = bookResponse;
    }

    public static Performable asNewBooking(Book book) { return instrumented(CreateBooking.class, book);}
    @Override
    @Step("{0} registers a client #book")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(Create_Booking.getPath()).with(request -> request.given().log().all()
                .header("Content-Type", "application/json")
                .body(book)));
        if (SerenityRest.lastResponse().statusCode() == 200) {
            SerenityRest.then().log().all();
            System.out.println(bookResponse.getBookingid()+"======================");
            actor.remember("bookingid", bookResponse.getBookingid());
        }
    }

}
