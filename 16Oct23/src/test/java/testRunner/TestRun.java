package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\juhi.sinha\\eclipse-workspace\\16Oct23\\features\\Readniess.feature",
		glue={"stepDefinition"},
		tags = "@gp",
		dryRun=false,		
		plugin= {"pretty"},
		monochrome = true
		)
public class TestRun {

}
