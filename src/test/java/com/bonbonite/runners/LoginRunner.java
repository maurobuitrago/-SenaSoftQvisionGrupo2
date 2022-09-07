package com.bonbonite.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/myaccount/login.feature",
        glue = "com.bonbonite.stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@CP_031_Logout_Successful"
)
public class LoginRunner {
}
