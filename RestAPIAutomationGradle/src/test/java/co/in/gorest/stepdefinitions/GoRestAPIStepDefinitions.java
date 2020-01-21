package co.in.gorest.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.in.gorest.models.UserGitHubModel;
import co.in.gorest.questions.ValidateLoginQuestion;
import co.in.gorest.tasks.github.LoginGitHubTask;
import co.in.gorest.tasks.login.IntoLoginTask;
import co.in.gorest.tasks.login.NavigateWebTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoRestAPIStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor userGO = Actor.named("userGO");
	
	@Before
	public void setUp() {
		userGO.can(BrowseTheWeb.with(hisBrowser));
		UserGitHubModel.setStrPass(System.getenv().get("password"));
		UserGitHubModel.setStrUser(System.getenv().get("user"));
	}
	
	@Given("^User must logged into webpage$")
	public void userMustLoggedIntoWebpage() {
		userGO.attemptsTo(NavigateWebTask.openURL());
		try {
			userGO.attemptsTo(IntoLoginTask.logInGoogle(hisBrowser));
			userGO.attemptsTo(LoginGitHubTask.loginGitHubTask(UserGitHubModel.getStrUser(), 
					UserGitHubModel.getStrPass(), 
					hisBrowser));
			userGO.asksFor(ValidateLoginQuestion.is());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@When("^User will request a service get$")
	public void userWillRequestAServiceGet() {
		
	}

	@Then("^User will validate a correct response$")
	public void userWillValidateACorrectResponse() {

	}
}
