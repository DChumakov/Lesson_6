package baseEntity;

import core.ReadProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BaseApiTest {

    @BeforeTest
    public void setupApiTest () {
        //Setup Rest Assured
        RestAssured.baseURI = ReadProperties.getUrl();

        // Setup request Object
        RestAssured.requestSpecification = given()
        .header(HTTP.CONTENT_TYPE, ContentType.JSON)
        .auth().preemptive().basic(ReadProperties.getUsername(), ReadProperties.getPassword());


    }
}
