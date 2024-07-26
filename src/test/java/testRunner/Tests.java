package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features",
		glue="stepDefinations",
		tags="@mytag",
		plugin= {"json:reports/cucumber.json",
				 "html:reports/cucumber.html"}
		)
public class Tests {

}
