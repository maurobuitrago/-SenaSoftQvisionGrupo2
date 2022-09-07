package com.bonbonite.stepsdefinitions;


import com.bonbonite.questions.LoginAndRegisterCompare;
import com.bonbonite.tasks.EnterCredentialsLoginSection;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("pablo");
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials(Map<String ,String> credentials) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterCredentialsLoginSection.theLoginForm(credentials));
    }

    @Then("customer should see error message login form")
    public void customerShouldSeeErrorMessageLoginForm(Map<String,String> compare) {
        theActorInTheSpotlight().should(
                seeThat("the displayed error", LoginAndRegisterCompare.lblError(), equalTo(compare.get("lbl_error"))),
                seeThat("the displayed label the login form", LoginAndRegisterCompare.lblLoginForm(), equalTo(compare.get("lbl_login_form")))
        );

    }


}
