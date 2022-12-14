package com.bonbonite.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/product/shoppingcart.feature",
        glue = "com.bonbonite.stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ShoppingCarRunner {
}
