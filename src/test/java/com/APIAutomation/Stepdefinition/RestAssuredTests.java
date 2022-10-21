package com.APIAutomation.Stepdefinition;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.API.Automation.Libraries.Appconfig;
import com.API.Automation.Libraries.Baseclass;
import com.API.Automation.Libraries.JsonpathReader;
import com.API.Automation.Report.Report;
import com.API.Automation.RequestResponse.Hooks;
import com.API.Automation.RequestResponse.RequestClient;

import io.cucumber.java.en.Given;
import junit.framework.Assert;
import net.minidev.json.parser.ParseException;

public class RestAssuredTests extends Baseclass {

	@Autowired
	RequestClient requestclient;

	@Autowired
	Appconfig appconfig;

	@Autowired
	JsonpathReader jsonpathReader;

	@SuppressWarnings({ "static-access", "deprecation" })
	@Given("^Initiate a Request client To API$")
	public void GetRequest() throws InterruptedException, IOException, ParseException {

		requestclient.WebserviceRequest(appconfig.properties().getProperty("URL"),
				appconfig.properties().getProperty("filetype"));

		String ISBNvalue = jsonpathReader.readjsonPath(ResponseFilePath, appconfig.properties().getProperty("Books.ISBN"));
		Assert.assertEquals(ISBNvalue, appconfig.properties().getProperty("isbn"));
		Hooks.write(" The ISBN Value value validation: Actual:" + ISBNvalue + " "+"Expected Value : :"
				+ appconfig.properties().getProperty("isbn"));
	}

}
