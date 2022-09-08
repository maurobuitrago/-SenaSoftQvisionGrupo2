package com.bonbonite.tasks;

import com.bonbonite.UI.AllUpdateCredentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.checkerframework.checker.units.qual.C;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterCredentialsUpdateForm implements Task {

    private final Map<String,String> credentials;

    public EnterCredentialsUpdateForm(Map<String, String> credentials) {
        this.credentials = credentials;
    }

    public static EnterCredentialsUpdateForm inTheFormDetailsCount(Map<String,String> credentials){
        return instrumented(EnterCredentialsUpdateForm.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(credentials.get("FirsName")).into(AllUpdateCredentials.TXT_ENTER_FIRSTNAME),
                Enter.theValue(credentials.get("LastName")).into(AllUpdateCredentials.TXT_ENTER_LASTNAME),
                Enter.theValue(credentials.get("CurrentPassword")).into(AllUpdateCredentials.TXT_ENTER_CURRENT_PASSWORD),
                Enter.theValue(credentials.get("NewPassword")).into(AllUpdateCredentials.TXT_ENTER_NEW_PASSWORD),
                Enter.theValue(credentials.get("ConfirmedNewPassword")).into(AllUpdateCredentials.TXT_ENTER_CONFIRMED_PASSWORD),
                Click.on(AllUpdateCredentials.BTN_UPDATE_DATA)
        );





    }
}
