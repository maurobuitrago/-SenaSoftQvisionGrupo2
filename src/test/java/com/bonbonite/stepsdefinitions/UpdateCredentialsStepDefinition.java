package com.bonbonite.stepsdefinitions;

import com.bonbonite.navigation.NavegateTo;
import com.bonbonite.questions.LoginAndRegisterCompare;
import com.bonbonite.tasks.EnterCredentialsUpdateForm;
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

public class UpdateCredentialsStepDefinition {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("pablo");
    }

    @Given("that the user is in the details account section  my account")
    public void thatTheUserIsInTheDetailsAccountSectionMyAccount() {
        OnStage.theActorInTheSpotlight().wasAbleTo(NavegateTo.theBonBoniteGoToAllDetailsCountSection());
    }
    @When("user enters valid credentials in the section form")
    public void userEntersValidCredentialsInTheSectionForm(Map<String,String> credentials) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterCredentialsUpdateForm.inTheFormDetailsCount(credentials));
    }


}
