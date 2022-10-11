RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

		
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "");

		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		io.restassured.path.json.JsonPath jsonpath = response.jsonPath();
		String number = jsonpath.getString("books[0].isbn");
		System.out.println(number); // 2
		Object isbn = com.jayway.jsonpath.JsonPath.read(response.asString(), "$.books[0]");
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(isbn);
		TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {		};
		HashMap<String, Object> o = mapper.readValue(json, typeRef);
		for (Entry<String, Object> book : o.entrySet()) {

			System.out.println(" " + book.getKey() + ":" + book.getValue());
		}
