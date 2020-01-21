package com.co.micuenta.tigo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"src/test/resources/features/micuentatigo/login_micuentatigo_csv.feature" }, 
		glue = "com.co.micuenta.tigo.stepdefinitions", 
		snippets = SnippetType.CAMELCASE)

public class LoginTigoRunner {}
