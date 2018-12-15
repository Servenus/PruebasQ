package co.com.bancolombia.certificacion.googlesuite.questions;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTrasnlatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResultTrasnlate implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		String Texto = Text.of(GoogleTrasnlatePage.TARGET_LANGUAGE_RESULT).viewedBy(actor).asString();

		return Texto;
	}

	public static ResultTrasnlate is() {
		return new ResultTrasnlate ();
	}
	
	
}
