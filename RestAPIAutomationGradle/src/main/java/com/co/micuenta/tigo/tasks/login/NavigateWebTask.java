package com.co.micuenta.tigo.tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.co.micuenta.tigo.userinterfaces.LoginTigoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class NavigateWebTask implements Task {

	private LoginTigoPage loginTigoPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(OpenTheBrowserTask.logIn(loginTigoPage));
	}
	
	public static NavigateWebTask openURL() {
		return instrumented(NavigateWebTask.class);
	}

	
}
