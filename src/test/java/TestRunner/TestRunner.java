package TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.API.Automation.Libraries.Appconfig;
import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)


@CucumberOptions(features="src/test/resources/Feature",
plugin = {"pretty", "target/cucumber-reports/report.html"},
glue= {"com.APIAutomation.Stepdefinition"}
,monochrome = true,publish=true,tags="@TC-1")


public class TestRunner {

	
	
	
}
	
	
	

	
	

