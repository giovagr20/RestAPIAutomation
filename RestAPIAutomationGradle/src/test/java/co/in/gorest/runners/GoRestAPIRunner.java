package co.in.gorest.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/goresturl/go_rest_api.feature"},
        glue = "co.in.gorest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class GoRestAPIRunner {}
