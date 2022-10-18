package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",plugin = { "pretty", "html:target/cucumber-reports" },
monochrome = true,publish=true,tags="@tC-1")


public class TestRunner {

	
	
	
	
	
	

	
	
}
