package com.bonbonite.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ViewProduct {
    public static final Target CARD_PRODUCT_SHOES = Target.the("product")
            .located(By.xpath("//*[@id=\"wrapper\"]/div[5]/ul/li[3]/a/img"));

    public static final Target LBL_PRODUCT_NAME = Target.the("view label product name")
            .located(By.xpath("//*[@id=\"product-203480\"]/div[2]/div[1]/div/h1"));

    public static final Target BTN_ADD_PRODUCT_FAVORITE_LIST = Target.the("button add favorite list")
            .located(By.xpath("//*[@id=\"product-203480\"]/div[2]/div[1]/div/form/div/div[2]/div[4]/a"));

    public static final Target SELECT_SIZE = Target.the("select size")
            .located(By.xpath("//*[@id=\"pa_talla\"]"));
}
