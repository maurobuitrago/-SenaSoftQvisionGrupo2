package com.bonbonite.tasks;

import com.bonbonite.UI.RegisterFormSection;
import com.bonbonite.interactions.WaitElement;
import io.cucumber.java.af.En;
import io.cucumber.java.af.Wanneer;
import io.cucumber.java.an.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterCredentialsRegisterSection implements Task {

    private final Map<String,String> credentials;

    public EnterCredentialsRegisterSection(Map<String, String> credentials) {
        this.credentials = credentials;
    }

    public static EnterCredentialsRegisterSection inTheRegisterForm(Map<String,String> credentials){
        return instrumented(EnterCredentialsRegisterSection.class, credentials);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credentials.get("document_number")).into(RegisterFormSection.TXT_DOCUMENT_NUMBER),
                Enter.theValue(credentials.get("email")).into(RegisterFormSection.TXT_EMAIL),
                Enter.theValue(credentials.get("password")).into(RegisterFormSection.TXT_PASSWORD),
                Scroll.to(RegisterFormSection.TXT_EMAIL)
        );

        WaitElement.untilBeEnable(RegisterFormSection.SELECT_PRIVACY);

        actor.attemptsTo(
                Click.on(RegisterFormSection.SELECT_PRIVACY),
                Click.on(RegisterFormSection.BTN_REGISTER)
        );
    }
}
