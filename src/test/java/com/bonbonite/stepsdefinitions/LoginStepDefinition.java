package com.bonbonite.stepsdefinitions;


import com.bonbonite.tasks.EnterCredentialsLoginSection;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

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

}
