package co.in.gorest.interactions.generics;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class EnterInformation implements Interaction {

	private String strValue;
	private Target idField;

	public EnterInformation(String strValue,Target idField) {
		this.idField = idField;
		this.strValue = strValue;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(strValue).into(idField));
	}

	public static EnterInformation element(String strValue,Target idField) {
		return Tasks.instrumented(EnterInformation.class, strValue,idField);
	}

}
