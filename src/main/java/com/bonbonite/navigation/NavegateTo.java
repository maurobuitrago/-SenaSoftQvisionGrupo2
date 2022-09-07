package com.bonbonite.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegateTo {

    public static Performable theBonBoniteGoToLoginAndRegister(){
        return Task.where(
                "the client pablo opens Bon Bonite register section",
                Open.browserOn().the(BonBoniteGoToLoginAndRegisterSection.class)
        );
    }
}
