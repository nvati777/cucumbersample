package testrun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="cucumdemo.feature",glue= {"stepcls"},tags= {"@datadriven"},
plugin="json:target/cucumber-report.json")
public class TestRunner {
	//@CucumberOptions(features="demo28jan.feature",glue={"stepdef"},tags= {"@RegressionTest","@smoke"},plugin="json:target/cucumber-report.json")
	//@CucumberOptions(features="cucumdemo.feature",glue= {"stepcls"},tags= {"@FunctionalTest"},
	//plugin="json:target/cucumber-report.json")
}
