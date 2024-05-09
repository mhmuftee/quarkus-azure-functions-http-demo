package org.acme

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class GreetingResourceTest {
    @Test
    fun testHelloEndpoint() {
        given()
            .`when`()
            .get("/hello?name=test")
            .then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body(`is`("{\"message\":\"Guten Tag test\"}"))
    }

}