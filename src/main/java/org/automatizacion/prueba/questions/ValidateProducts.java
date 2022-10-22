package org.automatizacion.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static org.automatizacion.prueba.userinterfaces.FalabellaPage.PRICE;
import static org.automatizacion.prueba.utils.KeysActors.PRICE_ITEM;
import static org.automatizacion.prueba.utils.KeysActors.PRICE_WARRANTY;
import static org.automatizacion.prueba.utils.Utils.extracPrice;

public class ValidateProducts implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        int total = (extracPrice(actor.recall(PRICE_ITEM).toString()) + extracPrice(actor.recall(PRICE_WARRANTY).toString())) * 2;
        return total == Integer.parseInt(Text.of(PRICE).viewedBy(actor).asString().replace("$","").replace(".",""));
    }

    public static ValidateProducts checkBuy() {
        return new ValidateProducts();
    }
}
