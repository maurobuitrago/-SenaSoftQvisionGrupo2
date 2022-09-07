package com.bonbonite.UI;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterFormSection {

    public static final Target LBL_REGISTER_FORM = Target.the("label register")
            .located(By.xpath("//h2[text()=\"Registrarse\"]"));

    public static final Target LBL_ERROR = Target.the("label  registration")
            .located(By.xpath("//*[@id=\"content\"]/div/div/div[1]/ul/li/strong"));

    public static final Target TXT_DOCUMENT_NUMBER = Target.the("enter the document number data")
            .located(By.id("reg_username"));
    public static final Target TXT_EMAIL = Target.the("enter the email data")
            .located(By.id("reg_email"));

    public static final Target TXT_PASSWORD = Target.the("enter the password data")
            .located(By.id("reg_password"));

    public static final Target SELECT_PRIVACY = Target.the("select the privacy policy")
            .located(By.id("privacy_policy_reg"));

    public static final Target BTN_REGISTER = Target.the("click the button register form")
            .located(By.name("register"));

}
