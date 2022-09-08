package com.bonbonite.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AllShoesProductsSection {
    public static final Target CARD_PRODUCT_SHOES_3 = Target.the("product")
            .located(By.xpath("//*[@id=\"wrapper\"]/div[5]/ul/li[3]/a/img"));

    public static final Target CARD_PRODUCT_SHOES_1 = Target.the("product")
            .located(By.xpath("//*[@id=\"wrapper\"]/div[5]/ul/li[1]/a/img"));

    public static final Target CARD_PRODUCT_SHOES_SIZE_3_35 = Target.the("product size")
            .located(By.xpath("//*[@id=\"wrapper\"]/div[5]/ul/li[3]/div/div[1]/div/div[3]/div[6]/div"));

    public static final Target BTN_CARD_PRODUCT_SHOES_3_BUY = Target.the("button product buy")
            .located(By.xpath("//*[@id=\"wrapper\"]/div[5]/ul/li[3]/div/div[2]/div[2]"));

    public static final Target BTN_CARD_PRODUCT_SHOES_1_SIZE = Target.the("button product buy")
            .located(By.xpath("//*[@id=\"wrapper\"]/div[5]/ul/li[1]/div/div[1]/div/div[3]/div[3]/div"));


    public static final Target BTN_CARD_PRODUCT_SHOES_1_BUY = Target.the("button product buy")
            .located(By.xpath("//*[@id=\"wrapper\"]/div[5]/ul/li[1]/div/div[2]/div[2]"));
    public static final Target BTN_VIEW_CART = Target.the("button view cart")
            .located(By.xpath("//*[@id=\"wrapper\"]/header/div[1]/div[2]/div[2]/div/div[1]/p[2]/a[1]"));

}
