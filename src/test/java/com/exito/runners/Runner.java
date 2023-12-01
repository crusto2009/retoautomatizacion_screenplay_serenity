package com.exito.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author CristianH
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.exito.stepDefinitions",
        tags = "@addProduct",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
