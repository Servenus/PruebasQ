package co.com.bancolombia.certification.googlesuite.runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/google_translate.feature",
		glue = "co.com.bancolombia.certification.googlesuite.stepdefinitions",
        snippets = SnippetType.CAMELCASE
		)

public class GoogleTranslateRunner {

}

