package co.in.gorest.tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.in.gorest.userinterfaces.GoRestAPIPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


public class NavigateWebTask implements Task{

	private GoRestAPIPage goRestAPIPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(OpenTheBrowserTask.logIn(goRestAPIPage));
	}
	
	public static NavigateWebTask openURL() {
		return instrumented(NavigateWebTask.class);
	}
}
