package com.bonbonite.questions;

import com.bonbonite.UI.MyAccountSectionPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class MyAccountCompare {

    public static Question<String> lblUsername(){
        return actor -> TextContent.of(MyAccountSectionPage.LBL_USERNAME).answeredBy(actor);
    }

}
