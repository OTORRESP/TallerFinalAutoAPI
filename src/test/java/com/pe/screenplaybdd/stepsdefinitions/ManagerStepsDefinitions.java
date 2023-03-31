package com.pe.screenplaybdd.stepsdefinitions;

import com.pe.screenplaybdd.model.Book;
import com.pe.screenplaybdd.model.bookingdates;
import com.pe.screenplaybdd.questions.TheBooking;
import com.pe.screenplaybdd.tasks.CreateBooking;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.List;
import java.util.Map;

public class ManagerStepsDefinitions {

    EnvironmentVariables environmentVariables;
    private Book book;


    @Given("^el owner con los siguiente detalles$")
    public void elownerconlossiguientedetalles(List<Map<String, String>> listOfData){
        bookingdates Bookdate = new bookingdates(listOfData.get(Integer.parseInt("checkin")).toString(), listOfData.get(Integer.parseInt("checkout")).toString());
        theActorCalled("owner").whoCan(CallAnApi.at(EnvironmentSpecificConfiguration.
                from(environmentVariables).getProperty("url")));
        Map<String, String> userData = listOfData.get(0);
        this.book = new Book(userData.get("firstname"),userData.get("lastname"),
                userData.get("totalprice"), userData.get("depositpaid"),
                Bookdate, userData.get("additionalneeds"));
    }

    @When("^el owner registra el booking$")
    public void elOwnerRegistraElBooking() {
        theActorInTheSpotlight().attemptsTo(CreateBooking.asNewBooking(this.book));
    }

    @Then("^el owner valida el booking$")
    public void elOwnerValidaElBooking(String Idbooking) {
        Integer BookingRegistred = theActorInTheSpotlight().recall("bookingid");
        theActorInTheSpotlight().should(seeThat(TheBooking.theValueidbooking(BookingRegistred), is(equalTo(Idbooking))));
    }


    @Given("^el owner con los siguiente detalles actualizados$")
    public void elOwnerConLosSiguienteDetallesActualizados() {
        
    }

    @When("^el owner actualiza el booking$")
    public void elOwnerActualizaElBooking() {
        
    }

    @Then("^el usuario valida sus datos actualizados$")
    public void elUsuarioValidaSusDatosActualizados() {
    }


    @Given("^el owner con el siguiente detalle$")
    public void elOwnerConElSiguienteDetalle() {

    }

    @When("^el owner elimina el booking$")
    public void elOwnerEliminaElBooking() {
    }

    @Then("^el owner validac la eliminación$")
    public void elOwnerValidacLaEliminación() {
    }
}
