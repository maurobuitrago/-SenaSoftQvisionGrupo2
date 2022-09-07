package com.bonbonite.tasks;

import com.bonbonite.UI.LoginFormSection;
import io.cucumber.java.af.En;
import io.cucumber.java.an.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

public class EnterCredentialsLoginSection implements Task {

    private final Map<String,String> credentials;

    public EnterCredentialsLoginSection(Map<String, String> credentials) {
        this.credentials = credentials;
    }

    public static EnterCredentialsLoginSection theLoginForm(Map<String,String> credentials){
        return Tasks.instrumented(EnterCredentialsLoginSection.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credentials.get("document_number")).into(LoginFormSection.TXT_DOCUMENT_NUMBER),
                Enter.theValue(credentials.get("password")).into(LoginFormSection.TXT_PASSWORD),
                Click.on(LoginFormSection.BTN_LOGIN)
        );
    }
}
