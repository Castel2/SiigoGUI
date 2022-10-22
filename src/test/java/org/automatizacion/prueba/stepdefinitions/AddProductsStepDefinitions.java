package org.automatizacion.prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.attribute.AnnotationAppender;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.automatizacion.prueba.models.Account;
import org.automatizacion.prueba.interactions.NavigateTo;
import org.automatizacion.prueba.questions.ValidateProducts;
import org.automatizacion.prueba.tasks.AddProducts;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.automatizacion.prueba.utils.GeneralConstants.USER;

public class AddProductsStepDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(USER);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }

    @Given("^that the user navigates to the falabella page$")
    public void userLogsInTheWhitCredentials() {
        OnStage.theActorInTheSpotlight().wasAbleTo(NavigateTo.site());
    }

    @When("^looking for the (.*) fridge to buy$")
    public void selectProductFrom(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProducts.buyItem(item));
    }

    @Then("^it is validated that the purchase price is correct$")
    public void viewTheProductInTheShoppingCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateProducts.checkBuy()));
    }


}
