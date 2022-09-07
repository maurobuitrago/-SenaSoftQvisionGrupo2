package com.bonbonite.tasks;

import com.bonbonite.UI.MyAccountSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Logout implements Task {

    public static Logout theAplicationBonBonite(){
        return Tasks.instrumented(Logout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MyAccountSectionPage.BTN_LOGOUT)
        );
    }
}
