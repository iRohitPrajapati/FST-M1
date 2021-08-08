package api.activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Activity2 {
	final static String ROOT_URI = "https://petstore.swagger.io/v2/user";
	@Test(priority=1)
	public void addNewPet() throws IOException {
		// Import JSON file
		FileInputStream fis = new FileInputStream("lib/Activity2.json");
		// Read JSON file as String
		String reqBody = new String(fis.readAllBytes());
		
		Response response = 
			given().contentType(ContentType.JSON) // Set headers
	        .body(reqBody) // Add request body
	        .when().post(ROOT_URI); // Send POST request
		
		// Print response
		System.out.println(response.asPrettyString());
		
		// Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("8765"));
        
        // Close file
        fis.close();
	}
	
	@Test(priority=2)
	public void getPetInfo() {
		// Export JSON response back file
		File outputJSON = new File("lib/Activity2_Response.json");
		Response response = 
			given().contentType(ContentType.JSON)
			.when().pathParam("username", "Narayan1")
			.get(ROOT_URI + "/{username}"); // Send GET request
		
		// Print response
	    System.out.println(response.asPrettyString());
	    
	    try {
	    	// Create
	    	outputJSON.createNewFile();
	    	// Write File
	    	FileWriter writer = new FileWriter(outputJSON.getPath());
	    	writer.write(response.getBody().asPrettyString());
	    }
	    catch(IOException ioe) {
	    	ioe.printStackTrace();
	    }
		// Assertion
        response.then().body("id", equalTo(8765));
        response.then().body("username", equalTo("Narayan1"));
        response.then().body("firstName", equalTo("Justin"));
        response.then().body("lastName", equalTo("Case"));
        response.then().body("email", equalTo("justincase@mail.com"));
        response.then().body("password", equalTo("password123"));
        response.then().body("phone", equalTo("9812763450"));
	}
	
	@Test(priority=3)
    public void deletePet() {
        Response response = 
            given().contentType(ContentType.JSON)
            .when().pathParam("username", "Narayan1")
            .delete(ROOT_URI + "/{username}"); // Send DELETE request
 
        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("Narayan1"));
    }
}
