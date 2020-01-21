package co.in.gorest.tasks.github;

import org.openqa.selenium.WebDriver;

import co.in.gorest.interactions.generics.ClickOn;
import co.in.gorest.interactions.generics.EnterInformation;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.in.gorest.userinterfaces.LogInGitHubPage.BTN_SIGNIN;
import static co.in.gorest.userinterfaces.LogInGitHubPage.TXT_USER;
import static co.in.gorest.userinterfaces.LogInGitHubPage.TXT_PASSWORD;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoginGitHubTask implements Task {

	private String strUser;
	private String strPassword;
	private WebDriver hisBrowser;
	
	public LoginGitHubTask(String strUser, String strPassword, WebDriver hisBrowser) {
		this.strUser = strUser;
		this.strPassword = strPassword;
		this.hisBrowser = hisBrowser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {	
		actor.attemptsTo(WaitUntil.the(TXT_USER, isVisible()),
				EnterInformation.element(strUser, TXT_USER),
				EnterInformation.element(strPassword, TXT_PASSWORD),
				ClickOn.element(BTN_SIGNIN));
	}
	
	public static LoginGitHubTask loginGitHubTask(String strUser, String strPassword, WebDriver hisBrowser) {
		return instrumented(LoginGitHubTask.class, strUser, strPassword, hisBrowser);
	}
}
