package myrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Java Test Program\\FreeCRMBDDFramework\\src\\main\\java\\features\\taggedhooks.feature",
		glue= {"stepDefinitions"},
		plugin = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun = false
		)
public class TestRunner {

}
