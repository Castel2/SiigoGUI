package org.automatizacion.prueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static org.automatizacion.prueba.userinterfaces.GooglePage.ENTER_FALABELLA;
import static org.automatizacion.prueba.userinterfaces.GooglePage.INPUT_SEARCH;
import static org.automatizacion.prueba.utils.GeneralConstants.NAME_PAGE;
import static org.automatizacion.prueba.utils.GeneralConstants.URL;

public class NavigateTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL),
                Enter.keyValues(NAME_PAGE).into(INPUT_SEARCH).thenHit(Keys.ENTER),
                Click.on(ENTER_FALABELLA));
    }

    public static NavigateTo site() {
        return Tasks.instrumented(NavigateTo.class);
    }

}
