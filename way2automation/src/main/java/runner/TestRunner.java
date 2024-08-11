package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/java/features/userRoleValidation.feature", glue = { "./src/main/java/stepDefination/UserListPageStepDefination.java" },
		monochrome = true, dryRun = false)
public class TestRunner {

}
