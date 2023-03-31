package com.pe.screenplaybdd.tasks;

import jdk.nashorn.internal.parser.Token;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;

import static com.pe.screenplaybdd.endpoints.BDDEndpoints.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateToken {
/*
    private final Token token;

    public CreateToken(Token token) {
        this.token = token;
    }

    public static Performable NewToken(Token token) {
        return instrumented(CreateToken.class, token);
    }

    @Override
    @Step("{0} registers a client #user")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(Create_Token.getPath()).with(request -> request.given().log().all()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(token)));

        if (SerenityRest.lastResponse().statusCode() == 200) {
            SerenityRest.then().log().all();
            System.out.println(token.get()+"======================");
            actor.remember("userName", token.getClass());
        }
    }

 */
}
