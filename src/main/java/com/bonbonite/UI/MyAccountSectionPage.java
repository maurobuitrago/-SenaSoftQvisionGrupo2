package com.bonbonite.UI;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccountSectionPage {
    public static final Target LBL_USERNAME = Target.the("label user name")
            .located(By.xpath("//*[@id='content']/div/div/div/p[1]/strong[1]"));
}
