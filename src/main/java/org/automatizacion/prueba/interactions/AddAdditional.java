package org.automatizacion.prueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static org.automatizacion.prueba.userinterfaces.FalabellaPage.*;
import static org.automatizacion.prueba.userinterfaces.FalabellaPage.BUTTON_AMOUNT;

public class AddAdditional implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(ACTIVE_DROPDOWN, WebElementStateMatchers.isClickable()),
                Click.on(ACTIVE_DROPDOWN),
                WaitUntil.the(DROPDOWN_WARRANTY, WebElementStateMatchers.isClickable()),
                Scroll.to(DROPDOWN_WARRANTY),
                Click.on(DROPDOWN_WARRANTY),
                WaitUntil.the(BUTTON_AMOUNT, WebElementStateMatchers.isClickable()),
                Click.on(BUTTON_AMOUNT));
    }

    public static AddAdditional add() {
        return Tasks.instrumented(AddAdditional.class);
    }
}
