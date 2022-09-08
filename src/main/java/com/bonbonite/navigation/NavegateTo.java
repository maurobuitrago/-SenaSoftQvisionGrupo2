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

    public static Performable theBonBoniteGoToShoesProductsSection(){
        return Task.where(
                "the client pablo opens Bon Bonite products section",
                Open.browserOn().the(BonBoniteGoToProductsSection.class)
        );
    }

    public static Performable theBonBoniteGoToAllProductsShoes(){
        return Task.where(
                "the client pablo opens Bon Bonite products section",
                Open.url("https://www.bon-bonite.com/categoria-producto/zapatos-mujer/")
        );
    }

    public static Performable theBonBoniteGoToAllDetailsCountSection(){
        return Task.where(
                "the client pablo opens Bon Bonite products section",
                Open.url("https://www.bon-bonite.com/mi-cuenta/edit-account/")
        );
    }
}
