package com.ekaqa.automation.steps;

import com.ekaqa.automation.logging.Logging;

import static io.restassured.RestAssured.given;

public class APISteps {

    public static void sendGetRequest(String baseUrl, String urlPart, int expectedStatusCode) {
        Logging.loggerInfo("Sending GET request and asserting status code is equal to expected");
        given()
                .when()
                .get(String.format("%s%s", baseUrl, urlPart))
                .then()
                .assertThat()
                .statusCode(expectedStatusCode);
    }

    public static void sendPostRequest(String baseUrl, String urlPart, String body, int expectedStatusCode) {
        Logging.loggerInfo("Sending POST request and asserting status code is equal to expected");
        given()
                .header("Content-type", "application/json")
                .and()
                .body(body)
                .when()
                .post(String.format("%s%s", baseUrl, urlPart))
                .then()
                .assertThat()
                .statusCode(expectedStatusCode);
    }
}
