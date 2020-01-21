package co.in.gorest.interactions.generics;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn implements Interaction{

	private Target idElement;
	
	public ClickOn(Target idElement) {
		this.idElement = idElement;
	}
	
	public static ClickOn element(Target idElement) {
		return Tasks.instrumented(ClickOn.class, idElement);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(idElement));
	}
	
}
