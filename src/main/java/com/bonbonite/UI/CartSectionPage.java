package com.bonbonite.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartSectionPage {

    public static final Target BTN_CHECKOUT = Target.the("the button checkout")
            .located(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/a"));

    public static final Target SCROLLTO_SUBTOTAL = Target.the("scroll to subtotal")
            .located(By.xpath("//th[text() = \"Subtotal\"]"));

    public static final Target LBL_PRODUCT_NAME = Target.the("label product name")
            .located(By.xpath("//*[@id=\"content\"]/div/div/form/table/tbody/tr[1]/td[3]"));


    public static final Target BTN_DELETE_PRODUCT = Target.the("button the delete product")
            .located(By.xpath(" //*[@id=\"content\"]/div/div/form/table/tbody/tr[1]/td[1]/a"));



}
