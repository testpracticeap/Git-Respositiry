package com.API.Automation.Libraries;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

import com.jayway.jsonpath.JsonPath;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonParser;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

public class JsonpathReader {

	public static String readjsonPath(String ResponseFile, String path) throws FileNotFoundException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(ResponseFile));
		Object value = JsonPath.read(obj, path);
		return (String) value;

	}

}
