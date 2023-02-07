package com.geek237.quarkus.panache;

import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityNotFoundException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class PublisherRepositoryTest {

    @Test
    @TestTransaction
    public void shouldCreateAndFindAPublisher() {


        // Creates a Publisher
        Publisher publisher = new Publisher("name");

        // Persists the Publisher
        Publisher.persist(publisher);
        assertNotNull(publisher.id);

        // Gets the Publisher
        publisher = Publisher.findById(publisher.id);
        assertEquals("name", publisher.name);


    }

}
