package tests.api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class reqresAPITest {

    @Test
    public void simpleStepByApiTest() {
        //Setup Rest Assured
        RestAssured.baseURI = "https://reqres.in";

        //Setup endpoint
        int userID = 2;
        String endpoint = "/api/users/2" + userID;

        // Setup request Object
        RequestSpecification httpRequest = given();

        // Setup Response Object
        Response response = httpRequest.request(Method.GET, endpoint);

        // Get Response Status
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        Assert.assertEquals(statusCode, 200);
        Assert.assertEquals(statusCode, HttpStatus.SC_OK);

        // Get Response Body
        String responseBody = response.getBody().asString();
        System.out.println("Response: " + responseBody);


    } @Test
    public void simpleShortApiTest() {
        //Setup Rest Assured
        RestAssured.baseURI = "https://reqres.in";

        //Setup endpoint
        int userID = 2;
        String endpoint = "/api/users/2" + userID;

        given()
                .when()
                .get(endpoint)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body();
    }
}
