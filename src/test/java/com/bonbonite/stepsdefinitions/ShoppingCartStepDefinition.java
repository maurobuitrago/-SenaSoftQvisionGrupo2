package com.bonbonite.stepsdefinitions;

import com.bonbonite.navigation.NavegateTo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ShoppingCartStepDefinition {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("pablo");
    }

    @Given("that the user is in the shoes products section")
    public void thatTheUserIsInTheShoesProductsSection() {
       theActorInTheSpotlight().wasAbleTo(NavegateTo.theBonBoniteGoToShoesProductsSection());
    }
    @When("add products to the shopping cart")
    public void addProductsToTheShoppingCart() {

    }
    @Then("the user should see the products in the shopping cart")
    public void theUserShouldSeeTheProductsInTheShoppingCart() {

    }
}
