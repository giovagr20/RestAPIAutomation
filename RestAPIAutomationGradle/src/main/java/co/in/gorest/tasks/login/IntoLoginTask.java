package co.in.gorest.tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.in.gorest.userinterfaces.GoRestAPIPage.BTN_LOGIN;
import static co.in.gorest.userinterfaces.GoRestAPIPage.BTN_GITHUB;
import static co.in.gorest.userinterfaces.GoRestAPIPage.LBL_USER;
import org.openqa.selenium.WebDriver;

import co.in.gorest.interactions.generics.ClickOn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class IntoLoginTask implements Task{

	private WebDriver hisBrowser;
	
	public IntoLoginTask(WebDriver hisBrowser) {
		this.hisBrowser = hisBrowser;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(BTN_LOGIN, isVisible()),
				ClickOn.element(BTN_LOGIN),
				WaitUntil.the(BTN_GITHUB, isVisible()),
				ClickOn.element(BTN_GITHUB),
				WaitUntil.the(LBL_USER, isVisible()));
	}
	
	public static IntoLoginTask logInGoogle(WebDriver hisBrowser) {
		return instrumented(IntoLoginTask.class, hisBrowser);
	}
}
