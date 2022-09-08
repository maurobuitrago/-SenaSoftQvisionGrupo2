package com.bonbonite.tasks;

import com.bonbonite.UI.CartSectionPage;
import com.bonbonite.UI.PaymentFormSectionPage;
import com.bonbonite.interactions.ClickRadioButtonGenderPaymentForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

public class EnterCredentialsPaymentForm implements Task {

    private final Map<String,String> billing;

    public EnterCredentialsPaymentForm(Map<String, String> billing) {
        this.billing = billing;
    }

    public static EnterCredentialsPaymentForm inTheFormBilling(Map<String,String> billing){
        return Tasks.instrumented(EnterCredentialsPaymentForm.class, billing);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CartSectionPage.SCROLLTO_SUBTOTAL),
                Click.on(CartSectionPage.BTN_CHECKOUT),
                Enter.theValue(billing.get("first_name")).into(PaymentFormSectionPage.TXT_FIRSTNAME),
                Enter.theValue(billing.get("last_name")).into(PaymentFormSectionPage.TXT_LASTNAME)
        );

        ClickRadioButtonGenderPaymentForm.inThePaymentFormSection(billing);

        actor.attemptsTo(
                Scroll.to(PaymentFormSectionPage.LBL_PRODUCTNAME)
        );
    }
}
