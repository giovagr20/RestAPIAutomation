package co.in.gorest.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LogInGitHubPage extends PageObject{
	
	public static final Target TXT_USER = Target.the("TXT_USER").located(By.id("login_field"));
	public static final Target TXT_PASSWORD =  Target.the("TXT_PASSWORD").located(By.id("password"));
	public static final Target BTN_SIGNIN = Target.the("BTN_SIGNIN").located(By.id("//*[@id=\"login\"]/form/div[2]/input[8]"));
}
