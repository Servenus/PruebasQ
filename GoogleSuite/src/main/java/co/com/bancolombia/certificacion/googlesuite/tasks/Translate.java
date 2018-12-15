package co.com.bancolombia.certificacion.googlesuite.tasks;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTrasnlatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task{

	public Translate() {
	}

	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleTrasnlatePage.SOURCE_LANGUAGE_OPTION),
				Click.on(GoogleTrasnlatePage.SOURCE_LANGUAGE), Click.on(GoogleTrasnlatePage.TARGET_LANGUAGE_OPTION),
				Click.on(GoogleTrasnlatePage.TARGET_LANGUAGE),
				Enter.theValue("Cheese").into(GoogleTrasnlatePage.SOURCE_LANGUAGE_TEXTAREA));
	}

	public static Translate the() {
		return Tasks.instrumented(Translate.class);
	}

	
}
