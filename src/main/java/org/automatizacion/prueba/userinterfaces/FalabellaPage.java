package org.automatizacion.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FalabellaPage {

    public static final Target INPUT_SEARCH_FALABELLA = Target.the("Input Search Falabella")
            .locatedBy("//input[contains(@placeholder,' buscas?')]");

    public static final Target SELECT_ITEM = Target.the("Select item")
            .locatedBy("//b[contains(text(),'{0}')]");

    public static final Target BUTTON_BUY = Target.the("Button buy")
            .locatedBy("//button[text()='Agregar a la Bolsa']");

    public static final Target LOOK_BUY = Target.the("Look buy")
            .locatedBy("//a[@id='linkButton']");

    public static final Target BUTTON_AMOUNT = Target.the("Additional amount")
            .locatedBy("//button[@title='Aumentar la cantidad']");

    public static final Target ACTIVE_DROPDOWN = Target.the("Active Warranty")
            .locatedBy("//span[text()='No, gracias']");

    public static final Target DROPDOWN_WARRANTY = Target.the("Select Warranty")
            .locatedBy("//a[contains(text(),'1 a')]");

    public static final Target BUY = Target.the("Buy")
            .locatedBy("//button[text()='Ir a comprar']");

    public static final Target FINAL_PRICE = Target.the("Final Price")
            .locatedBy("//div[@class='fb-pod__prices'][1]");

    public static final Target WARRANTY_PRICE = Target.the("Warranty Price")
            .locatedBy("//span[contains(text(),'1 a')]");

    public static final Target PRICE = Target.the("Price")
            .locatedBy("//li[contains(@class,'fbra')]/span[2]");



}
