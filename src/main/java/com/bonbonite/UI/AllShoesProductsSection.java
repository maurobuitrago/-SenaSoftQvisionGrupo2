package com.bonbonite.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AllShoesProductsSection {
    public static final Target CARD_PRODUCT_SHOES = Target.the("product")
            .located(By.xpath("//*[@id=\"wrapper\"]/div[5]/ul/li[3]/a/img"));




}
