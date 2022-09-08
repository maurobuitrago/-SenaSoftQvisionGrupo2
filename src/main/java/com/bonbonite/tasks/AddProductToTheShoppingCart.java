package com.bonbonite.tasks;

import com.bonbonite.UI.AllShoesProductsSection;
import com.bonbonite.UI.CartSectionPage;
import com.bonbonite.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

public class AddProductToTheShoppingCart implements Task {

    public static AddProductToTheShoppingCart addProductShoppingCart(){
        return Tasks.instrumented(AddProductToTheShoppingCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(AllShoesProductsSection.CARD_PRODUCT_SHOES_1),
                Scroll.to(AllShoesProductsSection.CARD_PRODUCT_SHOES_1)
        );
        WaitElement.untilAppears(AllShoesProductsSection.BTN_CARD_PRODUCT_SHOES_1_SIZE);

        actor.attemptsTo(
                Click.on(AllShoesProductsSection.BTN_CARD_PRODUCT_SHOES_1_SIZE)
        );

        WaitElement.untilAppears(AllShoesProductsSection.BTN_CARD_PRODUCT_SHOES_1_BUY);

        actor.attemptsTo(
                Click.on(AllShoesProductsSection.BTN_CARD_PRODUCT_SHOES_1_BUY)
        );

        WaitElement.untilAppears(AllShoesProductsSection.BTN_VIEW_CART);

        actor.attemptsTo(
                Click.on(AllShoesProductsSection.BTN_VIEW_CART)
        );
    }
}
