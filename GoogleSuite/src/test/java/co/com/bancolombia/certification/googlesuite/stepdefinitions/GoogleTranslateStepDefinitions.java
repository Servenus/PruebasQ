package co.com.bancolombia.certification.googlesuite.stepdefinitions;

import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import co.com.bancolombia.certificacion.googlesuite.questions.ResultTrasnlate;
import co.com.bancolombia.certificacion.googlesuite.tasks.Goto;
import co.com.bancolombia.certificacion.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.googlesuite.tasks.Translate;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppComponent;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;
//import cucumber.api.DataTable;
//import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
//import net.thucydides.core.annotations.Steps;



public class GoogleTranslateStepDefinitions {
	
	@Managed(driver= "chrome")
	private WebDriver herBrowser;  //hisBrowser 

	private Actor susan = Actor.named("susan"); 
	
	private GoogleHomePage  googleHomePage;
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));
		
	}
	
	@Given("^that susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() {
	  susan.wasAbleTo(OpenTheBrowser.on(googleHomePage));
	  susan.wasAbleTo(Goto.theApp(GoogleAppComponent.GOOGLE_TRANSLATE));
	} 

	@When("^she translate the word cheese from English to Spanish$")
	public void sheTranslateTheWordCheeseFromEnglishToSpanish() {
		this.susan.wasAbleTo(Translate.the());

	}

	@Then("^she should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() {
		this.susan.should(seeThat(ResultTrasnlate.is(), equalTo("Queso")));
	}


	
	
	
	
	
}
