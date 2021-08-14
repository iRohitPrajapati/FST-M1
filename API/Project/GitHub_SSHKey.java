package gitHub;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GitHub_SSHKey {
	String BASE_URI = "https://api.github.com";
	final static String sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDCi5KSNKzb8i2HgOAjDtVT9+ERbt8YGhVPKHKcTbgeG4IwUu9N0n8E4KAMd4MPQCENt6UKvfU7/"
			+ "JQFRWu2wP2CzfqIzkiWT97wID+o9CBP40U9xWENT1IB26mrpX69A7TegNnFAjFPAtRe/oLfI4m4a/XUIat+fDYd/iWJb/"
			+ "ZQBhU82qThPl4VIoQgZcGXwQV5NCKuZIRq5LnIX+aanAwQQf+ZJSO7hro5FKCWFTt56EKYsIaQ67TIjb9tX3tB7TQtB69mMOjAKcoc1WkMOUT0Y1dizGO4m5PVc3D7G6QR+mCiy4lzqzxaHlC3Qf/"
			+ "wVbSfHtfcwBb2rc+NPa0U9+W+ooRU10XMonWXObLBt0BcZBlJLfsipYqZ7mBLiph0lc0ZJEixb4sRaSSt0TC3imZwqjoReJrl0jMxoIQjfwxvuyHZyjnwXuT570x+FbeTSRa8vsirOWM6OStmFvBowjIf/"
			+ "3e+SSkS/JivyC/SLa69wQxos+jcrq5Hd9E3rrC8K90=";
	int sshKeyId;
	RequestSpecification requestSpec;
	Response response;
	
	@BeforeClass
	void setUp() {
		requestSpec = new RequestSpecBuilder()
				.setContentType(ContentType.JSON)
				.setBaseUri(BASE_URI)
				.addHeader("Authorization", "token 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")
				.build();
	}
	
	@Test (priority=1)
	public void postKey() {
		String requestBody = "{\"title\":\"TestKey\""+", \"key\":\""+ sshKey +"\"}";
		response = 
				given().spec(requestSpec)
				.body(requestBody)
				.when().post("/user/keys");
		// Print response 
		System.out.println(response.asPrettyString());
		// Extract JSON path
		sshKeyId = response.jsonPath().get("id");
		
		// Assertion
		try {
			System.out.println(response.getStatusCode());
			response.then().body("#status#", equalTo(201));
		}catch(Exception e) {}
	}
	
	@Test (priority=2)
	public void getKey() {
		response = 
				given().spec(requestSpec)
				.get("/user/keys");
		// Print response
		System.out.println(response.asPrettyString());
		Reporter.log(response.asPrettyString());
		// Assertion
		try {
			System.out.println(response.getStatusCode());
			response.then().body("#status#", equalTo(200));
		}catch(Exception e) {}
	}
	
	@Test (priority=3)
	public void deleteKey() {
		response =
				given().spec(requestSpec)
				.when().pathParam("keyId", sshKeyId)
				.delete("/user/keys/{keyId}");
		// Print response
		System.err.println(response.asPrettyString());
		Reporter.log(response.asPrettyString());
		// Assertion
		try {
			System.out.println(response.getStatusCode());
			response.then().body("status", equalTo(204));
		}catch(Exception e) {}
	}
}