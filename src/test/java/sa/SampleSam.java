package sa;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleSam {

	public static void main(String[] args) {
	
		RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/2");
		String responseBody = response.getBody().asString();
		 System.out.println("Response Body is =>  " + responseBody);
	}

}
