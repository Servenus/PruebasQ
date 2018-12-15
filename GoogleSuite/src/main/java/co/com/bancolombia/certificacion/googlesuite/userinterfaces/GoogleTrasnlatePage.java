package co.com.bancolombia.certificacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class GoogleTrasnlatePage {
	
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source language button").locatedBy("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]");
    public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target language button").locatedBy("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]");
    public static final Target SOURCE_LANGUAGE = Target.the("Source language").locatedBy("/html/body/div[2]/div[3]/div/div[2]/div[1]/div[2]/div/div[3]/div[50]/div[2]");
    public static final Target TARGET_LANGUAGE = Target.the("Target language").locatedBy("/html/body/div[2]/div[3]/div/div[2]/div[2]/div[2]/div/div[2]/div[30]/div[2]");
    public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("Source language textarea").located(By.id("source"));
    public static final Target TARGET_LANGUAGE_RESULT = Target.the("Target language result").locatedBy("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div/span[1]/span");

    public GoogleTrasnlatePage() {
    }
}

