package org.automatizacion.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GooglePage {

    public static final Target INPUT_SEARCH = Target.the("Input Search")
            .locatedBy("//input[@name='q']");

    public static final Target ENTER_FALABELLA = Target.the("Input Search")
            .locatedBy("//h3[contains(text(),'Lo encontr')]");



}
