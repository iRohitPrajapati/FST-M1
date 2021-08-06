package api.activities;

import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class Activity1 {
	final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";
	
	@Test(priority=1)
	public void addNewPet() throws IOException {
		File file = new File("lib/Activity1_CreatePet.json");
		FileInputStream fis = new FileInputStream(file);
		byte[] bytes = new byte[(int) file.length()];
		fis.read(bytes);
		String reqBody = new String(bytes, "UTF-8");
		
		Response response = 
			given().contentType(ContentType.JSON) // Set headers
	        .body(reqBody) // Add request body
	        .when().post(ROOT_URI); // Send POST request
	    
		// Assertion
        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
        
        // Close file
        fis.close();
	}
	
	@Test(priority=2)
	public void getPetInfo() {
		Response response = 
			given().contentType(ContentType.JSON)
			.when().pathParam("pedId", "77232")
			.get(ROOT_URI + "/{pedId}"); // Send GET request
		
		// Print response
	    System.out.println(response.asPrettyString());
	    
		// Assertion
        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
	}
	
	@Test(priority=3)
    public void deletePet() {
        Response response = 
            given().contentType(ContentType.JSON)
            .when().pathParam("petId", "77232")
            .delete(ROOT_URI + "/{petId}"); // Send DELETE request
 
        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("77232"));
    }
}
