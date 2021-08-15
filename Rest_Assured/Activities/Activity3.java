package api.activities;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Activity3 {
	final String rootURI = "https://petstore.swagger.io/v2/user";
	RequestSpecification requestSpec;
	Response response;
	ResponseSpecification responseSpec;
	
	@BeforeClass
	void setup() {
		requestSpec = new RequestSpecBuilder()
				.setContentType(ContentType.JSON)
				.setBaseUri(rootURI)
				.build();
		
		responseSpec = new ResponseSpecBuilder()
				.expectStatusCode(200)
				.expectContentType("application/json")
				.expectBody("status", equalTo("alive"))
				.build();
	}
	
	@DataProvider
	public Object[][] petInfoProvider() {
        // Setting parameters to pass to test case
        Object[][] testData = new Object[][] { 
            { 77272, "Riley", "alive" }, 
            { 77231, "Hansel", "alive" }
        };
        return testData;
    }
	
	
	@Test(priority=1)
	public void postPet() {
		int[] ids = {77272, 77231};
		List<String> requestBody = new ArrayList<>();
		requestBody.addAll(Arrays.asList("{\"id\":"+ids[0]+", \"name\": \"Riley\", \"status\": \"alive\"}", 
										"{\"id\":"+ids[1]+", \"name\": \"Hansel\", \"status\": \"alive\"}"));
		// Adding first pet 
		response = given().spec(requestSpec)
				.body(requestBody.get(0))
				.when().post();
		// Print 
		System.out.println(response.asPrettyString());
		
		// Adding second pet
		response = given().spec(requestSpec)
				.body(requestBody.get(1))
				.when().post();
		// Print
		System.out.println(response.asPrettyString());
		
		// Assertion
		response.then().spec(responseSpec);
	}

	@Test(dataProvider = "petInfoProvider", priority=2)
	public void gettPet(int id, String name, String status) {
		response = given().spec(requestSpec) // Use requestSpec
                .pathParam("petId", id) // Add path parameter
                .when().get("/{petId}");
		// Print 
		System.out.println(response.asPrettyString());
		// Assertion
		response.then().spec(responseSpec)
			.body("name", equalTo(name)); // Additional Assertion
	}
	
	@Test(dataProvider = "petInfoProvider", priority=3)
	public void deletePet(int id, String name, String status) {
		response = given().spec(requestSpec)
				.pathParam("petId", id)
				.when().delete("/{petId}");
		// Assertion
		response.then().spec(responseSpec);
	}
}
