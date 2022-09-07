package com.bonbonite.questions;

import com.bonbonite.UI.LoginFormSection;
import com.bonbonite.UI.RegisterFormSection;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class LoginAndRegisterCompare {

    public static Question<String> lblError(){
        return actor -> TextContent.of(RegisterFormSection.LBL_ERROR).answeredBy(actor);
    }
    public static Question<String> lblRegisterForm(){
        return actor -> TextContent.of(RegisterFormSection.LBL_REGISTER_FORM).answeredBy(actor).trim().toLowerCase();
    }

    public static Question<String> lblLoginForm(){
        return actor -> TextContent.of(LoginFormSection.LBL_LOGIN_FORM).answeredBy(actor).trim().toLowerCase();
    }
}
