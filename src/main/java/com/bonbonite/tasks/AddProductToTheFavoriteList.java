package com.bonbonite.tasks;

import com.bonbonite.UI.ViewProduct;
import io.cucumber.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;


public class AddProductToTheFavoriteList implements Task {

    public static AddProductToTheFavoriteList addProductToTheFavoriteList(){
        return Tasks.instrumented(AddProductToTheFavoriteList.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ViewProduct.SELECT_SIZE),
                Click.on(ViewProduct.SELECT_SIZE)
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Enter.theValue("38").into(ViewProduct.SELECT_SIZE).thenHit(Keys.ENTER));
    }
}
