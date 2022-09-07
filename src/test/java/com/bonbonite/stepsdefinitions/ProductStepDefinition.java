package com.bonbonite.stepsdefinitions;

import com.bonbonite.navigation.NavegateTo;
import com.bonbonite.questions.MyAccountCompare;
import com.bonbonite.questions.ProductViewCompare;
import com.bonbonite.tasks.SelectProduct;
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

public class ProductStepDefinition {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("pablo");
    }
    @Given("that the user is in the products section")
    public void thatTheUserIsInTheProductsSection() {
        theActorInTheSpotlight().wasAbleTo(NavegateTo.theBonBoniteGoToShoesProductsSection());
    }
    @When("select a product")
    public void selectAProduct() {
        theActorInTheSpotlight().attemptsTo(SelectProduct.inTheProductSection());
    }
    @Then("the user should see the product information")
    public void theUserShouldSeeTheProductInformation(Map<String,String> compare ) {

        theActorInTheSpotlight().should(
                seeThat("the displayed name product", ProductViewCompare.lblProductName(), equalTo(compare.get("product_name")))

        );
    }

}
