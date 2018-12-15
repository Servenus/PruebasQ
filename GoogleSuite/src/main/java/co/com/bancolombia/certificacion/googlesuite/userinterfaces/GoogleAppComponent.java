package co.com.bancolombia.certificacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppComponent {

	public static final Target GOOGLE_APPS = Target.the("Google apps Button").located(By.id("gbwa")); 
	public static final Target GOOGLE_TRANSLATE = Target.the("Google translate").located(By.id("gb51")); 
}
