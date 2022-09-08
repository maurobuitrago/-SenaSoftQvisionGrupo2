package com.bonbonite.questions;

import com.bonbonite.UI.PaymentFormSectionPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class PaymentSectionCompare {

    public static Question<String> lblProductName(){
        return actor -> TextContent.of(PaymentFormSectionPage.LBL_PRODUCTNAME).answeredBy(actor).trim();
    }
}
