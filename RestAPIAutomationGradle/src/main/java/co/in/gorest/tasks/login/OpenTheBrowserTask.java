package co.in.gorest.tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowserTask implements Task{

	PageObject pageObject;
	
	public OpenTheBrowserTask(PageObject pageObject) {
		this.pageObject = pageObject;
	}	
	
	@Override
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo(Open.browserOn(pageObject));
	}
	
	public static OpenTheBrowserTask logIn(PageObject pageObject) {
		return instrumented(OpenTheBrowserTask.class, pageObject);
	}
}