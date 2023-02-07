package com.geek237.quarkus.panache;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class VintageResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/vintage")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}