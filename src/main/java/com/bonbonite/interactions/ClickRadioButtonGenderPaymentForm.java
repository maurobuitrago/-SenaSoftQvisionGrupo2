package com.bonbonite.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRadioButtonGenderPaymentForm implements Task {

    private final Map<String, String> billing;

    public ClickRadioButtonGenderPaymentForm(Map<String, String> billing) {
        this.billing = billing;
    }


    public static ClickRadioButtonGenderPaymentForm inThePaymentFormSection(Map<String, String> billing) {
        return instrumented(ClickRadioButtonGenderPaymentForm.class, billing);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        if (billing.get("gender").contains("hombre")) {
            actor.attemptsTo(Click.on());
        }
        if (billing.get("Gender").contains("mujer")) {
            actor.attemptsTo(Click.on());
        }

    }
}
