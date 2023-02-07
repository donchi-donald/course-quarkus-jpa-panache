package com.geek237.quarkus.jpa;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ArtistResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/books")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}
