package com.bonbonite.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AllUpdateCredentials {

    public static final Target TXT_ENTER_FIRSTNAME = Target.the("enter the first name")
            .located(By.name("account_first_name"));

    public static final Target TXT_ENTER_LASTNAME = Target.the("enter the last name")
            .located(By.id("account_last_name"));

    public static final Target TXT_ENTER_EMAIL = Target.the("enter the email")
            .located(By.id("account_email"));

    public static final Target TXT_ENTER_CURRENT_PASSWORD = Target.the("enter the password current")
            .located(By.id("password_current"));

    public static final Target TXT_ENTER_NEW_PASSWORD = Target.the("enter the new password")
            .located(By.id("password_1"));

    public static final Target TXT_ENTER_CONFIRMED_PASSWORD = Target.the("Enter the confirmed  the new password")
            .located(By.id("password_2"));


    public static final Target TXT_NUMBER_CEDULA = Target.the("Number of cedula")
            .located(By.name("1000973176"));

    public static final Target BTN_UPDATE_DATA = Target.the("click button update data")
            .located(By.name("save_account_details"));













}
