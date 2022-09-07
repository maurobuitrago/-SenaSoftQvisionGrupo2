package com.bonbonite.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginFormSection {

    public static final Target TXT_DOCUMENT_NUMBER = Target.the("enter the document number data")
            .located(By.id("username"));

    public static final Target TXT_PASSWORD = Target.the("enter the password data")
            .located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("click the button login form")
            .located(By.name("login"));

    public static final Target LBL_LOGIN_FORM = Target.the("the label login form")
            .located(By.xpath("//h2[text() = \"Acceder\"]"));

}
