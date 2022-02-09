package projeto.api.restassured;

import static org.junit.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post {
	@Test	
	public void statusCode() {
	
		RequestSpecification request = RestAssured.given();
		request.header("Content-type" , "application/json");
		JSONObject json = new JSONObject();


		json.put("job", "leader");
		
		request.body(json.toJSONString());
		Response response = request.post("https://reqres.in/api/CREATE");
		assertEquals(201, response.getStatusCode());
		System.out.println(response.asPrettyString());
		
		
}
}
