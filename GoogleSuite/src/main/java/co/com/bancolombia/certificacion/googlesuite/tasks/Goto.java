package co.com.bancolombia.certificacion.googlesuite.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppComponent;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
//import net.serenitybdd.screenplay.actions.Open;

public class Goto implements Task {
	
	private Target googleApp; 
	
	public Goto(Target googleApp) {
		this.googleApp = googleApp; 
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppComponent.GOOGLE_APPS));
		actor.attemptsTo(Click.on(googleApp)); 

	}

	public static Goto theApp(Target googleApp) {

		return instrumented(Goto.class, googleApp);

	}

}
