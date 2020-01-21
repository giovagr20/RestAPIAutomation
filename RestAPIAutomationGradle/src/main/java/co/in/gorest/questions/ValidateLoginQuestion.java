package co.in.gorest.questions;

import co.in.gorest.userinterfaces.GoRestAPIPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateLoginQuestion implements Question<String> {

	
	@Override
	public String answeredBy(Actor actor) {
		if (GoRestAPIPage.LBL_USER.resolveFor(actor).getTextValue() == "giovagr20") {
			return "It's correct login";
		}
		else {
			return "Error en login";
		}
	}

	public static ValidateLoginQuestion is() {
		return new ValidateLoginQuestion();
	}

}
