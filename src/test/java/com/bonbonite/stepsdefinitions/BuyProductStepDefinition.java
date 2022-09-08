package com.bonbonite.stepsdefinitions;

import com.bonbonite.navigation.NavegateTo;
import com.bonbonite.questions.PaymentSectionCompare;
import com.bonbonite.tasks.EnterCredentialsPaymentForm;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class BuyProductStepDefinition {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("pablo");
    }

    @When("enter your billing information")
    public void enterYourBillingInformation(Map<String,String> billing) {

        OnStage.theActorInTheSpotlight().attemptsTo(EnterCredentialsPaymentForm.inTheFormBilling(billing));
    }
    @Then("the user should see the products to be purchased")
    public void theUserShouldSeeTheProductsToBePurchased(Map<String,String> compare) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("the displayed label product name", PaymentSectionCompare.lblProductName(), equalTo(compare.get("product_name")+" "))
        );
    }
}
