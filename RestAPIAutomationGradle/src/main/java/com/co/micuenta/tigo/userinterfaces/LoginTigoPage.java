package com.co.micuenta.tigo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

public class LoginTigoPage extends PageObject {

	public static final Target BTN_SIGNIN =  Target.the("BTN_SIGNIN").located(By.xpath("//*[@id=\"top_menu_aside\"]/nav/ul/li/a"));
	public static final Target BTN_SESSION = Target.the("BTN_SESSION").located(By.xpath("//*[@id=\"top_menu_aside\"]/nav/ul/li/ul/li/a"));
	public static final Target TXT_EMAIL = Target.the("TXT_EMAIL").located(By.id("idEmail"));
	public static final Target BTN_VALIDATE = Target.the("BTN_VALIDATE").located(By.id("continueBtn"));
}
