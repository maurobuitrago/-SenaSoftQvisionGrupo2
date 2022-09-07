package com.bonbonite.stepsdefinitions;

import com.bonbonite.navigation.NavegateTo;
import com.bonbonite.questions.LoginAndRegisterCompare;
import com.bonbonite.questions.MyAccountCompare;
import com.bonbonite.tasks.EnterCredentialsRegisterSection;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class RegisterStepDefinition {


    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("pablo");
    }

    @Given("that the user is in the login and registration section")
    public void thatTheUserIsInTheLoginAndRegistrationSection() {
        theActorInTheSpotlight().wasAbleTo(NavegateTo.theBonBoniteGoToLoginAndRegister());
    }
    @When("the customer completes the registration process with his data")
    public void theCustomerCompletesTheRegistrationProcessWithHisData(Map<String,String> credentials) {
        theActorInTheSpotlight().attemptsTo(EnterCredentialsRegisterSection.inTheRegisterForm(credentials));
    }
    @Then("the user should see your username")
    public void theUserShouldSeeYourUsername(Map<String,String> compare) {
        theActorInTheSpotlight().should(
                seeThat("the displayed username in the my account", MyAccountCompare.lblUsername(), equalTo(compare.get("document_number")))
        );
    }

    @Then("customer should see error message and registration form")
    public void customerShouldSeeErrorMessageAndRegistrationForm(Map<String ,String> compare) {
        theActorInTheSpotlight().should(
                seeThat("the displayed error", LoginAndRegisterCompare.lblError(), equalTo(compare.get("lbl_error"))),
                seeThat("the displayed label the register form", LoginAndRegisterCompare.lblRegisterForm(), equalTo(compare.get("lbl_register_form")))
        );
    }

}
