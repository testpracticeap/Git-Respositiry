package com.API.Automation.RequestResponse;

import io.restassured.http.Method;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.API.Automation.Report.Report;

import io.restassured.path.json.JsonPath;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;
import io.restassured.response.Response;

@Component
public class RequestClient {

	@Autowired
	static

	Hooks hooks;

	@Autowired
	static Report report;

	public static String WebserviceRequest(String URL, String fileType) throws IOException {

		hooks.write(" The  Request URL is " + URL);
		Response response = RestAssured.given().contentType(fileType).log().all().when().get(URL).andReturn();
		hooks.write("The response:" + "\n" + response.prettyPrint());
		hooks.responseFileCreate(response.asString());
		return response.asString();

	}

}
