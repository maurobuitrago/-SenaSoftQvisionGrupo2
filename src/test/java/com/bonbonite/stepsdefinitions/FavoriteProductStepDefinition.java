package com.bonbonite.stepsdefinitions;

import com.bonbonite.navigation.NavegateTo;
import com.bonbonite.tasks.AddProductToTheFavoriteList;
import com.bonbonite.tasks.SelectProduct;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FavoriteProductStepDefinition {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("pablo");
    }
    @Given("that the user is viewing a product")
    public void thatTheUserIsViewingAProduct() {
        theActorInTheSpotlight().wasAbleTo(NavegateTo.theBonBoniteGoToAllProductsShoes());
    }
    @When("the user adds the product to the list of desired products")
    public void theUserAddsTheProductToTheListOfDesiredProducts() {
        theActorInTheSpotlight().attemptsTo(SelectProduct.inTheProductSection());
        theActorInTheSpotlight().attemptsTo(AddProductToTheFavoriteList.addProductToTheFavoriteList());
    }
    @Then("the user should see the product added in the product wish list section")
    public void theUserShouldSeeTheProductAddedInTheProductWishListSection() {

    }

}
