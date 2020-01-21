package com.co.micuenta.tigo.tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.co.micuenta.tigo.userinterfaces.LoginTigoPage.BTN_SESSION;
import static com.co.micuenta.tigo.userinterfaces.LoginTigoPage.BTN_SIGNIN;
import static com.co.micuenta.tigo.userinterfaces.LoginTigoPage.BTN_VALIDATE;
import static com.co.micuenta.tigo.userinterfaces.LoginTigoPage.TXT_EMAIL;
import org.openqa.selenium.WebDriver;
import com.co.micuenta.tigo.interactions.generics.EnterInformation;
import com.co.micuenta.tigo.interactions.generics.ClickOn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoginTigoTask implements Task{
	
	private String strUser;
	private String strPassword;
	private WebDriver hisBrowser;
	
	public LoginTigoTask(String strUser, String strPassword, WebDriver hisBrowser) {
		this.strUser = strUser;
		this.strPassword = strPassword;
		this.hisBrowser = hisBrowser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(BTN_SIGNIN, isVisible()),
				ClickOn.element(BTN_SESSION),
				WaitUntil.the(TXT_EMAIL, isVisible()),
				EnterInformation.element(strUser, TXT_EMAIL),
				ClickOn.element(BTN_VALIDATE));
	}
	
	public static LoginTigoTask inputData(String strUser, String strPassword, WebDriver hisBrowser) {
		return instrumented(LoginTigoTask.class, strUser, strPassword, hisBrowser);
	}

}
