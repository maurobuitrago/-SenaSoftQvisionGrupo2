package com.bonbonite.stepsdefinitions;

import com.bonbonite.UI.CartSectionPage;
import com.bonbonite.navigation.NavegateTo;
import com.bonbonite.questions.CartSectionCompare;
import com.bonbonite.questions.LoginAndRegisterCompare;
import com.bonbonite.tasks.AddProductToTheShoppingCart;
import com.bonbonite.tasks.DeleteProduct;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingCartStepDefinition {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("pablo");
    }
    @After
    public void delete(){
        theActorInTheSpotlight().attemptsTo(NavegateTo.theBonBoniteGoToCartList());
        theActorInTheSpotlight().attemptsTo(DeleteProduct.delete());
    }

    @Given("that the user is in the shoes products section")
    public void thatTheUserIsInTheShoesProductsSection() {
       theActorInTheSpotlight().wasAbleTo(NavegateTo.theBonBoniteGoToAllProductsShoes());
    }
    @When("add products to the shopping cart")
    public void addProductsToTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(AddProductToTheShoppingCart.addProductShoppingCart());
    }
    @Then("the user should see the products in the shopping cart")
    public void theUserShouldSeeTheProductsInTheShoppingCart(Map<String,String>compare) {
        theActorInTheSpotlight().should(
                seeThat("the displayed product name in the section cart", CartSectionCompare.lblProduct(), equalTo(compare.get("product_name"))),
                seeThat("the displayed product name in the section cart", CartSectionCompare.boolProduct(compare), equalTo(Boolean.TRUE))

        );
    }

}
