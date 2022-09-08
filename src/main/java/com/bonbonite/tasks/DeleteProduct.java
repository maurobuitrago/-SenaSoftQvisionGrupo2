package com.bonbonite.tasks;

import com.bonbonite.UI.CartSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DeleteProduct implements Task {


    public static DeleteProduct delete(){
        return Tasks.instrumented(DeleteProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartSectionPage.BTN_DELETE_PRODUCT)
        );
    }
}
