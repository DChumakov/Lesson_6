package tests.api;

import baseEntity.BaseApiTest;
import core.ReadProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestrailApiTest extends BaseApiTest {

    @Test
    public void getAllUsers() {


        //Setup Rest Assured
        RestAssured.baseURI = ReadProperties.getUrl();

        //Setup endpoint

        String endpoint = "/index.php?/api/v2/get_users";

        given()
                .when()
                .get(endpoint)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_OK);


    }
}
