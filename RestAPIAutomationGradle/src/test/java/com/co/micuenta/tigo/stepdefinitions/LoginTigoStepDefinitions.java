package com.co.micuenta.tigo.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.co.micuenta.tigo.models.UserTigoModel;
import com.co.micuenta.tigo.tasks.login.LoginTigoTask;
import com.co.micuenta.tigo.tasks.login.NavigateWebTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class LoginTigoStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor userTigo = Actor.named("userTigo");
	UserTigoModel userTigoModel;
	
	@Before
	public void setUp() {
		userTigo.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^User will get data from csv$")
	public void userWillGetDataFromCsv() {
		try {
			userTigo.attemptsTo(NavigateWebTask.openURL());
			userTigo.attemptsTo(LoginTigoTask.inputData(userTigoModel.getUser(),
					userTigoModel.getPassword(), hisBrowser));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Given("^User will save data in a model$")
	public void userWillSaveDataInAModel() {
	}

	@When("^User will enter his credentials$")
	public void userWillEnterHisCredentials() {
	}

	@Then("^User will be in homepage TIGO$")
	public void userWillBeInHomepageTIGO() {

	}
	
}
