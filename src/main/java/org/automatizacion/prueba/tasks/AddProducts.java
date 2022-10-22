package org.automatizacion.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.automatizacion.prueba.interactions.AddAdditional;
import org.openqa.selenium.Keys;

import static org.automatizacion.prueba.userinterfaces.FalabellaPage.*;
import static org.automatizacion.prueba.utils.GeneralConstants.ITEM;
import static org.automatizacion.prueba.utils.KeysActors.PRICE_ITEM;
import static org.automatizacion.prueba.utils.KeysActors.PRICE_WARRANTY;

public class AddProducts implements Task {

    public String item;

    public AddProducts(String item) {
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(ITEM, item);
        actor.attemptsTo(Enter.keyValues(item).into(INPUT_SEARCH_FALABELLA).thenHit(Keys.ENTER),
                WaitUntil.the(SELECT_ITEM.of(item), WebElementStateMatchers.isClickable()),
                Click.on(SELECT_ITEM.of(item)),
                WaitUntil.the(BUTTON_BUY, WebElementStateMatchers.isClickable()),
                Click.on(BUTTON_BUY),
                WaitUntil.the(LOOK_BUY, WebElementStateMatchers.isClickable()),
                Click.on(LOOK_BUY));
        actor.attemptsTo(AddAdditional.add());
        actor.remember(PRICE_ITEM, Text.of(FINAL_PRICE).viewedBy(actor).asString());
        actor.remember(PRICE_WARRANTY, Text.of(WARRANTY_PRICE).viewedBy(actor).asString());
        actor.attemptsTo(
                WaitUntil.the(BUY, WebElementStateMatchers.isVisible()),
                Click.on(BUY));
    }

    public static AddProducts buyItem(String item) {
        return Tasks.instrumented(AddProducts.class, item);
    }


}
