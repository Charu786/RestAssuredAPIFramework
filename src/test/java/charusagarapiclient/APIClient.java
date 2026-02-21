package charusagarapiclient;

import charusagarapipayload.PostPayload;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class APIClient {
     // GET request
    public Response get(String endpoint) {
        return given()
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }
    //POST request with JSON body
    public Response postPost(PostPayload payload) {
        return given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post("/posts")
                .then()
                .extract()
                .response();
    }
    //PUT request with JSON body
    public Response put(String endpoint, Object body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .extract()
                .response();
    }
    //DELETE request
    public Response delete(String endpoint) {
        return given()
                .when()
                .delete(endpoint)
                .then()
                .extract()
                .response();
    }
}
