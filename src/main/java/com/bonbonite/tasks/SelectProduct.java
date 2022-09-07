package com.bonbonite.tasks;

import com.bonbonite.UI.AllShoesProductsSection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectProduct implements Task {

    public static SelectProduct inTheProductSection(){
        return Tasks.instrumented(SelectProduct.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AllShoesProductsSection.CARD_PRODUCT_SHOES)
        );
    }
}
