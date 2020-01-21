package co.in.gorest.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GoRestAPIPage extends PageObject{
	
	public static final Target BTN_LOGIN = Target.the("BTN_LOGIN").located(By.xpath("//*[@id=\"w1\"]/li[4]/a")); 
	public static final Target BTN_GITHUB = Target.the("BTN_GITHUB").located(By.xpath("//*[@id=\"w0\"]/ul/li[3]/a"));
	public static final Target LBL_USER = Target.the("LBL_USER").located(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div/div[1]/h3"));
	
}
