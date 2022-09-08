package com.bonbonite.questions;

import com.bonbonite.UI.CartSectionPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.Map;

public class CartSectionCompare {

    public static Question<Boolean> boolProduct(Map<String,String> compare){
        return actor -> CartSectionPage.LBL_PRODUCT_NAME.resolveFor(actor).getText().contains(compare.get("product_name"));
    }

    public static Question<String> lblProduct(){
        return actor -> TextContent.of(CartSectionPage.LBL_PRODUCT_NAME).answeredBy(actor).trim();
    }
}
