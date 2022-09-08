package com.bonbonite.questions;

import com.bonbonite.UI.AllUpdateCredentials;
import com.bonbonite.UI.MyAccountSectionPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class MyCredentialsCompare {

    public static Question<String> lblUsername(){
        return actor -> TextContent.of(AllUpdateCredentials.TXT_NUMBER_CEDULA).answeredBy(actor);
    }
}
