package com.bonbonite.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentFormSectionPage {

    public static final Target TXT_FIRSTNAME = Target.the("text box first name")
            .located(By.id("billing_first_name"));
    public static final Target TXT_LASTNAME = Target.the("text box last name")
            .located(By.id("billing_last_name"));
    public static final Target RADIO_GENDER_MALE = Target.the("radio gender male")
            .located(By.id("billing_gender_option_1"));
    public static final Target RADIO_GENDER_FEMALE = Target.the("radio gender female")
            .located(By.id("billing_gender_option_2"));
    public static final Target TXT_USERNAME = Target.the("text box username (document number)")
            .located(By.id("billing_user_login"));
    public static final Target TXT_PHONE = Target.the("text box phone")
            .located(By.id("billing_phone"));
    public static final Target SELECT_COUNTRY = Target.the("select country")
            .located(By.xpath("/html/body/span/span/span[1]/input"));


    public static final Target LBL_PRODUCTNAME = Target.the("label producto name")
            .located(By.xpath("//*[@id=\"order_review\"]/table/tbody/tr/td[1]/div[2]"));



}
