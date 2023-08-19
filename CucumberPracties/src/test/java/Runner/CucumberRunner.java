package Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features  = {"./src/test/java/Feature"},
		glue = {"StepDefinations"},
		dryRun = true
		)
public class CucumberRunner {

}
