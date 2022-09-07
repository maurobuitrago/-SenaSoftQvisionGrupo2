package com.bonbonite.questions;

import com.bonbonite.UI.ViewProduct;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ProductViewCompare {
    public static Question<String> lblProductName(){
        return actor -> TextContent.of(ViewProduct.LBL_PRODUCT_NAME).answeredBy(actor).trim();
    }



}
